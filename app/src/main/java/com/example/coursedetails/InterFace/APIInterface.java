package com.example.coursedetails.InterFace;




import com.example.coursedetails.CourseD.CourseHis;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {

 @GET("/api/home_list")
 Call<CourseHis> home_list();

}
