package com.example.oto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterStep5Activity extends AppCompatActivity {
    Button button_to_app_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_step5);

        button_to_app_menu = (Button) findViewById(R.id.buttonToAppMenu);
        button_to_app_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAppMenuActivity(v);
            }
        });
    }

    public void openAppMenuActivity(View v){
        Intent intent=new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
