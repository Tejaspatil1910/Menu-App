package com.example.finalproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class vegfoodonly extends AppCompatActivity {
    Button b;
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegfoodonly);
        b=findViewById(R.id.but2);
        c1=findViewById(R.id.cb1);
        c2=findViewById(R.id.cb2);
        c3=findViewById(R.id.cb3);
        c4=findViewById(R.id.cb4);
        c5=findViewById(R.id.cb5);
        c6=findViewById(R.id.cb6);
        c7=findViewById(R.id.cb7);
        c8=findViewById(R.id.cb8);
        c9=findViewById(R.id.cb9);
        c10=findViewById(R.id.cb10);
        c11=findViewById(R.id.cb11);
        c12=findViewById(R.id.cb12);
        c13=findViewById(R.id.cb13);
        c14=findViewById(R.id.cb14);
        c15=findViewById(R.id.cb15);
        c16=findViewById(R.id.cb16);
        c17=findViewById(R.id.cb17);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        getSupportActionBar().hide();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=" ";
                if (c1.isChecked())
                    s1 =s1 + " "+c1.getText();
                if (c2.isChecked())
                    s1 =s1 + " "+c2.getText();
                if (c3.isChecked())
                    s1 =s1 + " "+c3.getText();
                if (c4.isChecked())
                    s1 =s1 + " "+c4.getText();
                if (c5.isChecked())
                    s1 =s1 + " "+c5.getText();
                if (c6.isChecked())
                    s1 =s1 + " "+c6.getText();
                if (c7.isChecked())
                    s1 =s1 + " "+c7.getText();
                if (c8.isChecked())
                    s1 =s1 + " "+c8.getText();
                if (c9.isChecked())
                    s1 =s1 + " "+c9.getText();
                if (c10.isChecked())
                    s1 =s1 + " "+c10.getText();
                if (c11.isChecked())
                    s1 =s1 + " "+c11.getText();
                if (c12.isChecked())
                    s1 =s1 + " "+c12.getText();
                if (c13.isChecked())
                    s1 =s1 + " "+c13.getText();
                if (c14.isChecked())
                    s1 =s1 + " "+c14.getText();
                if (c15.isChecked())
                    s1 =s1 + " "+c15.getText();
                if (s1.equals(" "))
                    Toast.makeText(vegfoodonly.this,"Please Selected Order",Toast.LENGTH_LONG).show();
                else
                {
                    Toast.makeText(vegfoodonly.this,"Order in process!!",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(vegfoodonly.this,coutndown.class);
                    startActivity(intent);
                }

            }
        });
    }
}