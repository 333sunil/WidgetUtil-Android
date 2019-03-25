package com.example.android.widgetutil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Sunil on 25-03-2019.
 */

public class Widget extends AppCompatActivity {
    public void start(String msg){
        Log.d("msg",msg);
        Intent intent;
        intent = new Intent(this,ChatActivity.class);
        intent.putExtra("MSG", msg);
        startActivity(intent);
    }
}
