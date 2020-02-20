package com.ggulcy.androidretrofitexample.data.factory.net

import com.google.gson.annotations.SerializedName

class WeatherResponse {
    @SerializedName("response")
    var response: Response =
        Response()
    class Response {
        var header: Header =
            Header()
        var body: Body =
            Body()


        class Header {
            var resultCode: String = ""
            var resultMsg: String = ""
        }

        class Body {
            var dataType: String = ""
            var items: Items =
                Items()
        }

        class Items{
            var item:List<Item> = emptyList()
        }

        data class Item(
            var baseData: String? = null,
            var baseTime: String? = null,
            var category: String? = null,
            var fcstDate: String? = null,
            var fcstTime: String? = null,
            var fcstValue:String? = null,
            var nx: String? = null,
            var ny: String? = null
        )


    }
}



