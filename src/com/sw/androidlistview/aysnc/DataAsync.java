package com.sw.androidlistview.aysnc;

import java.io.InputStream;

import com.sw.androidlistview.util.DataUtil;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

public class DataAsync extends AsyncTask<String, Integer, Bitmap>{
	 private ImageView imageView;
	   
		public DataAsync(ImageView imageView) {
		super();
		this.imageView = imageView;
	}

		@Override
		protected void onPostExecute(Bitmap result) {
			// TODO Auto-generated method stub
			imageView.setImageBitmap(result);
			super.onPostExecute(result);
		}

		@Override
		protected Bitmap doInBackground(String... arg0) {
			// TODO Auto-generated method stub
			InputStream io = DataUtil.getStream(arg0[0]);
			Bitmap bt = BitmapFactory.decodeStream(io);
			return bt;
		}
}
