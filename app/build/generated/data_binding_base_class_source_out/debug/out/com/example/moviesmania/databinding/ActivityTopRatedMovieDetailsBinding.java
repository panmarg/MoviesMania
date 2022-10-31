// Generated by view binder compiler. Do not edit!
package com.example.moviesmania.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.moviesmania.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTopRatedMovieDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout clBackArrow;

  @NonNull
  public final ConstraintLayout clIMDBRating;

  @NonNull
  public final ConstraintLayout clTopRatedMovieDetails;

  @NonNull
  public final ConstraintLayout clTopRatedMovieDetailsImage;

  @NonNull
  public final ConstraintLayout clTopRatedMovieStoryline;

  @NonNull
  public final ImageView ivTopRatedMovieDetailsImage;

  @NonNull
  public final TextView tvIMDBRating;

  @NonNull
  public final TextView tvTopRatedMovieLanguageReleaseDate;

  @NonNull
  public final TextView tvTopRatedMovieStorylineDetails;

  @NonNull
  public final TextView tvTopRatedMovieStorylineTitle;

  @NonNull
  public final TextView tvTopRatedMovieTitle;

  private ActivityTopRatedMovieDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout clBackArrow, @NonNull ConstraintLayout clIMDBRating,
      @NonNull ConstraintLayout clTopRatedMovieDetails,
      @NonNull ConstraintLayout clTopRatedMovieDetailsImage,
      @NonNull ConstraintLayout clTopRatedMovieStoryline,
      @NonNull ImageView ivTopRatedMovieDetailsImage, @NonNull TextView tvIMDBRating,
      @NonNull TextView tvTopRatedMovieLanguageReleaseDate,
      @NonNull TextView tvTopRatedMovieStorylineDetails,
      @NonNull TextView tvTopRatedMovieStorylineTitle, @NonNull TextView tvTopRatedMovieTitle) {
    this.rootView = rootView;
    this.clBackArrow = clBackArrow;
    this.clIMDBRating = clIMDBRating;
    this.clTopRatedMovieDetails = clTopRatedMovieDetails;
    this.clTopRatedMovieDetailsImage = clTopRatedMovieDetailsImage;
    this.clTopRatedMovieStoryline = clTopRatedMovieStoryline;
    this.ivTopRatedMovieDetailsImage = ivTopRatedMovieDetailsImage;
    this.tvIMDBRating = tvIMDBRating;
    this.tvTopRatedMovieLanguageReleaseDate = tvTopRatedMovieLanguageReleaseDate;
    this.tvTopRatedMovieStorylineDetails = tvTopRatedMovieStorylineDetails;
    this.tvTopRatedMovieStorylineTitle = tvTopRatedMovieStorylineTitle;
    this.tvTopRatedMovieTitle = tvTopRatedMovieTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTopRatedMovieDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTopRatedMovieDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_top_rated_movie_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTopRatedMovieDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.clBackArrow;
      ConstraintLayout clBackArrow = ViewBindings.findChildViewById(rootView, id);
      if (clBackArrow == null) {
        break missingId;
      }

      id = R.id.clIMDBRating;
      ConstraintLayout clIMDBRating = ViewBindings.findChildViewById(rootView, id);
      if (clIMDBRating == null) {
        break missingId;
      }

      id = R.id.clTopRatedMovieDetails;
      ConstraintLayout clTopRatedMovieDetails = ViewBindings.findChildViewById(rootView, id);
      if (clTopRatedMovieDetails == null) {
        break missingId;
      }

      id = R.id.clTopRatedMovieDetailsImage;
      ConstraintLayout clTopRatedMovieDetailsImage = ViewBindings.findChildViewById(rootView, id);
      if (clTopRatedMovieDetailsImage == null) {
        break missingId;
      }

      id = R.id.clTopRatedMovieStoryline;
      ConstraintLayout clTopRatedMovieStoryline = ViewBindings.findChildViewById(rootView, id);
      if (clTopRatedMovieStoryline == null) {
        break missingId;
      }

      id = R.id.ivTopRatedMovieDetailsImage;
      ImageView ivTopRatedMovieDetailsImage = ViewBindings.findChildViewById(rootView, id);
      if (ivTopRatedMovieDetailsImage == null) {
        break missingId;
      }

      id = R.id.tvIMDBRating;
      TextView tvIMDBRating = ViewBindings.findChildViewById(rootView, id);
      if (tvIMDBRating == null) {
        break missingId;
      }

      id = R.id.tvTopRatedMovieLanguageReleaseDate;
      TextView tvTopRatedMovieLanguageReleaseDate = ViewBindings.findChildViewById(rootView, id);
      if (tvTopRatedMovieLanguageReleaseDate == null) {
        break missingId;
      }

      id = R.id.tvTopRatedMovieStorylineDetails;
      TextView tvTopRatedMovieStorylineDetails = ViewBindings.findChildViewById(rootView, id);
      if (tvTopRatedMovieStorylineDetails == null) {
        break missingId;
      }

      id = R.id.tvTopRatedMovieStorylineTitle;
      TextView tvTopRatedMovieStorylineTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTopRatedMovieStorylineTitle == null) {
        break missingId;
      }

      id = R.id.tvTopRatedMovieTitle;
      TextView tvTopRatedMovieTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTopRatedMovieTitle == null) {
        break missingId;
      }

      return new ActivityTopRatedMovieDetailsBinding((ConstraintLayout) rootView, clBackArrow,
          clIMDBRating, clTopRatedMovieDetails, clTopRatedMovieDetailsImage,
          clTopRatedMovieStoryline, ivTopRatedMovieDetailsImage, tvIMDBRating,
          tvTopRatedMovieLanguageReleaseDate, tvTopRatedMovieStorylineDetails,
          tvTopRatedMovieStorylineTitle, tvTopRatedMovieTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}