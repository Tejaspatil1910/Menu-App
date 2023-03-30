package com.example.finalproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class coutndown extends AppCompatActivity {
    Button b1;
    private TextView t1,t3,tv1;
    private int timeRemaining = 30;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coutndown);
        t1=findViewById(R.id.tv1);
        t3=findViewById(R.id.tv3);
        b1=findViewById(R.id.bt_menu);
        tv1=findViewById(R.id.text1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(coutndown.this,Homepage.class);
                startActivity(intent);
            }
        });
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        getSupportActionBar().hide();

        startTimer();
    }

    private void startTimer() {
        new CountDownTimer(21000,2000){

            @Override
            public void onTick(long l) {
                t3.setText(""+l/2000);
            }

            @Override
            public void onFinish() {
                if (timeRemaining == 0){
                    timeRemaining = 30;
                }
                startTimer();
                timeRemaining = timeRemaining-1;
                t1.setText(""+timeRemaining);
            }
        }.start();
    }

    public void dialogbox(View view) {
        final AlertDialog.Builder alert = new AlertDialog.Builder(coutndown.this);
        View mView = getLayoutInflater().inflate(R.layout.custom_dialog,null);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        final EditText txt_input = (EditText)mView.findViewById(R.id.txt_input);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button btn_cancel = (Button)mView.findViewById(R.id.btn_cancel);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button btn_order = (Button)mView.findViewById(R.id.btn_order);

        alert.setView(mView);

        final AlertDialog alertDialog= alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
                Toast.makeText(coutndown.this,"Order Cancel!",Toast.LENGTH_LONG).show();
            }
        });
        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(coutndown.this, coutndown.class);
                startActivity(intent);
                Toast.makeText(coutndown.this,"Order Successfull!!", Toast.LENGTH_LONG).show();
                String s = btn_order.getText().toString();
                tv1.setText(s);
            }
        });

        alertDialog.show();

    }
}