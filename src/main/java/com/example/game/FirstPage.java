package com.example.game;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.game.R;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Making notification bar transparent
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        setContentView(R.layout.activity_first_page);

        final ImageView FirstLayout = (ImageView) findViewById(R.id.FirstLayout);
        final LinearLayout SecondLayout = (LinearLayout) findViewById(R.id.SecondLayout);

        SecondLayout.setVisibility(View.INVISIBLE);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SecondLayout.setVisibility(View.VISIBLE);
                FirstLayout.setVisibility(View.INVISIBLE);
            }
        },5000);

        Button StartGame = (Button) findViewById(R.id.button);

        StartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstPage.this , MainActivity.class);
                FirstPage.this.startActivity(i);
            }
        });

    }
}