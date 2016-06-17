package com.androidbelieve.drawerwithswipetabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Ratan on 7/29/2015.
 */
public class PrimaryFragment extends Fragment {

    ListView list;
    String[] text = { "Progressions","Averages", "Clocks", "Calendars","Interest", "Mensuration","Alligations",
            "Numbers","Percentages", "Work & Time","Pipes & Cisterns", "Probability","Profit & Loss", "Ratio","Proportion"};
  // Integer[] imageId = { R.drawable.squad, R.drawable.connect,
        //   R.drawable.gallery, R.drawable.table , R.drawable.transfer, R.drawable.table , R.drawable.transfer, R.drawable.table , R.drawable.transfer, R.drawable.table , R.drawable.transfer, R.drawable.table , R.drawable.transfer, R.drawable.table , R.drawable.transfer, R.drawable.table , R.drawable.transfer, R.drawable.table , R.drawable.transfer, R.drawable.table , R.drawable.transfer, R.drawable.table , R.drawable.transfer };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.primary_layout, container, false);

        list = (ListView) rootView.findViewById(R.id.ListView);
        CustomAdapter adapter = new CustomAdapter(getActivity() , text);
        list.setAdapter(adapter);

       /* AdapterView.OnItemClickListener itemClick = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int arg2, long arg3) {
                //PlaceVO v = (PlaceVO)arg1.getTag(R.id.adpter_object); // <-- get object using tag.
               // switchToPlaceScreen(v);
                startActivity(new Intent(getActivity(), Progressions.class));
            }
        };
        list.setOnItemClickListener(itemClick);*/

        Log.d("CustomAdapter", "MusicFragment onCreateView successful");

        return rootView;
    }
}
