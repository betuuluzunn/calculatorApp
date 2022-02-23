package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class divide_Activity extends AppCompatActivity {
    private EditText editTxt_First,editTxt_sec;
    private TextView txt_result;
    private String firstNumber, secNumber;
    private int s1,s2,result;
    private Calculate calculate;

    Button divide_prv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide);
        editTxt_First = (EditText) findViewById(R.id.editTxt_first);
        editTxt_sec = (EditText) findViewById(R.id.editTxt_sec);
        txt_result = (TextView) findViewById(R.id.txt_result);
        divide_prv = (Button) findViewById(R.id.btn_prv5);
        divide_prv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prev_Intent = new Intent(divide_Activity.this,islem.class);
                startActivity(prev_Intent);
            }
        });
    }
    public void btnHesapla(View v) {
        firstNumber = editTxt_First.getText().toString();
        secNumber = editTxt_sec.getText().toString();

        if (!TextUtils.isEmpty(firstNumber) && !TextUtils.isEmpty(secNumber)) {
            s1= Integer.valueOf(firstNumber);
            s2=Integer.valueOf(secNumber);
            calculate = new Calculate(s1,s2);

            switch (v.getId()) {
                case R.id.buttonHesapla:
                    result = calculate.divide();
                    break;


            }txt_result.setText("Result: " + result);
        } else
            txt_result.setText("No Empty Value!");

    }

}