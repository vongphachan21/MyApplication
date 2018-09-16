package com.example.zinjung.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText  number1 = findViewById(R.id.number1);
        final EditText  number2 = findViewById(R.id.number2);
        final TextView  textView = findViewById(R.id.result);
        Button button = findViewById(R.id.calculate);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(number1.getText().toString());
                int y = Integer.parseInt(number2.getText().toString());

                textView.setText(x + y + "");
            }
        });
    }
}
