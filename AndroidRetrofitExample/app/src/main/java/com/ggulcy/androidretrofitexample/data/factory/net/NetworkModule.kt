package com.ggulcy.androidretrofitexample.data.factory.net
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


object NetworkModule {

    private const val CONNECT_TIMEOUT = 30L
    private const val WRITE_TIMEOUT = 30L
    private const val READ_TIMEOUT = 30L
    var url: String = "http://apis.data.go.kr/1360000/VilageFcstInfoService/"
    var apiKey: String = "6ZB4PZUo0gBeGt1BQvmC2aT32XkDjbRujjgM6sdUaE12FjStd5uUnimYc5yg3uuv8iLtDJHgxNbFGcEsNZ3ZXg%3D%3D"

    private fun serverUrl(): String {
        return url
    }


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

    private fun provideInterceptor():Interceptor{
        return Interceptor {
            val builder: Request.Builder = it.request().newBuilder()
                .addHeader("Content-Type","application/json; charset=utf-8")
                .addHeader("Accept","application/json; charset=utf-8")
            it.proceed(builder.build())
        }
    }
    private fun provideRetrofit(): Retrofit {
        val okHttpClient =
            provideOkHttpClient()
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(provideGson()))
            .baseUrl(serverUrl())
            .client(okHttpClient)
            .build()
    }

    fun provideApiService(): ApiService {
        return provideRetrofit()
            .create(ApiService::class.java)
    }

}