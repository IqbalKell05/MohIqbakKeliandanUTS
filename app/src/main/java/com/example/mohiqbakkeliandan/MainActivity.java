package com.example.mohiqbakkeliandan;

import static com.example.mohiqbakkeliandan.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mUserIdTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        mUserIdTextView = findViewById(id.user_id_text_view);
        String userId = getIntent().getStringExtra("USER_ID");
        String password = getIntent().getStringExtra("PASSWORD");
        mUserIdTextView.setText("User ID: " + userId + "\nPassword: " + password);

        Button btnBarang = findViewById(R.id.btn_barang);
        btnBarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BarangActivity.class);
                startActivity(intent);
            }
        });
        Button btnTab = findViewById(R.id.btn_tab);
        btnTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TabActivity.class);
                startActivity(intent);
            }
        });

    }
}
