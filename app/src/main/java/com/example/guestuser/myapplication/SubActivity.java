package com.example.guestuser.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity implements View.OnClickListener {
    Toast toast;
    Intent intent;
    Button button;
    String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        intent = getIntent();
        Log.d("my_tag",intent.getStringExtra("masage"));
        string = intent.getStringExtra("masage");

        button = findViewById(R.id.button1);
        button.setOnClickListener(this);

        if (toast != null){
            toast.cancel();
        }

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button1){
            if (toast != null) {
                toast.cancel();
            }

            toast= Toast.makeText(getApplicationContext(),string,Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
