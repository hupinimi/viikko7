package com.example.ht7_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Scanner;


public class MainActivity extends AppCompatActivity {

    //TextView text;
    //TextInputLayout input = (TextInputLayout) findViewById(R.id.textInputLayout);
    String text;

    EditText textInput;

    Button nappula;

    TextView tView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput = (EditText) findViewById(R.id.editText);
        nappula = (Button) findViewById(R.id.button);
        tView = (TextView) findViewById(R.id.textView);

        nappula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = textInput.getText().toString();
                textChanger(v, text);
            }
        });

    }
    

    public void textChanger (View v, String newText) {
        tView.setText(newText);
    }
}