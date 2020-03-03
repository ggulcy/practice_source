package com.ggulcy.androidretrofitexample.data.factory.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001Jb\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/ggulcy/androidretrofitexample/data/factory/net/ApiService;", "", "getWeather", "Lretrofit2/Call;", "Lcom/ggulcy/androidretrofitexample/data/factory/net/WeatherResponse;", "serviceKey", "", "dataType", "numOfRows", "", "pageNo", "base_date", "base_time", "nx", "ny", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getVilageFcst")
    public abstract retrofit2.Call<com.ggulcy.androidretrofitexample.data.factory.net.WeatherResponse> getWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "serviceKey", encoded = true)
    java.lang.String serviceKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "dataType")
    java.lang.String dataType, @retrofit2.http.Query(value = "numOfRows")
    int numOfRows, @retrofit2.http.Query(value = "pageNo")
    int pageNo, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "base_date")
    java.lang.String base_date, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "base_time")
    java.lang.String base_time, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "nx")
    java.lang.String nx, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "ny")
    java.lang.String ny);
}