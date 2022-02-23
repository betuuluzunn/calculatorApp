package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class islem extends AppCompatActivity {

    Button btn_prev,btnAdd,btnSub,btnMultiply,btnDivide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islem);
        btn_prev=findViewById(R.id.btn_prv);

        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent prev_Intent = new Intent(islem.this,MainActivity.class);
                startActivity(prev_Intent);
            }
        });
        btnAdd = findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add_Intent = new Intent(islem.this,add_activity.class);
                startActivity(add_Intent);
            }
        });
        btnSub = findViewById(R.id.btn_sub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sub_Intent = new Intent(islem.this,sub_Activity.class);
                startActivity(sub_Intent);
            }
        });

        btnMultiply = findViewById(R.id.btn_mltp);
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent multiply_Intent = new Intent(islem.this,multiple_activity.class);
                startActivity(multiply_Intent);
            }
        });

        btnDivide = findViewById(R.id.btn_dvd);
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent divide_Intent = new Intent(islem.this,divide_Activity.class);
                startActivity(divide_Intent);
            }
        });

    }
}