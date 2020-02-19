## Android Architecture Pattern


###### 햄버거의 패티와 빵을 선택 후 햄버거를 만드는 간단한 예제를 MVC , MVP , MVVM 3가지 형태로 구현
![hambugger](https://user-images.githubusercontent.com/60222655/74834482-d2fc4200-535e-11ea-9926-d8b4ede42824.gif)


#### 1. MVC Model

###### 사용자의 Input이 Controller에 전달
###### Controller는 사용자의 Input을 확인하고 Model을 업데이트 
###### Controller는 Model을 나타내줄 View를 선택 
###### View는 Model을 이용하여 화면을 나타냄
![mvc](https://user-images.githubusercontent.com/60222655/74833221-64b68000-535c-11ea-9eac-8e100b649e3e.png)

###### 장점 : 단순하여 보편적으로 많이 쓰임 
###### 단점 : Viwe와 Model사이의 의존성이 높음, View와 Model의 높은 의존성으로 규모가 큰 프로젝트에서 복잡하고 유지보수가 어려워질 수 있음 

    btn_make.setOnClickListener {
                tv_result.run {
                    when {
                        bugger.petty == null -> text = "petty를 선택해주세요 "
                        bugger.bread == null -> text = "bread를 선택해주세요"
                        else -> text = bugger.bread.toString() + " 빵의 " + bugger.petty.toString() + " 햄버거가 만들어졌습니다"
                    }
                }
            }
            
            

#### 2. MVP Model
###### 사용자의 Input이 View를 통해 들어옴 
###### View는 데이터를 Presenter에 요청 
###### Presneter는 Model에게 데이터를 요청 
###### Model은 Presenter에게 받은 데이터를 응답
###### Presenter는 View에게 데이터를 응답
###### View는 응답한 데이터를 이용하여 화면을 나타냄
![mvp](https://user-images.githubusercontent.com/60222655/74833222-64b68000-535c-11ea-8e56-65988af896bc.png)

###### 장점 : View와 Model의 의존성이 없음, MVC의 의존성 문제를 해결 
###### 단점 : View와 Presenter의 의존성이 높아지고 View : Presneter = 1:1 때문에 중복되는 코드들이 늘어남 
    
    
    //MainPresenter.kt
    
    class MainPresenter constructor(mainView: MainView){
        private var view: MainView? = mainView
        private var bugger = Bugger()

        fun getResult(param1:String , param2:String){
            bugger.apply {

              // business logic

            }
            view?.showResult("${bugger.bread} 빵의 ${bugger.petty} 햄버거가 만들어졌습니다")
        }
    }
    
    //MainActivity.kt
      //..
      mainPresenter.getResult(selectedBugger.text.toString(),selectedBread.text.toString())
      //..
      
      
#### 3. MVVM Model
###### 사용자의 Input이 View를 통해 들어옴
###### View에 Action이 들어오면, Command 패턴으로 View Model에 Input을 전달합니다.
###### View Model은 Model에게 데이터를 요청합니다.
###### Model은 View Model에게 요청받은 데이터를 응답합니다.
###### View Model은 응답 받은 데이터를 가공하여 저장합니다.
###### View는 View Model과 Data Binding하여 화면을 나타냅니다.

![mvvm](https://user-images.githubusercontent.com/60222655/74833218-63855300-535c-11ea-89df-15c4b386112f.png)

###### 장점 : View와 Model사이의 의존성이 없으며 Command(실행될 기능을 캡슐화함으로써 주어진 여러 기능을 실행할 수 있는 재사용성이 높은 클래스를 설계하는 패턴) 패턴과 DataBinding을 사용하여 View와 ViewModel사이의 의존성 또한 없어짐, 모듈화가 가능
###### 단점 : ViewModel의 설계가 쉽지 않음

    //MainViewModel.kt
    class MainViewModel constructor(): ViewModel(){

        private var bugger = Bugger()

        fun getResult(param1:String , param2:String):LiveData<String>{
            bugger.apply {
               //business logic
            }
             return MutableLiveData<String>().apply {
                value = "${bugger.bread} 빵의 ${bugger.petty} 햄버거가 만들어졌습니다"
            }
        }

    }
    
    //MainActivity.kt
      mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)


        btn_make.setOnClickListener {
            val selectedBugger: RadioButton? = findViewById<RadioButton>(rg_bugger.checkedRadioButtonId)
            val selectedBread: RadioButton? = findViewById<RadioButton>(rg_bread.checkedRadioButtonId)
            mainViewModel.getResult(selectedBugger?.text.toString() , selectedBread?.text.toString()).observe(this@MainActivity,Observer<String>{
                tv_result.text = it.toString()
            })
        }



