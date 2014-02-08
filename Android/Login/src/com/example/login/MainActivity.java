package com.example.login;

import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText dtUserName;
	private EditText dtUserPwd;
	private CheckBox chk_Remember_Pwd;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		dtUserName=(EditText)this.findViewById(R.id.et_username);
		dtUserPwd=(EditText)this.findViewById(R.id.et_pwd);
		chk_Remember_Pwd=(CheckBox)this.findViewById(R.id.chk_rempwd);	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void Login(View v){		
		String username=dtUserName.getText().toString().trim();
		String userpwd=dtUserPwd.getText().toString().trim();
		Boolean remember_pwd=chk_Remember_Pwd.isChecked();
		if(TextUtils.isEmpty(username) || TextUtils.isEmpty(userpwd)){
			Toast.makeText(this, R.string.inputhint, 0).show();
			return;
		}
		if(remember_pwd){
			FileHandler fileHandler=new FileHandler();
			if(fileHandler.SaveUserInfo(username, userpwd)){
				Toast.makeText(this, "用户信息保存成功.", 0).show();
			}
			else{
				Toast.makeText(this, "用户信息保存失败.", 0).show();
			}
		}
	}
}
