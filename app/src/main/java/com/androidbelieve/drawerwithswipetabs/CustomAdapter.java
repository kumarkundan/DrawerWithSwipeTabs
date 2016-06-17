package com.androidbelieve.drawerwithswipetabs;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by kundan on 3/7/2016.
 */
public class CustomAdapter extends ArrayAdapter<String> {
    private final Activity _context;
    private final String[] _text;


    public CustomAdapter(Activity context, String[] text) {
        super(context, R.layout.list_item, text);
        this._context = context;
        this._text = text;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = _context.getLayoutInflater();
        final View rowView = inflater.inflate(R.layout.list_item, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.text22);
        txtTitle.setText(_text[position]);

        txtTitle.setAnimation (AnimationUtils.loadAnimation (getContext()
                , R.anim.listview_anim));

        txtTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in= new Intent(getContext(),Progressions.class);
                //in.putExtra("name",currentItem.getWith());
                getContext().startActivity(in);
            }
        });

        return rowView;
    }

}