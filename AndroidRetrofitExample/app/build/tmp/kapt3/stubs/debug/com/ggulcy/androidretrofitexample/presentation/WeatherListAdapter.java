package com.ggulcy.androidretrofitexample.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u0016\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u00112\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001aH\u0016R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR7\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006#"}, d2 = {"Lcom/ggulcy/androidretrofitexample/presentation/WeatherListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ggulcy/androidretrofitexample/presentation/WeatherListAdapter$CustomViewHolder;", "()V", "value", "", "Lcom/ggulcy/androidretrofitexample/domain/City;", "collection", "getCollection", "()Ljava/util/List;", "setCollection", "(Ljava/util/List;)V", "onItemClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "addItem", "list", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CustomViewHolder", "app_debug"})
public final class WeatherListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ggulcy.androidretrofitexample.presentation.WeatherListAdapter.CustomViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.ggulcy.androidretrofitexample.domain.City> collection;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.ggulcy.androidretrofitexample.domain.City, kotlin.Unit> onItemClick;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ggulcy.androidretrofitexample.domain.City> getCollection() {
        return null;
    }
    
    public final void setCollection(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ggulcy.androidretrofitexample.domain.City> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.ggulcy.androidretrofitexample.domain.City, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.ggulcy.androidretrofitexample.domain.City, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ggulcy.androidretrofitexample.presentation.WeatherListAdapter.CustomViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ggulcy.androidretrofitexample.presentation.WeatherListAdapter.CustomViewHolder holder, int position) {
    }
    
    public final void addItem(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ggulcy.androidretrofitexample.domain.City> list) {
    }
    
    public WeatherListAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/ggulcy/androidretrofitexample/presentation/WeatherListAdapter$CustomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Lcom/ggulcy/androidretrofitexample/presentation/WeatherListAdapter;Landroid/view/ViewGroup;)V", "tvCity", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getTvCity", "()Landroid/widget/TextView;", "app_debug"})
    public final class CustomViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView tvCity = null;
        
        public final android.widget.TextView getTvCity() {
            return null;
        }
        
        public CustomViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            super(null);
        }
    }
}