package com.nomadlab.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ListenerActivity extends AppCompatActivity {

    //    TextView textView1;
    int number = 10;

    /* manifest file activity 확인 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener);

        // 뷰를 activity 로 가져오는 바업ㅂ
        // 1. 직접 찾아서 가져온다.
        // 2. view Binding 방법 --> 나중에 배움
        TextView tvHello = findViewById(R.id.tvHello);

        // 이벤트 리스너 등록하기 : 익명 함수로 사용하기
        // 익명 구현 객체

        // 안드로이드 시스템이 리스너를 쫙 펼쳐 놓고 클릭 되었다고 알려 준다.
        tvHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG", view.getId() + "");
                Log.d("TAG", view.getTag().toString());
                Log.d("TAG", "tvHello Clicked");
//                tvHello.setText("안녕하세요");
//                ImageView imageView = findViewById(R.id.image);
//                imageView.setImageResource(R.drawable.stroke);
//                number += 10;
                Log.d("TAG", number + "");
            }
        });

        // Alt -> Enter
        tvHello.setOnClickListener(view -> Log.d("TAG", "clicked !! " + view.getId()));

        // 리스너를 동시에 달았다고 하면 맨 마지막에 등록한 리스너가 동작하게 된다.
        tvHello.setText(R.string.app_name);
        tvHello.setText("안녕하세요");

        ImageView imageView = findViewById(R.id.image);
        imageView.setOnClickListener(view -> imageView.setImageResource(R.drawable.stroke));

        // xml 에서 그리는 뷰는 정적이다.
        // 정적인 뷰 들을 동적인 뷰로 변경 하려면 xml 에서 가지고 와서
        // activity 에서 조작한다.


    }

    private void initData(String args) {
        Log.d("TAG", args.getBytes() + "");
    }

}