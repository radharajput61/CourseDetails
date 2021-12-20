
package com.example.coursedetails.CourseD;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TopCourse implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("discountPrice")
    @Expose
    private String discountPrice;
    @SerializedName("tutor_id")
    @Expose
    private Integer tutorId;
    @SerializedName("tutorname")
    @Expose
    private String tutorname;
    private final static long serialVersionUID = 3817394235825031520L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TopCourse withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TopCourse withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public TopCourse withImg(String img) {
        this.img = img;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public TopCourse withPrice(String price) {
        this.price = price;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public TopCourse withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public TopCourse withDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
    }

    public TopCourse withTutorId(Integer tutorId) {
        this.tutorId = tutorId;
        return this;
    }

    public String getTutorname() {
        return tutorname;
    }

    public void setTutorname(String tutorname) {
        this.tutorname = tutorname;
    }

    public TopCourse withTutorname(String tutorname) {
        this.tutorname = tutorname;
        return this;
    }

}
