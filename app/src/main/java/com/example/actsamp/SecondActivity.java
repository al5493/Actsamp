package com.example.actsamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent gi = getIntent();

        int x1 = gi.getIntExtra("n",1);
        int[] x2 = gi.getIntArrayExtra("nn");
        String x3 = gi.getStringExtra("nnn");

        Toast.makeText(this, ""+x1+x3, Toast.LENGTH_LONG).show();
        int[] xyz = x2;

    }
}
