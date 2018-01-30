package com.android.tuan10.a05dhth_n2_t10_dangphuongnam;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/**
 * Created by Dell on 12/5/2017.
 */

public class PlatfFormAdapter extends ArrayAdapter
{
    Context context;
    int layoutResourceId;
    List<PlatfForm> data;

    public PlatfFormAdapter(Context context, int resource, List data) {
        super(context, resource, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        PlatfFormHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new PlatfFormHolder();
            holder.txtTitle = (TextView)row.findViewById(R.id.tvtengroup);
            holder.tvdoi1 = (TextView)row.findViewById(R.id.tv1);
            //holder.tvdoi2 = (TextView)row.findViewById(R.id.tv2);
            //holder.tvdoi3 = (TextView)row.findViewById(R.id.tv3);
            //holder.tvdoi4 = (TextView)row.findViewById(R.id.tv4);
            holder.icon1 = (ImageView)row.findViewById(R.id.img1);
            //holder.icon2 = (ImageView)row.findViewById(R.id.img2);
            //holder.icon3 = (ImageView)row.findViewById(R.id.img3);
            //holder.icon4 = (ImageView)row.findViewById(R.id.img4);
            row.setTag(holder);
        }
        else
        {
            holder = (PlatfFormHolder)row.getTag();
        }

        PlatfForm pf = data.get(position);
        holder.txtTitle.setText(pf.getTitle());
        holder.imgIcon.setImageResource(pf.getIcon());

        return row;
    }

    class PlatfFormHolder
    {
        ImageView imgIcon, icon1, icon2, icon3, icon4;
        TextView txtTitle;
        TextView tvdoi1, tvdoi2,tvdoi3,tvdoi4;

    }
}
