package com.nomadlab.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // Bundle 은 아직 몰라도 됩니다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 상속 객체에 onCreate 메서드 호출입니다.
        super.onCreate(savedInstanceState);
        // 화면을 이 xml 파일로  그려준다. 준다.
        // Activity 가 화면을 그리는 것은 단 한번만 그려 준다.
        // Activity 사라졌다가 다시 그려질 때도 한번만 그려놓고(메모리)
        // 다시 불러 오면 된다.
        setContentView(R.layout.activity_main);

        // android studio auto import 기능을 해줍니다.
        Log.d("life_cycle", "onCreate");
    }
    // Life cycle 에서 단 한번만 호출 되는 녀셕입니다.
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("life_cycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("life_cycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("life_cycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("life_cycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("life_cycle", "onDestroy");
    }
}