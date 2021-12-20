
package com.example.coursedetails.CourseD;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CourseHis implements Serializable
{

    @SerializedName("type")
    @Expose
    private Boolean type;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("upper")
    @Expose
    private List<Upper> upper = null;
    @SerializedName("remain")
    @Expose
    private List<Remain> remain = null;
    @SerializedName("top_course")
    @Expose
    private List<TopCourse> topCourse = null;
    private final static long serialVersionUID = -8132989421259360462L;

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public CourseHis withType(Boolean type) {
        this.type = type;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CourseHis withMessage(String message) {
        this.message = message;
        return this;
    }

    public List<Upper> getUpper() {
        return upper;
    }

    public void setUpper(List<Upper> upper) {
        this.upper = upper;
    }

    public CourseHis withUpper(List<Upper> upper) {
        this.upper = upper;
        return this;
    }

    public List<Remain> getRemain() {
        return remain;
    }

    public void setRemain(List<Remain> remain) {
        this.remain = remain;
    }

    public CourseHis withRemain(List<Remain> remain) {
        this.remain = remain;
        return this;
    }

    public List<TopCourse> getTopCourse() {
        return topCourse;
    }

    public void setTopCourse(List<TopCourse> topCourse) {
        this.topCourse = topCourse;
    }

    public CourseHis withTopCourse(List<TopCourse> topCourse) {
        this.topCourse = topCourse;
        return this;
    }

}
