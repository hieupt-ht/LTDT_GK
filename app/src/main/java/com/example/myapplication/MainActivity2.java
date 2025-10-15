package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent intent = getIntent();
        String name_2110 = intent.getStringExtra("name");
        String age_2110 = intent.getStringExtra("age");
        String address_2110 = intent.getStringExtra("address");


        TextView txt_name_2110 = findViewById(R.id.txt_name);
        TextView txt_age_2110 = findViewById(R.id.txt_age);
        TextView txt_address_2110 = findViewById(R.id.txt_address);

        txt_name_2110.setText(name_2110);
        txt_age_2110.setText(String.valueOf(age_2110));
        txt_address_2110.setText(address_2110);

    }
}