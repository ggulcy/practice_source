package com.ggulcy.androidretrofitexample.data.factory.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/ggulcy/androidretrofitexample/data/factory/net/NetworkModule;", "", "()V", "CONNECT_TIMEOUT", "", "READ_TIMEOUT", "WRITE_TIMEOUT", "apiKey", "", "getApiKey", "()Ljava/lang/String;", "setApiKey", "(Ljava/lang/String;)V", "url", "getUrl", "setUrl", "provideApiService", "Lcom/ggulcy/androidretrofitexample/data/factory/net/ApiService;", "provideGson", "Lcom/google/gson/Gson;", "provideInterceptor", "Lokhttp3/Interceptor;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "Lretrofit2/Retrofit;", "serverUrl", "app_debug"})
public final class NetworkModule {
    private static final long CONNECT_TIMEOUT = 30L;
    private static final long WRITE_TIMEOUT = 30L;
    private static final long READ_TIMEOUT = 30L;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String url;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String apiKey;
    public static final com.ggulcy.androidretrofitexample.data.factory.net.NetworkModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiKey() {
        return null;
    }
    
    public final void setApiKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final java.lang.String serverUrl() {
        return null;
    }
    
    private final com.google.gson.Gson provideGson() {
        return null;
    }
    
    private final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    private final okhttp3.Interceptor provideInterceptor() {
        return null;
    }
    
    private final retrofit2.Retrofit provideRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ggulcy.androidretrofitexample.data.factory.net.ApiService provideApiService() {
        return null;
    }
    
    private NetworkModule() {
        super();
    }
}