package com.example.coursedetails;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.TrucksHolder> {

    private Context context;
    private ArrayList<Course_Model> names;
    private int layout;
    private int imgs[];
    private LayoutInflater inflater;

    public CourseAdapter(Context context, ArrayList<Course_Model> names) {
        this.context = context;
        this.names = names;

        inflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public TrucksHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new TrucksHolder(inflater.inflate(R.layout.course_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TrucksHolder holder, @SuppressLint("RecyclerView") int position) {
                holder.c_title.setText(position+1+" . "+names.get(position).getUpperCTitle());
holder.llcoursename.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (CourceName.type.equals("top")) {
            Toast.makeText(context,"no any course in this section",Toast.LENGTH_SHORT).show();
        } else {
            context.startActivity(new Intent(context, CourseDetails.class).putExtra("type", CourceName.type).putExtra("pos", position));
        }
    }
});
    }



    @Override
    public int getItemCount() {
        return names.size();
    }

    public class TrucksHolder extends RecyclerView.ViewHolder {
        private TextView c_title;
        private ImageView img;
        private View itemView;
        private LinearLayout llcoursename;
        public TrucksHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;

            c_title = itemView.findViewById(R.id.c_title);
            llcoursename = itemView.findViewById(R.id.llcoursename);



        }
    }

}
