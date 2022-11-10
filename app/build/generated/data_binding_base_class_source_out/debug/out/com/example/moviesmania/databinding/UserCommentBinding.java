// Generated by view binder compiler. Do not edit!
package com.example.moviesmania.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class UserCommentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout clComment;

  @NonNull
  public final ConstraintLayout clUserComment;

  @NonNull
  public final TextView tvUserComment;

  @NonNull
  public final TextView tvUserCommentDate;

  @NonNull
  public final TextView tvUsername;

  private UserCommentBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout clComment, @NonNull ConstraintLayout clUserComment,
      @NonNull TextView tvUserComment, @NonNull TextView tvUserCommentDate,
      @NonNull TextView tvUsername) {
    this.rootView = rootView;
    this.clComment = clComment;
    this.clUserComment = clUserComment;
    this.tvUserComment = tvUserComment;
    this.tvUserCommentDate = tvUserCommentDate;
    this.tvUsername = tvUsername;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UserCommentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UserCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.user_comment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UserCommentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout clComment = (ConstraintLayout) rootView;

      id = R.id.clUserComment;
      ConstraintLayout clUserComment = ViewBindings.findChildViewById(rootView, id);
      if (clUserComment == null) {
        break missingId;
      }

      id = R.id.tvUserComment;
      TextView tvUserComment = ViewBindings.findChildViewById(rootView, id);
      if (tvUserComment == null) {
        break missingId;
      }

      id = R.id.tvUserCommentDate;
      TextView tvUserCommentDate = ViewBindings.findChildViewById(rootView, id);
      if (tvUserCommentDate == null) {
        break missingId;
      }

      id = R.id.tvUsername;
      TextView tvUsername = ViewBindings.findChildViewById(rootView, id);
      if (tvUsername == null) {
        break missingId;
      }

      return new UserCommentBinding((ConstraintLayout) rootView, clComment, clUserComment,
          tvUserComment, tvUserCommentDate, tvUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
