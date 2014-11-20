package com.example.duan;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import obj.ChuDe;
import obj.TuVung;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends Activity {
	public static List<ChuDe> listDetail = new ArrayList<ChuDe>();
	Button btnnext, btnback, btnDoc,btnClose;
	TextView tv1, tv2, tv3;
	static int id = 0;
	TextToSpeech ttobj;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		btnClose=(Button)findViewById(R.id.btnClose);
		btnClose.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		// ==================================
		ttobj = new TextToSpeech(getApplicationContext(),
				new TextToSpeech.OnInitListener() {
					@Override
					public void onInit(int status) {
						if (status != TextToSpeech.ERROR) {
							ttobj.setLanguage(Locale.UK);
						}
					}
				});

		tv1 = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);
		tv3 = (TextView) findViewById(R.id.textView3);
		btnnext = (Button) findViewById(R.id.btnNext);
		btnback = (Button) findViewById(R.id.btnBack);
		btnDoc = (Button) findViewById(R.id.btnDoc);
		TuVung tv = listDetail.get(0).getListTuVung().get(0);
		tv1.setText(tv.getTu());
		tv2.setText(tv.getLoaiTu());
		tv3.setText(tv.getNghiaTu());
		btnnext.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				id++;
				if (id >= listDetail.get(0).getListTuVung().size() - 1) {
					id = listDetail.get(0).getListTuVung().size() - 1;
					TuVung a = listDetail.get(0).getListTuVung().get(id);
					tv1.setText(a.getTu());
					tv2.setText(a.getLoaiTu());
					tv3.setText(a.getNghiaTu());

				} else {
					TuVung a = listDetail.get(0).getListTuVung().get(id);
					tv1.setText(a.getTu());
					tv2.setText(a.getLoaiTu());
					tv3.setText(a.getNghiaTu());
				}

			}
		});
		// xu ly button back
		btnback.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				id--;
				if (id <= 0) {
					id = 0;
					TuVung c = listDetail.get(0).getListTuVung().get(id);
					tv1.setText(c.getTu());
					tv2.setText(c.getLoaiTu());
					tv3.setText(c.getNghiaTu());

				} else {
					TuVung d = listDetail.get(0).getListTuVung().get(id);
					tv1.setText(d.getTu());
					tv2.setText(d.getLoaiTu());
					tv3.setText(d.getNghiaTu());
				}

			}
		});
		btnDoc.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				TuVung a = listDetail.get(0).getListTuVung().get(id);
				Toast.makeText(getApplicationContext(), "" + a.getTu(),
						Toast.LENGTH_LONG).show();
				ttobj.speak(a.getTu(), TextToSpeech.QUEUE_FLUSH, null);
			}
		});

	}

	@Override
	protected void onPause() {
		if (ttobj != null) {
			ttobj.stop();
			ttobj.shutdown();
		}
		super.onPause();
	}
}
