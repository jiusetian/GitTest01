package com.gittest01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private  String TAG=getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: 我是更改的内容");
        Log.d(TAG, "onCreate: 第一次添加数据");
        Log.d(TAG, "onCreate: 第二次添加数据");
        Log.d(TAG, "onCreate: 第三次添加数据");
        initData();
        Log.d(TAG, "onCreate: 进行一次修改上传github");
    }

    private void initData(){
        Log.d(TAG, "initData: 我是developer的第一次提交");
    }
}
