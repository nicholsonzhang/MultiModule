package com.example.nichol.multimodule;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.nichol.multimodule.base.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.content_list)
    ListView mListView;


    private static Sample[] samples;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    public void init(Bundle savedInstanceState) {
        super.init(savedInstanceState);
        samples = new Sample[]{new Sample(R.string.title_drawer_layout,DrawerLayoutActivity.class)};

        Log.e("yyzhang",""+(mListView == null));
        mListView.setAdapter(new ArrayAdapter<Sample>(this,android.R.layout.simple_list_item_1,android.R.id.text1,samples));

        mListView.setOnItemClickListener(onItemClickListener);
    }


    private AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            startActivity(new Intent(MainActivity.this,samples[position].aClass));

        }
    };

    private class Sample {

        private CharSequence title;
        private Class<? extends Activity> aClass;

        public Sample(int titleId, Class<? extends Activity> aClass) {
            this.title = getResources().getString(titleId);
            this.aClass = aClass;


        }

        @Override
        public String toString() {
            return title.toString();
        }
    }
}
