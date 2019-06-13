package com.extra.sciencelaboratory;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private static final String TYPE_KEY = "key_type";

    private int type;

    public static Intent createIntent(Context context, int type) {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra(TYPE_KEY, type);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ActionBar actionBar = getSupportActionBar();
        if (null != actionBar) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        type = getIntent().getIntExtra(TYPE_KEY, 0);
        setTitle(Constants.getTitleByType(this, type));
        TextView content = findViewById(R.id.second_step_content);
        TextView precautions = findViewById(R.id.second_precautions_content);
        Button start = findViewById(R.id.second_start_button);

        content.setText(getStepByType());
        precautions.setText(getPrecautionsByType());
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = ThirdActivity.createIntent(SecondActivity.this, type);
                startActivity(intent);
            }
        });
    }

    private String getStepByType() {
        switch (type) {
            case Constants.type_CL2:
                return getString(R.string.cl2_step);
            case Constants.type_CO2:
                return getString(R.string.co2_step);
            case Constants.type_C6H6:
                return getString(R.string.c6h6_step);
        }

        return null;
    }

    private String getPrecautionsByType() {
        switch (type) {
            case Constants.type_CL2:
                return getString(R.string.cl2_precautions);
            case Constants.type_CO2:
                return getString(R.string.co2_precautions);
            case Constants.type_C6H6:
                return getString(R.string.c6h6_precautions);
        }

        return null;
    }
}
