# practice_source


### Button & EditText Event

        //Button Event
        btn.setOnClickListener {
                Toast.makeText(this@ButtonActivity,"Button Clicked",Toast.LENGTH_LONG).show()
        }

        //EditText Event
        btn.setOnClickListener {
            var text = edit_text.text
            if(text.isNotEmpty())
                Toast.makeText(this@EditTextActivity,text,Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this@EditTextActivity,"Empty text!!",Toast.LENGTH_SHORT).show()
        }
        
###### Kotlin Extension 사용하여 binding , 클릭시 EditText String 받아와 ToastMsg Show 

# 영상 들어갈 자리 




### RecyclerView 
###### 리사이클러뷰(RecyclerView)는 "사용자가 관리하는 많은 수의 데이터 집합(Data Set)을 개별 아이템 단위로 구성하여 화면에 출력하는 뷰그룹(ViewGroup)이며, 한 화면에 표시되기 힘든 많은 수의 데이터를 스크롤 가능한 리스트로 표시해주는 위젯"
###### 기존 ListView의 리스트 항목이 갱신될 때마다 매번 아이템뷰를 새로 구성하는 단점을 보안하여 뷰를 재활용하며 수직/수평에 제한 받지 않음
![15263964435078_15139293366547_RecyclerView](https://user-images.githubusercontent.com/60222655/74812082-2b6b1980-5336-11ea-85f6-63116f600a4b.png)
###### 뷰홀더(화면에 표시될 아이템 뷰를 저장하는 객체) & 어댑터 패턴을 사용 
