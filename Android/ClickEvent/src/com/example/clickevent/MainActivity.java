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
		
		
		//1.内部类实现
		Button btnA =(Button)this.findViewById(R.id.btnClickA);	
		btnA.setOnClickListener(new MyListener());
		
		//2。匿名类实现
	
		Button btnB =(Button)this.findViewById(R.id.btnClickB);	
		btnB.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch(v.getId())
				{
					case R.id.btnClickB:
						Toast.makeText(MainActivity.this, "按钮B被点击了.", 0).show();
						break;
				}
			}
			
		});
				
		Button btnC =(Button)this.findViewById(R.id.btnClickC);	
		btnC.setOnClickListener(this);
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

	public void ClickD(View v)
	{
		Toast.makeText(this, "按钮D被点击了.", 0).show();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.btnClickC)
		{
			Toast.makeText(this, "按钮C被点击了", 0).show();
		}
	}
}
