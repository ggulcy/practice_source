## Android Retrofit Example


##### 공공데이터 API의 날씨정보를 Retrofit 네트워크 라이브러리를 이용해 구현 , LiveData를 사용하여 MVVM 형태의 구조로 개발
###### (Rx와 혼합한 구조는 다음 챕터에서 다루기 위해 임의로 사용하지 않았음)

![ezgif com-video-to-gif](https://user-images.githubusercontent.com/60222655/74941634-b59aa700-5436-11ea-9c4d-3c623d717e3b.gif)

#### 공공데이터 포털 DATA.GO.KR 의 날씨정보 오픈 API 이용
##### API 명 : 동네예보 조회 서비스 
###### 설명 : 동네예보 정보를 조회하기 위해 발표일자, 발표시각, 예보지점 X좌표, 예보지점 Y 좌표의 조회 조건으로 발표일자, 발표시각, 자료구분문자, 예보 값, 예보일자, 예보시각, 예보지점 X 좌표, 예보지점 Y 좌표의 정보를 조회하는 기능

##### URL Query Parameter 
![주석 2020-02-20 224233](https://user-images.githubusercontent.com/60222655/74939000-710d0c80-5432-11ea-8cb2-e275c9bdd9ab.png)






#### 주요 소스코드
##### NetworkModule.kt
###### OKHttpClient를 이용해 Retrofit Builder 초기화
    ...
    private fun provideGson(): Gson {
        return GsonBuilder().create()
    }
    private fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
            .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
            .addInterceptor(provideInterceptor())
            .addInterceptor(
                HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                }
            )
            .build()
    }
    
    ...
    
        private fun provideRetrofit(): Retrofit {
        val okHttpClient =
            provideOkHttpClient()
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(provideGson()))
            .baseUrl(serverUrl())
            .client(okHttpClient)
            .build()
    }
    
    ...
    
    
##### ApiService.kt 인터페이스 구현
###### API의 URL Query를 프로토콜에 맞게 설정 
     interface ApiService{
        @GET("getVilageFcst")
        fun getWeather(
            @Query("serviceKey",encoded = true) serviceKey:String,
            @Query("dataType") dataType:String,
            @Query("numOfRows") numOfRows:Int,
            @Query("pageNo") pageNo:Int,
            @Query("base_date") base_date : String,
            @Query("base_time") base_time : String,
            @Query("nx") nx:String?,
            @Query("ny") ny:String?
        ):Call<WeatherResponse>
    }
    
##### WeatherRepository.kt 
###### 실제 Data를 요청 후 필요한 데이터를 파싱해 LiveData형태로 객체 저장하여 ViewModel에 넘겨주는 역할

    fun getWeatherInfo(weatherValue: MutableLiveData<WeatherInfo>, nx: String?, ny: String?){
          var popvalue = ""
          var t3hvalue = ""
          NetworkModule.provideApiService().getWeather(
             //..
             query data 입력
             ..//
          ).enqueue(
              object: Callback<WeatherResponse> {
                  override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                      //on Fail 예외처리
                  }

                  override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {
                      response.body()!!.response.body.items.item.let {
                              //..
                              필요 데이터 파싱
                              ..//
                      }
                      //LiveData set
                      weatherValue.value = WeatherInfo(popvalue,t3hvalue)
                  }

              }
          )

      }
##### WeatherActivity.kt 
###### LiveData Observe
    fun setViewModelObserver(){
        weatherViewModel.weatherValue.observe(this, Observer {
            tv_pop.text = "강수 확률 ${it.POP} %"
            tv_t3h.text = "현재 온도 ${it.T3H} 도"

        })
        weatherViewModel.cityValue.observe(this, Observer {
            weatherListAdapter.collection = it
        })
        weatherViewModel.cityName.observe(this, Observer {
            tv_city_name.text = "< ${it} >의 날씨 정보"
        })

    }
