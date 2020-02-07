package com.maccoux.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Main2Activity extends AppCompatActivity {

    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textResult = (TextView)findViewById(R.id.textResult);
        Intent intent = getIntent();
        double dollar = intent.getDoubleExtra("dollar", 0.0);
        textResult.setText("Result: €" + new DecimalFormat("0.00").format((dollar * 0.77)));
    }
}
