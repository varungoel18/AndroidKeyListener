package com.varungoel.keylisteners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.DateKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.MultiTapKeyListener;
import android.text.method.QwertyKeyListener;
import android.text.method.TextKeyListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edt1,edt2,edt3,edt4,edt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edt_1);
        DigitsKeyListener dkl1 = DigitsKeyListener.getInstance(true,true);
        edt1.setKeyListener(dkl1);

        edt2 = findViewById(R.id.edt_2);
        DigitsKeyListener dkl2 = DigitsKeyListener.getInstance();
        edt2.setKeyListener(dkl2);

        edt3 = findViewById(R.id.edt_3);
        DateKeyListener dkl3 = DateKeyListener.getInstance();
        edt3.setKeyListener(dkl3);

        edt4 = findViewById(R.id.edt_4);
        MultiTapKeyListener dkl4 = new MultiTapKeyListener(TextKeyListener.Capitalize.WORDS,true);
        edt4.setKeyListener(dkl4);

        edt5 = findViewById(R.id.edt_5);
        QwertyKeyListener qt1 = new QwertyKeyListener(TextKeyListener.Capitalize.SENTENCES , true);
        edt4.setKeyListener(qt1);
    }
}