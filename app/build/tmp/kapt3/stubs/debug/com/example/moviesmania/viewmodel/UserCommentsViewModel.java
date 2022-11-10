package com.example.moviesmania.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.moviesmania.commentsRoom.UserCommentsEntity;
import com.example.moviesmania.repositories.UserCommentsRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u0010\u001a\u00020\u000eH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/moviesmania/viewmodel/UserCommentsViewModel;", "Landroidx/lifecycle/ViewModel;", "userCommentsRepository", "Lcom/example/moviesmania/repositories/UserCommentsRepository;", "(Lcom/example/moviesmania/repositories/UserCommentsRepository;)V", "_userComments", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/moviesmania/commentsRoom/UserCommentsEntity;", "userComments", "Landroidx/lifecycle/LiveData;", "getUserComments", "()Landroidx/lifecycle/LiveData;", "addComment", "", "userCommentsEntity", "getUpdatedComments", "app_debug"})
public final class UserCommentsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.moviesmania.repositories.UserCommentsRepository userCommentsRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.moviesmania.commentsRoom.UserCommentsEntity>> _userComments = null;
    
    @javax.inject.Inject()
    public UserCommentsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.moviesmania.repositories.UserCommentsRepository userCommentsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.moviesmania.commentsRoom.UserCommentsEntity>> getUserComments() {
        return null;
    }
    
    private final void getUpdatedComments() {
    }
    
    public final void addComment(@org.jetbrains.annotations.NotNull()
    com.example.moviesmania.commentsRoom.UserCommentsEntity userCommentsEntity) {
    }
}