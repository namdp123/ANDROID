package com.android.tuan10.a05dhth_n2_t10_dangphuongnam;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class Doibong extends AppCompatActivity {
ListView lv;
    ArrayList<PlatfForm> doibong;
    int []id = {R.drawable.argentina,R.drawable.australia,R.drawable.belgium,R.drawable.brazil,R.drawable.croatia,R.drawable.france,R.drawable.germany,R.drawable.iceland,R.drawable.iran,R.drawable.poland,
    R.drawable.portugal,R.drawable.russia,R.drawable.tunisia,R.drawable.uruguay};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createData();
        setContentView(R.layout.activity_doibong);
        lv = (ListView)findViewById(R.id.lv);
        PlatfFormAdapter adapter = new PlatfFormAdapter(this,R.layout.activity_lay_out,doibong);
        lv.setAdapter(adapter);
    }
    public  void createData()
    {
        doibong = new ArrayList<PlatfForm>();
        doibong.add(new PlatfForm (id[1],"Group A","Australia"));
        //doibong.add(new PlatfForm (id[2],"Group A","Iran"));
        //doibong.add(new PlatfForm (id[3],"Group A","Brazil"));
    }
}
