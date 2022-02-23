package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button main_btn_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_btn_next=findViewById(R.id.main_btn_next);


        //butona tıklandıgında
        main_btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //sayfa değiştirme
                Intent next_Intent = new Intent(MainActivity.this,islem.class);
                        startActivity(next_Intent);
            }
        });


    }
}