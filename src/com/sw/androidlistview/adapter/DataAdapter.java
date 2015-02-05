package com.sw.androidlistview.adapter;

import com.sw.androidlistview.R;
import com.sw.androidlistview.aysnc.DataAsync;
import com.sw.androidlistview.entity.DataEntity;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

public class DataAdapter extends BaseAdapter implements android.view.View.OnClickListener{
	 private DataEntity entity;
	 private Context context;
	 private PopupWindow pop;
    private ImageView tv1,tv2;
		public DataAdapter(DataEntity entity, Context context) {
		super();
		this.entity = entity;
		this.context = context;
		
	}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return entity.getData().size();
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View coneverView, ViewGroup arg2) {
			// TODO Auto-generated method stub
			Holder holder = null;
			if(coneverView == null){
				holder = new Holder();
				coneverView = LayoutInflater.from(context).inflate(R.layout.list_view, null);
				holder.iv_tx = (ImageView) coneverView.findViewById(R.id.touxiang);
				holder.tv_name = (TextView) coneverView.findViewById(R.id.tv_name);
				holder.tv_title = (TextView) coneverView.findViewById(R.id.tv_content);
				holder.iv_show = (ImageView) coneverView.findViewById(R.id.tv_show);
				holder.iv_dji = (ImageView) coneverView.findViewById(R.id.iv_dji);
				coneverView.setTag(holder);
			}else{
				holder = (Holder) coneverView.getTag();	
			}
			new DataAsync(holder.iv_tx).execute(entity.getData().get(position).getAuthor().getAvatar());
//			ImageWorker.getImage
//			(context, entity.getData().get(position).getAuthor().getAvatar(), holder.iv_tx, R.drawable.ic_launcher);
			holder.tv_name.setText(entity.getData().get(position).getAuthor().getUsername());
			holder.tv_title.setText(entity.getData().get(position).getContent());
			new DataAsync(holder.iv_show).execute(entity.getData().get(position).getAuthor().getAvatar());
			View v1 = LayoutInflater.from(context).inflate(R.layout.list_image, null); 
			tv1 = (ImageView)v1.findViewById(R.id.dianzan);
			tv2 = (ImageView) v1.findViewById(R.id.plun);
			tv1.setOnClickListener(this);
			tv2.setOnClickListener(this);
			pop = new PopupWindow(v1, 200, 200,true);
			pop.setBackgroundDrawable(new BitmapDrawable());
			holder.iv_dji.setOnClickListener(this); 	
				
			return coneverView;
		}
	  class Holder{
		TextView tv_name,tv_title;
		ImageView iv_tx,iv_show,iv_dji;
	  }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.iv_dji:
			pop.showAsDropDown(v);
			break;
	
		case R.id.dianzan:
			
			break;
	     case R.id.plun:
			
			break;
		}
	}
}
