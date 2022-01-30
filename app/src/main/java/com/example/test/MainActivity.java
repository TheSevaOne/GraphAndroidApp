package com.example.test;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import android.view.View;

public class MainActivity extends  Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.kek);
        Button btn2 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

    }


    public void act_ () {
        Intent intent = new Intent(this, plot_screen.class);
        startActivity(intent);
    }


        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.kek:
                    finish();
                    System.exit(0);
                case R.id.button:
                    act_();
            }

        }

}