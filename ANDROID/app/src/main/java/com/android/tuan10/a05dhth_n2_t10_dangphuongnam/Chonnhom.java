package com.android.tuan10.a05dhth_n2_t10_dangphuongnam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Chonnhom extends AppCompatActivity {
ListView lv1;
    String[] nhom = {"Group A","Group B", "Group C","GroupD"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chonnhom);
        lv1 = (ListView)findViewById(R.id.lv1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (getBaseContext(), android.R.layout.simple_list_item_1,nhom);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Chonnhom.this,Doibong.class);
                startActivity(intent);
            }
        });
    }
}
