package com.example.actsamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int a = 5;
    int[] b = {1,2,3};
    String c = "ABCDEF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go(View view) {
        Intent si = new Intent(this,SecondActivity.class);
        startActivity(si);
    }

    public void gowithdata(View view) {
        Intent si = new Intent(this,SecondActivity.class);
        si.putExtra("n",a);
        si.putExtra("nn",b);
        si.putExtra("nnn",c);
        startActivity(si);
    }
}
