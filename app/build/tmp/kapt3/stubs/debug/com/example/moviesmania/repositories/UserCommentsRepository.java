package com.example.moviesmania.repositories;

import com.example.moviesmania.commentsRoom.UserCommentsDao;
import com.example.moviesmania.commentsRoom.UserCommentsEntity;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/moviesmania/repositories/UserCommentsRepository;", "", "addComment", "", "userCommentsEntity", "Lcom/example/moviesmania/commentsRoom/UserCommentsEntity;", "(Lcom/example/moviesmania/commentsRoom/UserCommentsEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserComments", "Lkotlinx/coroutines/flow/Flow;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UserCommentsRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserComments(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.example.moviesmania.commentsRoom.UserCommentsEntity>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addComment(@org.jetbrains.annotations.NotNull()
    com.example.moviesmania.commentsRoom.UserCommentsEntity userCommentsEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}