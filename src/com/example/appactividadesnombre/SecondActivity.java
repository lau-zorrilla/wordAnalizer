package com.example.appactividadesnombre;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity {
	
	public static String parametro;
	String valor, delimiter;
	TextView tvNombre, tvLength, tvWords;
	int length, words;
	String wordsNum[];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		valor = getIntent().getStringExtra(parametro);
		delimiter = " ";
		
		tvNombre = (TextView) findViewById(R.id.textViewNombreRes);
		tvNombre.setText(valor);
		
		tvLength = (TextView) findViewById(R.id.textViewLargoRes);
		tvWords = (TextView) findViewById(R.id.textViewPalabrasRes);
		
		wordLength();
		wordsNumber();
	}
	
	public void wordLength() {
		length = valor.length();
		tvLength.setText(String.valueOf(length));
	}
	
	public void wordsNumber() {
		wordsNum = valor.split(delimiter);
		words = wordsNum.length;
		tvWords.setText(String.valueOf(words));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
