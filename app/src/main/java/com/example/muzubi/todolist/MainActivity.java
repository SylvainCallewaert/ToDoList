package com.example.muzubi.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Intent intention;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickNewTask(View view) {
        Intent intentNewTask = new Intent(this, NewTask.class);
        startActivityForResult(intentNewTask,1);

    }
}
