package com.example.moviesmania.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.example.moviesmania.commentsRoom.UserCommentsEntity;
import com.example.moviesmania.databinding.UserCommentBinding;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\tH\u0016J\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0014\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/moviesmania/adapters/UserCommentsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/moviesmania/adapters/UserCommentsAdapter$UserCommentsViewHolder;", "userCommentsList", "", "Lcom/example/moviesmania/commentsRoom/UserCommentsEntity;", "(Ljava/util/List;)V", "_userCommentsList", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateUserCommentsList", "newUserCommentsList", "UserCommentsViewHolder", "app_debug"})
public final class UserCommentsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.moviesmania.adapters.UserCommentsAdapter.UserCommentsViewHolder> {
    private final java.util.List<com.example.moviesmania.commentsRoom.UserCommentsEntity> userCommentsList = null;
    private java.util.List<com.example.moviesmania.commentsRoom.UserCommentsEntity> _userCommentsList;
    
    public UserCommentsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.moviesmania.commentsRoom.UserCommentsEntity> userCommentsList) {
        super();
    }
    
    public final void updateUserCommentsList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.moviesmania.commentsRoom.UserCommentsEntity> newUserCommentsList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.moviesmania.adapters.UserCommentsAdapter.UserCommentsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.moviesmania.adapters.UserCommentsAdapter.UserCommentsViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/moviesmania/adapters/UserCommentsAdapter$UserCommentsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/moviesmania/databinding/UserCommentBinding;", "(Lcom/example/moviesmania/adapters/UserCommentsAdapter;Lcom/example/moviesmania/databinding/UserCommentBinding;)V", "getBinding", "()Lcom/example/moviesmania/databinding/UserCommentBinding;", "bind", "", "userCommentsEntity", "Lcom/example/moviesmania/commentsRoom/UserCommentsEntity;", "app_debug"})
    public final class UserCommentsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.moviesmania.databinding.UserCommentBinding binding = null;
        
        public UserCommentsViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.moviesmania.databinding.UserCommentBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.moviesmania.databinding.UserCommentBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.moviesmania.commentsRoom.UserCommentsEntity userCommentsEntity) {
        }
    }
}