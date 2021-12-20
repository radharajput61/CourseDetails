package com.example.coursedetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.coursedetails.CourseD.CourseHis;
import com.example.coursedetails.CourseD.Remain;
import com.example.coursedetails.CourseD.TopCourse;
import com.example.coursedetails.CourseD.Upper;
import com.example.coursedetails.InterFace.APIInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CourceName extends AppCompatActivity {
    RecyclerView rv_course_lst;
    ArrayList<Course_Model> names;
    CourseAdapter trucksAdapter;
    APIInterface apiInterface;
   public static String type="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cource_name);
        rv_course_lst =findViewById(R.id.rv_course_lst);
        names = new ArrayList<>();
        rv_course_lst.setHasFixedSize(true);
        rv_course_lst.setLayoutManager(new LinearLayoutManager(this));
        Intent i=getIntent();
        type=i.getStringExtra("type");
        home_list();
    }

    public  void  home_list()
    {

        apiInterface = APIClient.getClient().create(APIInterface.class);
        Call<CourseHis> call = apiInterface.home_list();
        call.enqueue(new Callback<CourseHis>() {
            @Override
            public void onResponse(Call<CourseHis> call, Response<CourseHis> response) {
                Log.e("respoooo",response.message());
                CourseHis  courseHis=response.body();
                Log.e("responce", courseHis+"getdata");
                if (courseHis.getType().equals(true)) {

                    names.clear();
                    if (type.equals("upper")) {
                        List<Upper> teamlist = courseHis.getUpper();
                        for (int i = 0; i < teamlist.size(); i++) {
                            names.add(new Course_Model(teamlist.get(i).getTitle() + "", "", ""));
                            trucksAdapter = new CourseAdapter(CourceName.this, names);
                            rv_course_lst.setAdapter(trucksAdapter);
                        }
                    }
                    if (type.equals("remain"))
                    {
                        List<Remain> teamlist = courseHis.getRemain();
                        for (int i = 0; i < teamlist.size(); i++) {
                            names.add(new Course_Model(teamlist.get(i).getTitle() + "", "", ""));
                            trucksAdapter = new CourseAdapter(CourceName.this, names);
                            rv_course_lst.setAdapter(trucksAdapter);
                        }
                    }

                    if (type.equals("top"))
                    {
                        List<TopCourse> teamlist = courseHis.getTopCourse();
                        for (int i = 0; i < teamlist.size(); i++) {
                            names.add(new Course_Model(teamlist.get(i).getTitle() + "", "", ""));
                            trucksAdapter = new CourseAdapter(CourceName.this, names);
                            rv_course_lst.setAdapter(trucksAdapter);
                        }
                    }

                }else {
                    Log.e("responce", "fail");

                    Toast.makeText(CourceName.this, "data not found", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onFailure(Call<CourseHis> call, Throwable t) {
                Log.e("onFailure", t.getMessage());
            }
        });
    }
}