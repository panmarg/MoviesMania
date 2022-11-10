package com.example.moviesmania.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.moviesmania.data.TopRatedMovie;
import com.example.moviesmania.repositories.TopRatedMoviesRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/moviesmania/viewmodel/TopRatedMoviesViewModel;", "Landroidx/lifecycle/ViewModel;", "topRatedMoviesRepository", "Lcom/example/moviesmania/repositories/TopRatedMoviesRepository;", "(Lcom/example/moviesmania/repositories/TopRatedMoviesRepository;)V", "_topRatedMoviesList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/moviesmania/data/TopRatedMovie;", "topRatedMoviesList", "Landroidx/lifecycle/LiveData;", "getTopRatedMoviesList", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class TopRatedMoviesViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.moviesmania.repositories.TopRatedMoviesRepository topRatedMoviesRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.moviesmania.data.TopRatedMovie>> _topRatedMoviesList = null;
    
    @javax.inject.Inject()
    public TopRatedMoviesViewModel(@org.jetbrains.annotations.NotNull()
    com.example.moviesmania.repositories.TopRatedMoviesRepository topRatedMoviesRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.moviesmania.data.TopRatedMovie>> getTopRatedMoviesList() {
        return null;
    }
}