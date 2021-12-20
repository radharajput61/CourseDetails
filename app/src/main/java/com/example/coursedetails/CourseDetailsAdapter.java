package com.example.coursedetails;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseDetailsAdapter extends RecyclerView.Adapter<CourseDetailsAdapter.TrucksHolder> {

    private Context context;
    private ArrayList<Course_Model> names;
    private int layout;
    private int imgs[];
    private LayoutInflater inflater;

    public CourseDetailsAdapter(Context context, ArrayList<Course_Model> names) {
        this.context = context;
        this.names = names;

        inflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public TrucksHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new TrucksHolder(inflater.inflate(R.layout.course_details_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TrucksHolder holder, int position) {
                holder.c_title.setText(position+1+" . "+names.get(position).getUpperCTitle());
                holder.c_price.setText(" Rs . "+names.get(position).getCource_Price());

    }



    @Override
    public int getItemCount() {
        return names.size();
    }

    public class TrucksHolder extends RecyclerView.ViewHolder {
        private TextView c_title,c_price;
        private ImageView img;
        private View itemView;
        private LinearLayout llcoursename;
        public TrucksHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;

            c_title = itemView.findViewById(R.id.c_title);
            c_price = itemView.findViewById(R.id.c_price);
            llcoursename = itemView.findViewById(R.id.llcoursename);



        }
    }

}
