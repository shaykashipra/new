package com.example.git_collab_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button min;
    private EditText et1, et2;
    private TextView tv;


    private Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        min = findViewById(R.id.sub);

        add = findViewById(R.id.add);
        et1 = findViewById(R.id.editTextNumberDecimal);
        et2 = findViewById(R.id.editTextNumberDecimal2);
        tv = findViewById(R.id.textView);


        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Integer.parseInt(et1.getText().toString());
                float num2 = Integer.parseInt(et2.getText().toString());
                float num3 = num1 - num2;
                tv.setText(String.valueOf(num3));

            }
        });

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                float num1 = Integer.parseInt(et1.getText().toString());
                float num2 = Integer.parseInt(et2.getText().toString());

                float num3 = num1 + num2;
                tv.setText(String.valueOf(num3));

            }
        });

    }
}