package com.example.android.widgetutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        String msg= getIntent().getStringExtra("MSG");

        TextView message = (TextView)findViewById(R.id.message);
        message.setText(msg);
    }
}
