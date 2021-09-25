package com.example.cookies;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void eatCookie(View view) {
        TextView statusTextView = findViewById(R.id.status_text_view);
        ImageView androidCookieImageView = findViewById(R.id.android_cookie_image_view);
        Button button = findViewById(R.id.eat_cookie);
        if(statusTextView.getText().toString().equals(getResources().getString(R.string.IMSoHungry)))
        {
            statusTextView.setText(R.string.IMSoFull);
            androidCookieImageView.setImageResource(R.drawable.after_cookie);
            button.setText(R.string.fill_cookie);
        }
        else {
            statusTextView.setText(R.string.IMSoHungry);
            androidCookieImageView.setImageResource(R.drawable.before_cookie);
            button.setText(R.string.eat_cookie);
        }
    }
}