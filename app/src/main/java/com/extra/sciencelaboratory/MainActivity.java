package com.extra.sciencelaboratory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.main_item_rl_1)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = SecondActivity.createIntent(MainActivity.this,Constants.type_CL2);
                        startActivity(intent);
                    }
                });

        findViewById(R.id.main_item_rl_2)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = SecondActivity.createIntent(MainActivity.this,Constants.type_CO2);
                        startActivity(intent);
                    }
                });

        findViewById(R.id.main_item_rl_3)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = SecondActivity.createIntent(MainActivity.this,Constants.type_C6H6);

                        startActivity(intent);
                    }
                });
    }
}
