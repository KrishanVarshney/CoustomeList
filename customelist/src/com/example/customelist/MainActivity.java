package com.example.customelist;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends ActionBarActivity 
{
	ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        list=(ListView)findViewById(R.id.listView1);
        
        contact_list data []=new contact_list[]{
        		new contact_list(R.drawable.a,"keshu"),
        		new contact_list(R.drawable.b,"krish"),
        		new contact_list(R.drawable.c,"varshney"),
        		new contact_list(R.drawable.d,"venoum"),
        		new contact_list(R.drawable.e,"kes"),
        		new contact_list(R.drawable.f,"vfhd")
        	
        };
        
        contact_list_adapter cla=new contact_list_adapter(MainActivity.this,R.layout.rawlayout,data);
        
        list.setAdapter(cla);list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				contact_list cl=(contact_list)list.getItemAtPosition(arg2);
				Toast.makeText(MainActivity.this,cl.title,Toast.LENGTH_LONG).show();
				
			}
		});
        
    }


   

}
