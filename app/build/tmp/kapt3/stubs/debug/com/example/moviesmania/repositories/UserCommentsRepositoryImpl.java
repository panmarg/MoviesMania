package com.example.moviesmania.repositories;

import com.example.moviesmania.commentsRoom.UserCommentsDao;
import com.example.moviesmania.commentsRoom.UserCommentsEntity;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/moviesmania/repositories/UserCommentsRepositoryImpl;", "Lcom/example/moviesmania/repositories/UserCommentsRepository;", "userCommentsDao", "Lcom/example/moviesmania/commentsRoom/UserCommentsDao;", "(Lcom/example/moviesmania/commentsRoom/UserCommentsDao;)V", "addComment", "", "userCommentsEntity", "Lcom/example/moviesmania/commentsRoom/UserCommentsEntity;", "(Lcom/example/moviesmania/commentsRoom/UserCommentsEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserComments", "Lkotlinx/coroutines/flow/Flow;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserCommentsRepositoryImpl implements com.example.moviesmania.repositories.UserCommentsRepository {
    private final com.example.moviesmania.commentsRoom.UserCommentsDao userCommentsDao = null;
    
    @javax.inject.Inject()
    public UserCommentsRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.moviesmania.commentsRoom.UserCommentsDao userCommentsDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUserComments(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.example.moviesmania.commentsRoom.UserCommentsEntity>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addComment(@org.jetbrains.annotations.NotNull()
    com.example.moviesmania.commentsRoom.UserCommentsEntity userCommentsEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}