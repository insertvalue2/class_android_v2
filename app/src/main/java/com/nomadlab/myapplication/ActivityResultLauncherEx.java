package com.nomadlab.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityResultLauncherEx extends AppCompatActivity {

    ActivityResultLauncher<Intent> startActivityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {

                if (result.getResultCode() == Activity.RESULT_OK) {
                    Log.d("TAG", " comeback 돌아왔다. ");
                    Intent resultData = result.getData();
                    int returnValue = resultData.getIntExtra("result", 0);
                    Log.d("TAG", "returnValue : " + returnValue);
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_launcher_ex);
        Button btn = findViewById(R.id.btnIntent);
        btn.setOnClickListener(view -> {
            moveSubActivity();
        });
    }

    private void moveSubActivity() {
        Intent intent = new Intent(ActivityResultLauncherEx.this, Intent_2.class);
        intent.putExtra("number1", 1);
        intent.putExtra("number2", 2);
        startActivityResult.launch(intent);
    }
}