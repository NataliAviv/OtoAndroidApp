package com.example.oto;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
Button button_to_DriverMap;
Button button_to_PassengerMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        button_to_DriverMap=(Button)findViewById(R.id.buttonDriverMap);
        button_to_DriverMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDriverMapActivity();
            }
        });
        button_to_PassengerMap=(Button)findViewById(R.id.buttonPassengerMap);
        button_to_PassengerMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPassMapActivity();
            }
        });
    }


        public void openDriverMapActivity(){
            Intent intent=new Intent(this, DriverMapActivity.class);
            startActivity(intent);
        }
    public void openPassMapActivity(){
        Intent intent=new Intent(this, PassengerMapsActivity.class);
        startActivity(intent);
    }

}
