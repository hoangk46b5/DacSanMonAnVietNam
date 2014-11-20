package com.example.duan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Button tuvung = (Button) findViewById(R.id.btnTuVung);
		final Button search = (Button) findViewById(R.id.btnSearch1);
		search.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in1 = new Intent(MainActivity.this, SearchActivity.class);
				startActivity(in1);
			}
		});
		tuvung.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent in = new Intent(MainActivity.this, TuVungActivity.class);
				startActivity(in);
			}
		});
	}
}
