package com.ggulcy.androidretrofitexample.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0007R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR\u0010\u0010\u0013\u001a\u00020\u00148\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lcom/ggulcy/androidretrofitexample/presentation/WeatherViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "cityName", "Landroidx/lifecycle/MutableLiveData;", "", "getCityName", "()Landroidx/lifecycle/MutableLiveData;", "setCityName", "(Landroidx/lifecycle/MutableLiveData;)V", "cityRepository", "Lcom/ggulcy/androidretrofitexample/data/repository/CityRepository;", "cityValue", "", "Lcom/ggulcy/androidretrofitexample/domain/City;", "getCityValue", "setCityValue", "weatherRepository", "Lcom/ggulcy/androidretrofitexample/data/repository/WeatherRepository;", "weatherValue", "Lcom/ggulcy/androidretrofitexample/domain/WeatherInfo;", "getWeatherValue", "setWeatherValue", "", "name", "setWeather", "nx", "ny", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.ggulcy.androidretrofitexample.data.repository.CityRepository cityRepository = null;
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final com.ggulcy.androidretrofitexample.data.repository.WeatherRepository weatherRepository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ggulcy.androidretrofitexample.domain.WeatherInfo> weatherValue;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.ggulcy.androidretrofitexample.domain.City>> cityValue;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> cityName;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ggulcy.androidretrofitexample.domain.WeatherInfo> getWeatherValue() {
        return null;
    }
    
    public final void setWeatherValue(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ggulcy.androidretrofitexample.domain.WeatherInfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.ggulcy.androidretrofitexample.domain.City>> getCityValue() {
        return null;
    }
    
    public final void setCityValue(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.ggulcy.androidretrofitexample.domain.City>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCityName() {
        return null;
    }
    
    public final void setCityName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final void setWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String nx, @org.jetbrains.annotations.NotNull()
    java.lang.String ny) {
    }
    
    public final void setCityName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public WeatherViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}