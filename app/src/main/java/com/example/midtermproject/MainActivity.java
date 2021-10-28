package com.example.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

      public EditText username_input, pass;
      public MaterialButton loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username_input = findViewById(R.id.username_input);
        pass = findViewById(R.id.pass);
        loginBtn = (MaterialButton) findViewById((R.id.loginBtn));

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText username_input = (EditText) findViewById(R.id.username_input);
                EditText password = (EditText) findViewById(R.id.pass);

                checked();
            }
        });
    }

    boolean isEmpty(EditText text){
        CharSequence username_input = text.getText().toString();
        return TextUtils.isEmpty(username_input);
    }

    void checked(){
        if(isEmpty(username_input)){
            Toast f = Toast.makeText(this, "Enter Username!", Toast.LENGTH_SHORT);
            f.show();
        }else if (isEmpty(pass)){
            Toast f = Toast.makeText(this, "Enter Password!", Toast.LENGTH_SHORT);
            f.show();
        }else
            openSecondActivity();
    }

    public void openSecondActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }


    }