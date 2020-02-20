package com.ggulcy.androidretrofitexample.data.repository

import com.ggulcy.androidretrofitexample.domain.City

class CityRepository constructor() {
    fun getCities() : List<City>{
        var citys = mutableListOf<City>()
        citys.add(City("서울", "60", "127"))
        citys.add(City("인천", "55", "124"))
        citys.add(City("대전", "67", "100"))
        citys.add(City("제주", "52", "38"))
        citys.add(City("부산", "98", "76"))

        return citys
    }


}



//서울 37.56, 126.97
//인천 37.45, 126.70
//대전 36.35, 127.38
//울산 35.53, 129.31
//부산 35.18, 129.07
//광주 35.16, 126.85
