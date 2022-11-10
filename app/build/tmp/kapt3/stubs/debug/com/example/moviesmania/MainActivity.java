package com.example.moviesmania;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.moviesmania.adapters.TopRatedMoviesAdapter;
import com.example.moviesmania.data.TopRatedMovie;
import com.example.moviesmania.databinding.ActivityMainBinding;
import com.example.moviesmania.viewmodel.TopRatedMoviesViewModel;
import com.example.moviesmania.viewmodel.UserCommentsViewModel;
import com.google.gson.Gson;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/example/moviesmania/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "gson", "Lcom/google/gson/Gson;", "topRatedMoviesViewModel", "Lcom/example/moviesmania/viewmodel/TopRatedMoviesViewModel;", "getTopRatedMoviesViewModel", "()Lcom/example/moviesmania/viewmodel/TopRatedMoviesViewModel;", "topRatedMoviesViewModel$delegate", "Lkotlin/Lazy;", "initializeTopRatedMoviesAdapter", "", "topRatedMoviesAdapter", "Lcom/example/moviesmania/adapters/TopRatedMoviesAdapter;", "binding", "Lcom/example/moviesmania/databinding/ActivityMainBinding;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onTopRatedMovieClick", "topRatedMovie", "Lcom/example/moviesmania/data/TopRatedMovie;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy topRatedMoviesViewModel$delegate = null;
    private final com.google.gson.Gson gson = null;
    
    public MainActivity() {
        super();
    }
    
    private final com.example.moviesmania.viewmodel.TopRatedMoviesViewModel getTopRatedMoviesViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initializeTopRatedMoviesAdapter(com.example.moviesmania.adapters.TopRatedMoviesAdapter topRatedMoviesAdapter, com.example.moviesmania.databinding.ActivityMainBinding binding) {
    }
    
    private final void onTopRatedMovieClick(com.example.moviesmania.data.TopRatedMovie topRatedMovie) {
    }
}