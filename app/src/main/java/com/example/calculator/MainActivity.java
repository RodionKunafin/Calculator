package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void numPress(View view) {
        int id = view.getId();
        if (id == R.id.btn0) {
            resultField.setText("0");
        }
        if (id == R.id.btn1) {
            resultField.setText("1");
        }
        if (id == R.id.btn2) {
            resultField.setText("2");
        }
        if (id==R.id.btn3){
            resultField.setText("3");
        }
        if (id==R.id.btn4){
            resultField.setText("4");
        }
        if (id==R.id.btn5){
            resultField.setText("5");
        }
        if (id==R.id.btn6){
            resultField.setText("6");
        }
        if (id==R.id.btn7){
            resultField.setText("7");
        }
        if (id==R.id.btn8){
            resultField.setText("8");
        }
        if (id==R.id.btn9){
            resultField.setText("9");
        }
    }


    private void initViews() {
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn0 = findViewById(R.id.btn0);
        Button btnPoint = findViewById(R.id.btnPoint);
        TextView resultField  = findViewById(R.id.resultField);


    }

}
