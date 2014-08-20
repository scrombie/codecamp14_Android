package com.max.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class AnotherActivity extends ActionBarActivity {
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_another);
		tv= (TextView)findViewById(R.id.textView);
		Intent i= getIntent();
		String s = i.getStringExtra("name");
		String d = i.getStringExtra("desc");
		String b = i.getStringExtra("bBank");
	    //int ii = i.getIntExtra("iValue", 0);
		boolean f = i.getBooleanExtra("randB", false);
		tv.setText("Hi My name is "+s+" \n \nHeres a description of me: "+ d+" \n \nAre You Mad: "+f+" \n \n"+"Heres how much i have in my account: "+b );
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.another, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
