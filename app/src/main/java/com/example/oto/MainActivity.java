package com.example.oto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_to_login;
    Button button_to_register_1;
    Button button_to_app_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_to_login=(Button)findViewById(R.id.buttonLogin);
        button_to_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity();
            }
        });
        button_to_register_1=(Button)findViewById(R.id.buttonToRegisterStep1);
        button_to_register_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterStep1Activity();
            }
        });
        button_to_app_menu = (Button) findViewById(R.id.buttonToAppMenu);
        button_to_app_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAppMenuActivity(v);
            }
        });
    }
    public void openNextActivity(){
        Intent intent=new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void openRegisterStep1Activity(){
        Intent intent=new Intent(this, RegisterStep1Activity.class);
        startActivity(intent);
    }

    public void openAppMenuActivity(View v){
        Intent intent=new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
