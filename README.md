
### 코딩테스트 문제 풀이 

##### #1 모의고사 (프로그래머스 Lv1) [문제링크](https://programmers.co.kr/learn/courses/30/lessons/42840)
##### #2 체육복 (프로그래머스 Lv1) [문제링크](https://programmers.co.kr/learn/courses/30/lessons/42862)
##### #3 K번째수 (프로그래머스 Lv1) [문제링크](https://programmers.co.kr/learn/courses/30/lessons/42748)
##### #4 K번째수 (프로그래머스 Lv1) [문제링크](https://programmers.co.kr/learn/courses/30/lessons/42748)
##### #5 2016년 (프로그래머스 Lv1) [문제링크](https://programmers.co.kr/learn/courses/30/lessons/12901)

###
### Kotlin Practice Source


#### #1 유용한 함수들


##### let example
###### 함수를 호출하는 객체를 이어지는 블록의 인자로 넘기고, 블록의 결과값을 반환

        var customView: View? = null
        val padding = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, 16f, resources.displayMetrics).toInt()
        customView?.setPadding(padding,0,padding,0)


        TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,16f,resources.displayMetrics).toInt().let {
            customView?.setPadding(it,0,it,0)
        }

##### apply example
###### 함수를 호출하는 객체를 이어지는 볼록의 '리시버'로 전달하고, 객체 자체를 변환
###### 리시버란 , 바로 이어지는 블록 내에서 메서드 및 속성에 바로 접근할 수 있도록 할 객체를 의미
        val param = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT)
        param.gravity = Gravity.CENTER
        param.weight = 1f
        param.topMargin = 100
        param.bottomMargin = 100

        val mParam = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT).apply {
            gravity = Gravity.CENTER_HORIZONTAL
            weight = 1f
            topMargin = 100
            bottomMargin = 100
        }

##### run example
###### 인자가 없는 익명 함수처럼 동작하는 형태와 객체에서 호출하는 형태 두가지
###### apply의 경우 객체각 생성될때 셋팅해주는 형태라면 run은 객체 생성후 그 객체를 연속 작업하는 형태

        supportActionBar?.run {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_launcher_background)
        }

##### with example
###### 인자로 받는 객체를 이어지는 블록의 리시버로 전달하며, 블록의 결과값을 반환
###### run 함수와 기능이 동이랗며 리시버로 전달할 객체가 어디에 위치하는지만 다름

        supportActionBar?.let {
            with(it){
                setDisplayHomeAsUpEnabled(true)
            }
        }




