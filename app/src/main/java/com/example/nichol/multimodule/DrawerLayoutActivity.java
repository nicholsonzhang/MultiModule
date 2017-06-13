package com.example.nichol.multimodule;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.nichol.multimodule.base.BaseActivity;

/**
 * Created by nichol on 2017/5/6.
 */

public class DrawerLayoutActivity extends BaseActivity {

    private Toolbar mToolbar;

    @Override
    public int getLayoutId() {
        return R.layout.a_drawer_layout;
    }

    @Override
    public void init(Bundle savedInstanceState) {
        setSupportActionBar(mToolbar);

        //test




    }




}
