package com.max.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	EditText name;
	EditText desc;
	Button bDone;
	EditText bBank;
	RadioGroup rg;
	boolean b;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		name = (EditText)findViewById(R.id.name);
		desc = (EditText)findViewById(R.id.jDesc);
		bDone = (Button)findViewById(R.id.bDone);
		bBank = (EditText)findViewById(R.id.bankAmount);
		rg = (RadioGroup)findViewById(R.id.radioGroup1);
		
		
		
		
		bDone.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, AnotherActivity.class);
				i.putExtra("name",name.getText().toString());
				i.putExtra("desc",desc.getText().toString());
				i.putExtra("bBank",bBank.getText().toString());
				i.putExtra("randB", b);
				startActivity(i);
				
			}
		});
		
	}
	
	public void onRadioButtonClicked(View view) {
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
	    
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.radio0:
	            if (checked)
	                b = true;
	            break;
	        case R.id.radio1:
	            if (checked)
	                b = false;
	            break;
	    }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
