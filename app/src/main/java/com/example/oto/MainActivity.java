package com.example.oto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_login;
    Button button_to_register_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_login=(Button)findViewById(R.id.Login);
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity();
            }
        });
        button_to_register_1=(Button)findViewById(R.id.RegisterStep1Button);
        button_to_register_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterStep1();
            }
        });

    }
    public void openNextActivity(){
        Intent intent=new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }

    public void openRegisterStep1(){
        Intent intent=new Intent(this,RegisterStep1.class);
        startActivity(intent);
    }
}
