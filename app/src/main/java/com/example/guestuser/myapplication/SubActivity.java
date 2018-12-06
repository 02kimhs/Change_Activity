package com.example.guestuser.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {
    Toast toast;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        intent = getIntent();
        Log.d("my_tag",intent.getStringExtra("masage"));

        if (toast != null){
            toast.cancel();
        }


    }
}
