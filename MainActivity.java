package com.sies.tempvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;





public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button2);
        textView = findViewById(R.id.textView5);
        editText = findViewById(R.id.editTextNumber2);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {


                String g = editText.getText().toString();
                double fn = Integer.parseInt(g);
                double cs = (fn-32)*0.55556;
                textView.setText("Temperature in Celsius is"+ " " + cs + "°C");


            }
        });
    }
}


