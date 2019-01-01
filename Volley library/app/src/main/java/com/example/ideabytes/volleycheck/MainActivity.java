package com.example.ideabytes.volleycheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements VolleyResult {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        VolleyHelper mHelper = new VolleyHelper(this);
        mHelper.getMethod("http://httpbin.org/get?param1=hello",MainActivity.this);
    }

    @Override
    public void Success(JSONObject mjson) {
        Log.v("checkData",mjson.toString());
    }

    @Override
    public void failure(String mReason) {
        Log.v("checkData","failure "+mReason);
    }
}
