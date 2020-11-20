package com.example.rout_calc_daniel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.StrictMath.sqrt;

public class MainActivity extends AppCompatActivity {

    int a;
    int b;
    int c;

    EditText A;
    EditText B;
    EditText C;

    TextView X1;
    TextView X2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        A = findViewById(R.id.etA);
        B = findViewById(R.id.etB);
        C = findViewById(R.id.etC);

        X1 = findViewById(R.id.tvresulX1);
        X2 = findViewById(R.id.tvresultX2);
    }

    public void calc(View view) {
        a = Integer.parseInt(A.getText().toString());
        b = Integer.parseInt(B.getText().toString());
        c = Integer.parseInt(C.getText().toString());

        double result1 = (-b + sqrt(b*b - 4*a*c))/(2*a);
        double result2 = (-b - sqrt(b*b - 4*a*c))/(2*a);

        X1.setText(""+result1);
        X2.setText(""+result2);


    }
}