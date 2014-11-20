package com.example.duan;

import java.util.ArrayList;
import java.util.List;


import obj.ChuDe;
import obj.TuVung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TuVungActivity extends Activity {
	List<ChuDe> listChuDe = new ArrayList<ChuDe>();
//	ArrayAdapter<ChuDe> adapterChuDe;
	Custom_List_Word adapterChude;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tu_vung);
		final ListView listview = (ListView) findViewById(R.id.mylist);
		loadData();
		adapterChude = new Custom_List_Word(TuVungActivity.this, listChuDe);
		listview.setAdapter(adapterChude);
		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				DetailActivity.listDetail.clear();
				DetailActivity.listDetail.add(listChuDe
						.get(position));
				Intent in = new Intent(TuVungActivity.this,
						DetailActivity.class);
				startActivity(in);
			}
		});
		
	}
void loadData(){
	List<TuVung> tv_restaurent = new ArrayList<TuVung>();
	tv_restaurent.add(new TuVung("go", "danh tu", "di,chay"));
	
	ChuDe cd_NhaHang = new ChuDe();
	cd_NhaHang.setIdChude("Selecting a restaurant – Chọn nhà hàng");
	cd_NhaHang.setImage(R.drawable.icon);
	cd_NhaHang.setListTuVung(tv_restaurent);
	listChuDe.add(cd_NhaHang);
	// ======================
	List<TuVung> tv_goout = new ArrayList<TuVung>();
	tv_goout.add(new TuVung("give", "danh tu", "cho"));
	
	ChuDe cd_GoOut = new ChuDe();
	cd_GoOut.setIdChude("Eating out – Ăn ngoài");
	cd_GoOut.setImage(R.drawable.mon1);
	cd_GoOut.setListTuVung(tv_goout);
	listChuDe.add(cd_GoOut);
	
	// ======================
		List<TuVung> tv_hacking = new ArrayList<TuVung>();
		tv_hacking.add(new TuVung("give", "danh tu", "cho"));
		
		ChuDe cd_Hacking = new ChuDe();
		cd_Hacking.setIdChude("Eating out – Ăn ngoài");
		cd_Hacking.setImage(R.drawable.mon2);
		cd_Hacking.setListTuVung(tv_hacking);
		listChuDe.add(cd_Hacking);
}
	
}
