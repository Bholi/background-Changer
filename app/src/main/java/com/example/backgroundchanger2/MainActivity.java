package com.example.backgroundchanger2;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout layout;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);
        button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
          Random random = new Random();
          int color = Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));
          layout.setBackgroundColor(color);
        });
    }
}