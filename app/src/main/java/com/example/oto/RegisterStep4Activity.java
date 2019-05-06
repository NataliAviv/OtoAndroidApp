package com.example.oto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterStep4Activity extends AppCompatActivity {
    Button button_to_register_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_step4);

        button_to_register_5 = (Button) findViewById(R.id.buttonToRegisterStep5);
        button_to_register_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterStep5Activity(v);
            }
        });
    }

    public void openRegisterStep5Activity(View v){
        Intent intent=new Intent(this, RegisterStep5Activity.class);
        startActivity(intent);
    }
}
