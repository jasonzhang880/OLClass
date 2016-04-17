package com.student.oclass.activity;

import com.student.oclass.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/4/12 0012.
 */
public class ClassProgress extends Activity {
    private TextView showClass;
    int classNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_progress);

        showClass=(TextView)findViewById(R.id.show);
        Intent intent=getIntent();
        classNum=1+intent.getIntExtra("class",1);
        showClass.setText("您选择了"+classNum+"年级");
    }
}
