## Android 기본 UI


#### Button & EditText Event

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




#### RecyclerView 
###### 리사이클러뷰(RecyclerView)는 "사용자가 관리하는 많은 수의 데이터 집합(Data Set)을 개별 아이템 단위로 구성하여 화면에 출력하는 뷰그룹(ViewGroup)이며, 한 화면에 표시되기 힘든 많은 수의 데이터를 스크롤 가능한 리스트로 표시해주는 위젯"
###### 기존 ListView의 리스트 항목이 갱신될 때마다 매번 아이템뷰를 새로 구성하는 단점을 보안하여 뷰를 재활용하며 수직/수평에 제한 받지 않음
![주석 2020-02-19 170018](https://user-images.githubusercontent.com/60222655/74813858-5a36bf00-5339-11ea-81d6-bb0fde71dc7a.png)
###### 뷰홀더(화면에 표시될 아이템 뷰를 저장하는 객체) & 어댑터 패턴을 사용 

    //Custom View Holder
    inner class CustomViewHolder(parent:ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)){
        val tvTitle = itemView.title
        val tvContent = itemView.content
    }
    
    // onBindViewHolder
        override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val data = collection[position]
        holder.apply {
            itemView.setOnClickListener {
                onItemClick?.invoke(data)
            }
            with(data){
                tvTitle.text = title
                tvContent.text = content
            }
        }
    }

# 영상 들어갈자리 


#### ViewPager Tab 
![주석 2020-02-19 165042](https://user-images.githubusercontent.com/60222655/74813162-332bbd80-5338-11ea-81b1-eed754707dd7.png)
###### 뷰페이저(ViewPager)는 데이터를 페이지 단위로 표시하고, 좌/우 뒤집기(flip)을 통해 페이지를 전환할 수 있도록 만들어주는 컨테이너
###### TabLayout과 혼합하여 스와이프가 가능한 탭 화면을 구성 가능 

# 영상 들어갈 자리
