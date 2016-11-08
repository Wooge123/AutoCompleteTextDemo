package com.yukang.autocompletetext;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends Activity {

	private AutoCompleteTextView autoText;
	private MultiAutoCompleteTextView multiAutoText;
	private ArrayAdapter<String> adapter;
	private String[] data = { "a", "ab", "abc", "abcd", "abcde" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		autoText = (AutoCompleteTextView) findViewById(R.id.autotext);
		multiAutoText = (MultiAutoCompleteTextView) findViewById(R.id.multiautotext);
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, data);
		autoText.setAdapter(adapter);
		multiAutoText.setAdapter(adapter);
		multiAutoText.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
	}

}
