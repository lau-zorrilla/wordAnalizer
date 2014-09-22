package com.example.appactividadesnombre;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	Button accept;
	TextView tv;
	String name;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		accept = (Button) findViewById(R.id.buttonAceptar);
		accept.setOnClickListener(this);
		
		tv = (TextView) findViewById(R.id.editTextNombre);
		
		
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
		if(v.getId() == R.id.buttonAceptar){
			Intent actividad = new Intent(this, SecondActivity.class);
			name = tv.getText().toString();
			actividad.putExtra(SecondActivity.parametro, name);
			startActivity(actividad);
		}
		
	}

}
