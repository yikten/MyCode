package com.example.phonecaller;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private EditText edNumber=null;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        edNumber=(EditText)MainActivity.this.findViewById(R.id.txtPhoneNum);
        Button btCall= (Button)this.findViewById(R.id.btnCall);
        
        //btCall.setOnClickListener(new MyListener());
       // btCall.setOnClickListener(this);
        
        //��2�з�ʽ ������
        btCall.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String number= edNumber.getText().toString();
	    		
	    		if(TextUtils.isEmpty(number)){
	    			Toast.makeText(MainActivity.this, "�绰���벻��Ϊ��.", 0).show();
	    			return;
	    		}
	    		Intent intent=new Intent();
	    		intent.setAction(Intent.ACTION_CALL);
	    		intent.setData(Uri.parse("tel:"+number));

	    		startActivity(intent);				
			}
		});
         
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    //��һ��ʵ�ַ��� �ڲ��� 
    /*
    private class MyListener implements OnClickListener{
    
    	public void onClick(View v){
    		
    		String number= edNumber.getText().toString();
    		
    		if(TextUtils.isEmpty(number)){
    			Toast.makeText(MainActivity.this, "�绰���벻��Ϊ��.", 0).show();
    			return;
    		}
    		Intent intent=new Intent();
    		intent.setAction(Intent.ACTION_CALL);
    		intent.setData(Uri.parse("tel:"+number));

    		startActivity(intent);
    	}
    }*/
    
    //��4�ַ�ʽ XML���÷���
    private void CallNumber(){
    	
    	String number= edNumber.getText().toString();
		
		if(TextUtils.isEmpty(number)){
			Toast.makeText(MainActivity.this, "�绰���벻��Ϊ��.", 0).show();
			return;
		}
		Intent intent=new Intent();
		intent.setAction(Intent.ACTION_CALL);
		intent.setData(Uri.parse("tel:"+number));

		startActivity(intent);
    }

    //��3�ַ�ʽ ������ �̳�
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{
			case R.id.btnCall:
				CallNumber();
				break;
			
		}
		
	}
    
}