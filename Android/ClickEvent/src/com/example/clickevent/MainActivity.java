package com.example.clickevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
// Inflate the menu; this adds items to the action bar if it is present.
public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn =(Button)this.findViewById(R.id.btnClickA);		
		btn.setOnClickListener(new MyListener());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public class MyListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			
			switch(v.getId())
			{
				case R.id.btnClickA:
					Toast.makeText(MainActivity.this, "按钮A被点击了.", 0).show();
					break;
			}
		}	
	}

	public void ClickB(View v)
	{
		Toast.makeText(this, "按钮B被点击了.", 0).show();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.btnClickC)
		{
			Toast.makeText(this, "按钮C被点击了", 0).show();
		}
		Toast.makeText(this, "按钮被点击了", 0).show();
	}
}
