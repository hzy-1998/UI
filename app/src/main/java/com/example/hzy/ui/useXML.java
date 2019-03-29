package com.example.hzy.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.graphics.Color;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.TextView;
import android.widget.Toast;

public class useXML extends AppCompatActivity {

    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_xml);
        textview=(TextView)findViewById(R.id.textView3);//载入xml
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.small:
                textview.setTextSize(10*2);
                break;
            case R.id.middle:
                textview.setTextSize(16*2);
                break;
            case R.id.big:
                textview.setTextSize(20*2);
                break;

            case R.id.normal:
                Toast.makeText(this,"这是普通菜单项",Toast.LENGTH_SHORT).show();
                break;

            case R.id.red:
                textview.setTextColor(Color.RED);
                break;
            case R.id.black:
                textview.setTextColor(Color.BLACK);
                break;
            default:
        }
        return true;

    }
}

