package com.example.duan;

import java.util.List;

import obj.ChuDe;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Custom_List_Word extends BaseAdapter {

	List<ChuDe> arrayTinTuc;

	public Activity context;
	public LayoutInflater inflater;

	public Custom_List_Word(Activity context, List<ChuDe> arrayTinTuc) {
		super();

		this.context = context;
		this.arrayTinTuc = arrayTinTuc;
		this.inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arrayTinTuc.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return arrayTinTuc.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static class ViewHolder {
		TextView txtTu;
		ImageView img;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.item_chude, null);
			holder.img = (ImageView) convertView.findViewById(R.id.imageView1);
			holder.txtTu = (TextView) convertView.findViewById(R.id.textView1);
			// holder.txtNghiaTu = (TextView) convertView
			// .findViewById(R.id.txt2);

			convertView.setTag(holder);
		} else
			holder = (ViewHolder) convertView.getTag();

		ChuDe _entry = (ChuDe) arrayTinTuc.get(position);
		holder.img.setImageResource(_entry.getImage());
		holder.txtTu.setText(_entry.getIdChude());
//		holder.txtNghiaTu.setText(_entry.getNghiaTu());

		return convertView;
	}

}
