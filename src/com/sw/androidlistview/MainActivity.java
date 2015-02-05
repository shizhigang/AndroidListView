package com.sw.androidlistview;

import java.io.InputStream;

import com.sw.androidlistview.adapter.DataAdapter;
import com.sw.androidlistview.entity.DataEntity;
import com.sw.androidlistview.util.DataUtil;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;

public class MainActivity extends Activity implements OnClickListener{
	 private ListView lv;
	 private DataEntity data1;
	 private Context context;
	 private DataAdapter adapter;
	 private PopupWindow pop;
	 private ImageView imdz,plun,broud,pinglun;
	 public static final String PATH = "http://www.yasite.net/rss.php";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context = this;
		lv = (ListView) findViewById(R.id.listView1);
		View v1 =LayoutInflater.from(context).inflate(R.layout.list_item,null);
		lv.addHeaderView(v1);
		pop = new PopupWindow(v1, 200, 200, true);
		broud = (ImageView) v1.findViewById(R.id.imageView1);
	    pinglun = (ImageView) v1.findViewById(R.id.imageViewnull);
		View view = LayoutInflater.from(context).inflate(R.layout.list_image, null);
		imdz =  (ImageView) view.findViewById(R.id.dianzan);
		plun =  (ImageView) view.findViewById(R.id.dianzan);
	   new Thread(){
		   public void run() {
		   InputStream io = DataUtil.getStream(PATH);
		   String data = DataUtil.getString(io);
		   data1 = DataUtil.getEntity(data);
		   Log.e("11111", data1.toString());  
		   handler.sendEmptyMessage(0);
		   };
	   }.start();
	}
	Handler handler = new Handler(){
    	public void handleMessage(android.os.Message msg) {
    	if(msg.what == 0){
    		adapter = new DataAdapter(data1, context);
    		lv.setAdapter(adapter);
    	}	
    		
    	};
    };
 
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}


	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		
	}

}
