package com.example.justus.listview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;


public class main extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        String[] list = {"range", "ferrari", "buggatti", "mac D", "toyota","range", "ferrari", "buggatti", "mac D", "toyota","range", "ferrari", "buggatti", "mac D", "toyota","range", "ferrari", "buggatti", "mac D", "toyota"};
        ListView myList = (ListView)findViewById(R.id.listView);

        ListAdapter listAdapter = new ArrayAdapter<String>(this,R.layout.row_layout,list);
        myList.setAdapter(listAdapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String toast = String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(getApplicationContext(),toast,Toast.LENGTH_SHORT).show();
                switch(i){
                    case 0:



                }

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
