// Generated by view binder compiler. Do not edit!
package hu.vmiklos.plees_tracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hu.vmiklos.plees_tracker.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySleepBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout cardRelativeLayout;

  @NonNull
  public final TextView sleepDetailsHeader;

  @NonNull
  public final AppCompatEditText sleepItemComment;

  @NonNull
  public final TextView sleepItemCommentLabel;

  @NonNull
  public final RatingBar sleepItemRating;

  @NonNull
  public final TextView sleepStartDate;

  @NonNull
  public final TextView sleepStartTime;

  @NonNull
  public final TextView sleepStopDate;

  @NonNull
  public final TextView sleepStopTime;

  @NonNull
  public final ImageView startImage;

  @NonNull
  public final TextView startedOnHeader;

  @NonNull
  public final ImageView stopRedImage;

  @NonNull
  public final TextView stoppedOnHeader;

  private ActivitySleepBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout cardRelativeLayout, @NonNull TextView sleepDetailsHeader,
      @NonNull AppCompatEditText sleepItemComment, @NonNull TextView sleepItemCommentLabel,
      @NonNull RatingBar sleepItemRating, @NonNull TextView sleepStartDate,
      @NonNull TextView sleepStartTime, @NonNull TextView sleepStopDate,
      @NonNull TextView sleepStopTime, @NonNull ImageView startImage,
      @NonNull TextView startedOnHeader, @NonNull ImageView stopRedImage,
      @NonNull TextView stoppedOnHeader) {
    this.rootView = rootView;
    this.cardRelativeLayout = cardRelativeLayout;
    this.sleepDetailsHeader = sleepDetailsHeader;
    this.sleepItemComment = sleepItemComment;
    this.sleepItemCommentLabel = sleepItemCommentLabel;
    this.sleepItemRating = sleepItemRating;
    this.sleepStartDate = sleepStartDate;
    this.sleepStartTime = sleepStartTime;
    this.sleepStopDate = sleepStopDate;
    this.sleepStopTime = sleepStopTime;
    this.startImage = startImage;
    this.startedOnHeader = startedOnHeader;
    this.stopRedImage = stopRedImage;
    this.stoppedOnHeader = stoppedOnHeader;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySleepBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySleepBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sleep, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySleepBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_relative_layout;
      ConstraintLayout cardRelativeLayout = ViewBindings.findChildViewById(rootView, id);
      if (cardRelativeLayout == null) {
        break missingId;
      }

      id = R.id.sleep_details_header;
      TextView sleepDetailsHeader = ViewBindings.findChildViewById(rootView, id);
      if (sleepDetailsHeader == null) {
        break missingId;
      }

      id = R.id.sleep_item_comment;
      AppCompatEditText sleepItemComment = ViewBindings.findChildViewById(rootView, id);
      if (sleepItemComment == null) {
        break missingId;
      }

      id = R.id.sleep_item_comment_label;
      TextView sleepItemCommentLabel = ViewBindings.findChildViewById(rootView, id);
      if (sleepItemCommentLabel == null) {
        break missingId;
      }

      id = R.id.sleep_item_rating;
      RatingBar sleepItemRating = ViewBindings.findChildViewById(rootView, id);
      if (sleepItemRating == null) {
        break missingId;
      }

      id = R.id.sleep_start_date;
      TextView sleepStartDate = ViewBindings.findChildViewById(rootView, id);
      if (sleepStartDate == null) {
        break missingId;
      }

      id = R.id.sleep_start_time;
      TextView sleepStartTime = ViewBindings.findChildViewById(rootView, id);
      if (sleepStartTime == null) {
        break missingId;
      }

      id = R.id.sleep_stop_date;
      TextView sleepStopDate = ViewBindings.findChildViewById(rootView, id);
      if (sleepStopDate == null) {
        break missingId;
      }

      id = R.id.sleep_stop_time;
      TextView sleepStopTime = ViewBindings.findChildViewById(rootView, id);
      if (sleepStopTime == null) {
        break missingId;
      }

      id = R.id.start_image;
      ImageView startImage = ViewBindings.findChildViewById(rootView, id);
      if (startImage == null) {
        break missingId;
      }

      id = R.id.started_on_header;
      TextView startedOnHeader = ViewBindings.findChildViewById(rootView, id);
      if (startedOnHeader == null) {
        break missingId;
      }

      id = R.id.stop_red_image;
      ImageView stopRedImage = ViewBindings.findChildViewById(rootView, id);
      if (stopRedImage == null) {
        break missingId;
      }

      id = R.id.stopped_on_header;
      TextView stoppedOnHeader = ViewBindings.findChildViewById(rootView, id);
      if (stoppedOnHeader == null) {
        break missingId;
      }

      return new ActivitySleepBinding((ConstraintLayout) rootView, cardRelativeLayout,
          sleepDetailsHeader, sleepItemComment, sleepItemCommentLabel, sleepItemRating,
          sleepStartDate, sleepStartTime, sleepStopDate, sleepStopTime, startImage, startedOnHeader,
          stopRedImage, stoppedOnHeader);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
