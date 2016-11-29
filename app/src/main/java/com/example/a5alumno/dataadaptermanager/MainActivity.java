package com.example.a5alumno.dataadaptermanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,
        AdapterView.OnItemLongClickListener {


    private String[] mListValues = {"Android", "iPhone", "WindowsMobile",
            "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2", "Ubuntu",
            "Windows7", "Max OS X", "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
            "OS/2", "Android", "iPhone", "WindowsMobile"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView mListView = (ListView) this.findViewById(R.id.listViewMain);
        mListView.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, mListValues));
        mListView.setOnItemClickListener(this);
        mListView.setOnItemLongClickListener(this);
    }

    //    @Override
//    public void onClick(View view) {
//
//    }
//
    @Override
    public void onItemClick(AdapterView<?> parent,
                            View view, int position, long id) {
        Toast.makeText(this, "Element " + position + ", with ID = "
                + id, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long id) {
        return false;
    }
}
