package com.example.twoactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	
	public void BtnClick(View view){
		
		Intent intent=new Intent();
		intent.setClassName(this, "com.example.twoactivity.OtherAcitvity");
		startActivity(intent);
	}
}
