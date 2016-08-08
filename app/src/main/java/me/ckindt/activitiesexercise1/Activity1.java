package me.ckindt.activitiesexercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    int onCreateCounter = 0;
    int onStartCounter = 0;
    int onResumeCounter = 0;
    int onRestartCounter = 0;

    TextView mOnCreateText;
    TextView mOnStartText;
    TextView mOnResumeText;
    TextView mOnRestartText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        //Log onCreate
        Log.i("OnCreate","OnCreate Called");

        // OnCreate Counter ++ and display
        onCreateCounter++;

        // Initialize textViews
        mOnCreateText = (TextView) findViewById(R.id.oncreatevalue);
        mOnStartText = (TextView) findViewById(R.id.onstartvalue);
        mOnResumeText = (TextView) findViewById(R.id.onresumevalue);
        mOnRestartText = (TextView) findViewById(R.id.onrestartvalue);

        mOnCreateText.setText(Integer.toString(onCreateCounter));
    }

    @Override
    protected void onStart() {
        super.onStart();

        //Log onStart
        Log.i("OnStart","OnStart Called");

        //OnStart Counter ++ and display
        onStartCounter++;

        mOnStartText.setText(Integer.toString(onStartCounter));
    }

    @Override
    protected void onResume() {
        super.onResume();

        //Log onResume
        Log.i("OnResume","OnResume Called");

        //OnResumeCounter ++ and display
        onResumeCounter++;

        mOnResumeText.setText(Integer.toString(onResumeCounter));
    }
}
