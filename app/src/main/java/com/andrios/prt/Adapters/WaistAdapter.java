package com.andrios.prt.Adapters;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.andrios.prt.R;

import java.util.ArrayList;

/**
 * Created by Corey on 12/7/2016.
 */

public class WaistAdapter extends RecyclerView.Adapter<WaistAdapter.ViewHolder> {
    private final Context context;
    private ArrayList<Integer> mDataset;
    private static final String TAG = "WaistAdapter";


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.height_text);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public WaistAdapter(Context context, ArrayList<Integer> myDataset) {
        mDataset = myDataset;
        this.context = context;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public WaistAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_height, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh =  new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        int waist = mDataset.get(position);

        holder.mTextView.setText(formatWaist(waist));
        GradientDrawable magnitudeCircle = (GradientDrawable) holder.mTextView.getBackground();

        // Get the appropriate background color based on the current earthquake magnitude
        int backgroundColor = getBackgroundColor(waist);


        magnitudeCircle.setColor(backgroundColor);

    }

    private int getBackgroundColor(int waist) {

        int passColorResourceId = R.color.green;
        int failColorResourceId = R.color.red;


        if(waist > 39.0){
            return ContextCompat.getColor(context, failColorResourceId);
        }else{

            return ContextCompat.getColor(context, passColorResourceId);
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    private String formatWaist(int waistInInches){

        String waistString = Integer.toString(waistInInches);
        return waistString + '"';
    }
}