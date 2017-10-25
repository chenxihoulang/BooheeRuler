package com.example.chaihongwei.booheeruler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.chaihongwei.booheeruler.thumbup.ThumbUpView;

public class ThumbupActivity extends AppCompatActivity {
    EditText edNum;
    ThumbUpView thumbUpView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thumbup);
        edNum = (EditText) findViewById(R.id.ed_num);
        thumbUpView = (ThumbUpView) findViewById(R.id.thumbUpView);
    }

    public void setNum(View v) {
        try {
            int num = Integer.valueOf(edNum.getText().toString().trim());
            thumbUpView.setCount(num).setThumbUp(true);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "只能输入整数", Toast.LENGTH_LONG).show();
        }
    }
}
