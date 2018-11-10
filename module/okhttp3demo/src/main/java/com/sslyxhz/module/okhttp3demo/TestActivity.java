package com.sslyxhz.module.okhttp3demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/okhttp3/test")
public class TestActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String TAG = TestActivity.class.getSimpleName();

    private Button btnFunc1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        initView();
    }

    private void initView() {
        btnFunc1 = (Button) this.findViewById(R.id.btn_func1);
        btnFunc1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int i = view.getId();
        if (i == R.id.btn_func1) {
        } else {
            Log.w(TAG, "onClick, Unexcepted view:" + view);
        }
    }
}
