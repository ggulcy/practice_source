package com.ggulcy.androidretrofitexample.data.repository;

import java.lang.System;

@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J(\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/ggulcy/androidretrofitexample/data/repository/WeatherRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getCurrentDate", "", "getWeatherInfo", "", "weatherValue", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ggulcy/androidretrofitexample/domain/WeatherInfo;", "nx", "ny", "app_debug"})
public final class WeatherRepository {
    
    public final void getWeatherInfo(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ggulcy.androidretrofitexample.domain.WeatherInfo> weatherValue, @org.jetbrains.annotations.Nullable()
    java.lang.String nx, @org.jetbrains.annotations.Nullable()
    java.lang.String ny) {
    }
    
    private final java.lang.String getCurrentDate() {
        return null;
    }
    
    public WeatherRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}