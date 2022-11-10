package com.example.moviesmania.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.moviesmania.api.Constants;
import com.example.moviesmania.data.TopRatedMovie;
import com.example.moviesmania.databinding.TopRatedMovieCardBinding;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B6\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007\u00a2\u0006\u0002\u0010\fJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u000b2\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0014\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/moviesmania/adapters/TopRatedMoviesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/moviesmania/adapters/TopRatedMoviesAdapter$TopRatedMoviesViewHolder;", "topRatedMoviesList", "", "Lcom/example/moviesmania/data/TopRatedMovie;", "onTopRatedMovieClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "topRatedMovie", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "_topRatedMoviesList", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateTopRatedMovies", "newTopRatedMovies", "TopRatedMoviesViewHolder", "app_debug"})
public final class TopRatedMoviesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.moviesmania.adapters.TopRatedMoviesAdapter.TopRatedMoviesViewHolder> {
    private java.util.List<com.example.moviesmania.data.TopRatedMovie> topRatedMoviesList;
    private kotlin.jvm.functions.Function1<? super com.example.moviesmania.data.TopRatedMovie, kotlin.Unit> onTopRatedMovieClick;
    private java.util.List<com.example.moviesmania.data.TopRatedMovie> _topRatedMoviesList;
    
    public TopRatedMoviesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.moviesmania.data.TopRatedMovie> topRatedMoviesList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.moviesmania.data.TopRatedMovie, kotlin.Unit> onTopRatedMovieClick) {
        super();
    }
    
    public final void updateTopRatedMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.moviesmania.data.TopRatedMovie> newTopRatedMovies) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.moviesmania.adapters.TopRatedMoviesAdapter.TopRatedMoviesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.moviesmania.adapters.TopRatedMoviesAdapter.TopRatedMoviesViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/moviesmania/adapters/TopRatedMoviesAdapter$TopRatedMoviesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/moviesmania/databinding/TopRatedMovieCardBinding;", "(Lcom/example/moviesmania/adapters/TopRatedMoviesAdapter;Lcom/example/moviesmania/databinding/TopRatedMovieCardBinding;)V", "getBinding", "()Lcom/example/moviesmania/databinding/TopRatedMovieCardBinding;", "bind", "", "topRatedMovie", "Lcom/example/moviesmania/data/TopRatedMovie;", "app_debug"})
    public final class TopRatedMoviesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.moviesmania.databinding.TopRatedMovieCardBinding binding = null;
        
        public TopRatedMoviesViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.moviesmania.databinding.TopRatedMovieCardBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.moviesmania.databinding.TopRatedMovieCardBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.moviesmania.data.TopRatedMovie topRatedMovie) {
        }
    }
}