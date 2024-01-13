package com.example.planetapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.planetapp.R;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

// planet class in same package so we dont need to extend Planet class
public class MyCustomAdapter extends ArrayAdapter<Planet> {
    private final ArrayList<Planet> planetArrayList;
    Context context;
    // context is interface that contain information about application environment


    public MyCustomAdapter( ArrayList<Planet> planetArrayList, Context context) {
        super(context,R.layout.list_item_layout,planetArrayList);
        this.planetArrayList = planetArrayList;
        this.context = context;
    }

    // view class holder : used to cache reference to the view within
    //an item layout , so they don't need to repeatedly looked up during scrolling
    public static class MyViewHolder{
        TextView plantname;
        TextView moonCount;
        ImageView planetImg;
    }

    //getView(): used to create and return a view for a
    //specific item in the list

    @NonNull
    @Override
    // inherite by arrayAdapter
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        Planet planets=getItem(position);
        MyViewHolder myViewHolder;
        final View result;
        //convertView is contain recycled view
        if(convertView==null){
            // i need to create a new view viewHolder
            myViewHolder=new MyViewHolder();
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(
                    R.layout.list_item_layout,
                    parent,
                    false
            );
            //finding Views
            myViewHolder.plantname=(TextView) convertView.findViewById(R.id.plantName);
            myViewHolder.moonCount=convertView.findViewById(R.id.guideline);
            myViewHolder.planetImg=convertView.findViewById(R.id.mainContent);
            result=convertView;

            convertView.setTag(myViewHolder);
        }
        else{
            myViewHolder=(MyViewHolder) convertView.getTag();
            result=convertView;
        }
        myViewHolder.plantname.setText(planets.getPlantName());
        myViewHolder.moonCount.setText(planets.getMoonCount());
        myViewHolder.planetImg.setImageResource(planets.getPlantImage());

        return result;

    }
}
