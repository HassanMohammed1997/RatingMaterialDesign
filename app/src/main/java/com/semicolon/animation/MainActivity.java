package com.semicolon.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RatingBar.OnRatingBarChangeListener {
    RatingBar ratingBar;
    ImageView imageView;
    TextView rateText;
    Animation animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.rate_bar);
        imageView = findViewById(R.id.imageView);
        rateText = findViewById(R.id.rate_text);
        animation = AnimationUtils.loadAnimation(this, R.anim.rating_anim);
        ratingBar.setOnRatingBarChangeListener(this);



    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        int rateValue = (int) ratingBar.getRating();
        switch (rateValue){
            case 0:
                imageView.setImageResource(R.drawable.ic_confused);
                rateText.setText("Very Bad!");
                imageView.startAnimation(animation);
                break;
            case 1:
                imageView.setImageResource(R.drawable.ic_sad);
                imageView.startAnimation(animation);
                rateText.setText("Not Bad!");
                break;
            case 2:
                imageView.setImageResource(R.drawable.ic_smiling);
                imageView.startAnimation(animation);
                rateText.setText("Good!");
                break;
            case 3:
                imageView.setImageResource(R.drawable.ic_happy);
                imageView.startAnimation(animation);
                rateText.setText("Good Enough!");

                break;
            case 4:
                imageView.setImageResource(R.drawable.ic_in_love);
                imageView.startAnimation(animation);
                rateText.setText("Very Good!");
                break;
            case 5:
                imageView.setImageResource(R.drawable.ic_in_love);
                imageView.startAnimation(animation);
                rateText.setText("Excellent");
                break;



        }

    }
}
