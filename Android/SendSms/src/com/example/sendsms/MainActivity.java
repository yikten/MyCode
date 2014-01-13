package com.example.sendsms;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private EditText et_mobile;
	private EditText et_smscontent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		et_mobile = (EditText) this.findViewById(R.id.et_mobile);
		et_smscontent = (EditText) this.findViewById(R.id.et_smscontent);
		Button btnSend = (Button) this.findViewById(R.id.btn_Send);
		
		btnSend.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_Send:
			String mobile = et_mobile.getText().toString().trim();
			String smscontent = et_smscontent.getText().toString().trim();
			if (TextUtils.isEmpty(mobile) || TextUtils.isEmpty(smscontent)) {
				Toast.makeText(this, "�ֻ������������ݲ���Ϊ�ա�", 0).show();
			} else {
				SmsManager smsManager = SmsManager.getDefault();
				smsManager.sendTextMessage(mobile, null, smscontent, null, null);
				Toast.makeText(this, "���ŷ������ˣ���ע����ա�", 0).show();
			}
			break;
		}

	}

}
