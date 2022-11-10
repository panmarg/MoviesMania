package com.example.moviesmania.repositories;

import com.example.moviesmania.api.ApiInterface;
import com.example.moviesmania.data.TopRatedMovie;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/moviesmania/repositories/TopRatedMoviesRepositoryImpl;", "Lcom/example/moviesmania/repositories/TopRatedMoviesRepository;", "apiInterface", "Lcom/example/moviesmania/api/ApiInterface;", "(Lcom/example/moviesmania/api/ApiInterface;)V", "getTopRatedMoviesList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/moviesmania/data/TopRatedMovie;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TopRatedMoviesRepositoryImpl implements com.example.moviesmania.repositories.TopRatedMoviesRepository {
    private final com.example.moviesmania.api.ApiInterface apiInterface = null;
    
    @javax.inject.Inject()
    public TopRatedMoviesRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.moviesmania.api.ApiInterface apiInterface) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTopRatedMoviesList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.example.moviesmania.data.TopRatedMovie>>> continuation) {
        return null;
    }
}