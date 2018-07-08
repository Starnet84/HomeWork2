package com.itsteps.altair.homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private final static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendButton = findViewById(R.id.ma_send_btn);
        sendButton.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }


    @Override
    public void onRestart() {
        super.onRestart();
        Log.i(TAG, "MainActivity");
    }


    @Override
    public void onClick(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        Log.i(TAG, "Button is pressed");
        Toast.makeText(MainActivity.this, "Button is pressed2", Toast.LENGTH_SHORT).show();
        startActivity(intent);


    }


}
