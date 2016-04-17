package com.student.oclass.activity;

import com.student.oclass.R;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Test extends BaseActivity implements OnClickListener {
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sync_tech);
		System.out.println("启动");
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()) {
		case R.id.btn_back:
		case R.id.btn_home:
			finish();
			break;
		case R.id.btn_search:
			
			break;
		}
	}

}
