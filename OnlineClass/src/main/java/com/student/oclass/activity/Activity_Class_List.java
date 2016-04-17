package com.student.oclass.activity;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.student.oclass.R;

/**
 * Created by Administrator on 2016/4/12 0012.
 */
public class Activity_Class_List extends BaseActivity {

    private String[] class_level_array=new String[] {"一年级","二年级","三年级","四年级","五年级","六年级"};

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_class);
        System.out.println("开始启动");

        List<Map<String,Object>> listItems=new ArrayList<Map<String,Object>>();

        for(int i=0;i<class_level_array.length;i++) {
            Map<String,Object> listItem=new HashMap<String,Object>();
            listItem.put("class_level",class_level_array[i]);
            listItems.add(listItem);
        }

        SimpleAdapter simpleAdapter=new SimpleAdapter(this, listItems, R.layout.class_list_item, new String []{"class_level"}, new int[]{R.id.item_show});

        ListView list=(ListView)findViewById(R.id.class_list);
        list.setAdapter(simpleAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println(class_level_array[i]+"被选择了");

                Intent intent=new Intent(getBaseContext(),ClassProgress.class);
                intent.putExtra("class",i);
                startActivity(intent);
                finish();
            }
        });
    }  
}
