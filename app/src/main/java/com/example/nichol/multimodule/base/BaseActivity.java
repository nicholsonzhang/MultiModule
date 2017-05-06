package com.example.nichol.multimodule.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by nichol on 2017/5/6.
 */

public  abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        ButterKnife.bind(this);
        init(savedInstanceState);

    }

    public void init(Bundle savedInstanceState){}

    public abstract int getLayoutId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
