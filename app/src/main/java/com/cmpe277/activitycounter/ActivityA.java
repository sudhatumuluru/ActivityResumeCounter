package com.cmpe277.activitycounter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityA extends Activity {

    private TextView mCounter;
    private int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        mCounter = (TextView)findViewById(R.id.counter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        counter++;
        java.text.NumberFormat number = new java.text.DecimalFormat("0000");
        mCounter.setText("Thread Counter : "+number.format(counter));
    }

    public void startDialog(View v){
        Intent intent = new Intent(ActivityA.this,DialogActivity.class);
        startActivity(intent);
    }
    public void startActivityB(View v){
        Intent intent = new Intent(ActivityA.this,ActivityB.class);
        startActivity(intent);
    }
    public void closeApp(View v){
        ActivityA.this.finish();
    }
}
