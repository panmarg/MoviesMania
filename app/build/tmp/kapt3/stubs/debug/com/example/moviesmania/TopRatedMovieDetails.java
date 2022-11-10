package com.example.moviesmania;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.example.moviesmania.api.Constants;
import com.example.moviesmania.data.TopRatedMovie;
import com.example.moviesmania.databinding.ActivityTopRatedMovieDetailsBinding;
import com.example.moviesmania.fragments.AddCommentFragment;
import com.example.moviesmania.fragments.UserCommentsFragment;
import com.example.moviesmania.viewmodel.UserCommentsViewModel;
import com.google.gson.Gson;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/moviesmania/TopRatedMovieDetails;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "gson", "Lcom/google/gson/Gson;", "fragmentToDisplay", "", "fragment", "Landroidx/fragment/app/Fragment;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class TopRatedMovieDetails extends androidx.appcompat.app.AppCompatActivity {
    private final com.google.gson.Gson gson = null;
    
    public TopRatedMovieDetails() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void fragmentToDisplay(androidx.fragment.app.Fragment fragment) {
    }
}