package com.maccoux.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View view) {

        EditText myText = (EditText)findViewById(R.id.editNumber);
        double number = Double.parseDouble(myText.getText().toString());

        //Toast.makeText(MainActivity.this, myText.getText().toString(), Toast.LENGTH_LONG).show();

        goToActivity2(number);

    }

    public void goToActivity2(double d) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("dollar", d);
        startActivity(intent);
    }
}
