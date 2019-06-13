package com.extra.sciencelaboratory;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {
    private static final String TYPE_KEY = "type_key";

    private EditText et_1;
    private EditText et_2;
    private EditText et_3;
    private EditText et_4;
    private EditText et_5;
    private EditText et_6;

    //type是对应的类型 值在Constants里
    private int type;

    public static Intent createIntent(Context context, int type) {
        Intent intent = new Intent(context, ThirdActivity.class);
        intent.putExtra(TYPE_KEY, type);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);
        type = getIntent().getIntExtra(TYPE_KEY, 0);
        setTitle(Constants.getTitleByType(this, type));
        ActionBar actionBar = getSupportActionBar();
        if (null != actionBar) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        et_1 = findViewById(R.id.third_item_1);
        et_2 = findViewById(R.id.third_item_2);
        et_3 = findViewById(R.id.third_item_3);
        et_4 = findViewById(R.id.third_item_4);
        et_5 = findViewById(R.id.third_item_5);
        et_6 = findViewById(R.id.third_item_6);

        findViewById(R.id.button_clear)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clear();
                    }
                });

        findViewById(R.id.button_submit)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        submit();
                    }
                });
    }

    private void clear() {
        et_1.setText("");
        et_2.setText("");
        et_3.setText("");
        et_4.setText("");
        et_5.setText("");
        et_6.setText("");
    }

    private void submit() {
        //todo
    }
}
