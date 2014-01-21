package com.example.test;



import android.R.integer;
import android.test.AndroidTestCase;
import android.util.Log;

import com.example.junitservice.*;
public class TextService extends AndroidTestCase {
	
	public void TestAdd() throws Exception {
		
		service sr=new service();
		int result=sr.add(10, 20);
		
		Log.v("JUnitTest", "result="+result);
		assertEquals(30, result);		
	}

}
