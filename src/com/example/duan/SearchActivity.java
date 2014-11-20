package com.example.duan;

import java.util.ArrayList;
import java.util.List;
import obj.ChuDe;
import obj.TuVung;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class SearchActivity extends Activity {
	List<ChuDe> listChuDe = new ArrayList<ChuDe>();
	EditText txtText;
	Button btnSearch;
	ListView listview;
//	int textlength = 0;
//	ArrayAdapter<ChuDe> adapter;
//	List<ChuDe> arr_sort = new ArrayList<ChuDe>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
		txtText = (EditText) findViewById(R.id.txtText);
		btnSearch = (Button) findViewById(R.id.btnSearch);
		listview = (ListView) findViewById(R.id.listView);
		loadData();
//		Log.d("000000000", listChuDe.getListTuVung().size());
//		btnSearch.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
////				onTextChanged();
//			}
//		});
//	}

//	public void onTextChanged() {
//		textlength = txtText.getText().length();
//		arr_sort.clear();
//		for (int i = 0; i < listDetail.get(0).getListTuVung().size(); i++) {
//			String _text = (String) listDetail.get(0).getListTuVung().get(i)
//					.getTu();
//			if (textlength <= _text.length()) {
//				if (txtText
//						.getText()
//						.toString()
//						.equalsIgnoreCase(
//								(String) _text.subSequence(0, textlength))) {
//					Log.i("array sort", _text);
//					arr_sort.add();
//				}
//			}
//		}
//		adapter = new ArrayAdapter<ChuDe>(getApplicationContext(),
//				android.R.layout.simple_list_item_1, arr_sort);
//		listview.setAdapter(adapter);
	}
	void loadData(){
		List<TuVung> tv_restaurent = new ArrayList<TuVung>();
		tv_restaurent.add(new TuVung("go", "danh tu", "di,chay"));
		tv_restaurent.add(new TuVung("go1", "danh tu", "di,chay"));
		tv_restaurent.add(new TuVung("go2", "danh tu", "di,chay"));
		tv_restaurent.add(new TuVung("go3", "danh tu", "di,chay"));
		tv_restaurent.add(new TuVung("go4", "danh tu", "di,chay"));
		ChuDe cd_NhaHang = new ChuDe();
		cd_NhaHang.setIdChude("Selecting a restaurant – Chọn nhà hàng");
		
		cd_NhaHang.setListTuVung(tv_restaurent);
		listChuDe.add(cd_NhaHang);
		// ======================
		List<TuVung> tv_goout = new ArrayList<TuVung>();
		tv_goout.add(new TuVung("give", "danh tu", "cho"));
		tv_goout.add(new TuVung("give1", "danh tu", "cho"));
		tv_goout.add(new TuVung("give2", "danh tu", "cho"));
		tv_goout.add(new TuVung("give3", "danh tu", "cho"));
		ChuDe cd_GoOut = new ChuDe();
		cd_GoOut.setIdChude("Eating out – Ăn ngoài");
		cd_GoOut.setListTuVung(tv_goout);
		listChuDe.add(cd_GoOut);
	}
}
