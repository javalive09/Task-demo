package com.javalive09.task_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.allowTaskReparenting:
                Intent intent = new Intent();
                intent.setClassName("com.javalive09.allowtaskreparenting", "com.javalive09.allowtaskreparenting.SecondActivity");
                startActivity(intent);
                break;
            case R.id.finishOnTaskLaunch:
                Intent i = new Intent();
                i.setClassName("com.javalive09.finishontasklaunch", "com.javalive09.finishontasklaunch.SecondActivity");
                startActivity(i);
                break;
        }
    }

}
