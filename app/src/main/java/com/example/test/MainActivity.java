package com.example.test;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import androidx.annotation.NonNull;

public class MainActivity extends  Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.exit);
        Button btn2 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

    }
    public void action () {
        Intent intent = new Intent(this, plot_screen.class);
        startActivity(intent);
    }
    @Override
    public void onClick(@NonNull View v) {
            switch (v.getId()) {
                case R.id.exit:
                    finish();
                    System.exit(0);
                case R.id.button:
                    action();
            }

        }

}