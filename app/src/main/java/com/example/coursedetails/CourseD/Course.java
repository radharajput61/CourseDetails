
package com.example.coursedetails.CourseD;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Course implements Serializable
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
    @SerializedName("video")
    @Expose
    private Object video;
    @SerializedName("tutor_id")
    @Expose
    private Integer tutorId;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    @SerializedName("promoVideo")
    @Expose
    private String promoVideo;
    @SerializedName("discountPrice")
    @Expose
    private String discountPrice;
    @SerializedName("catName")
    @Expose
    private String catName;
    @SerializedName("subcatName")
    @Expose
    private String subcatName;
    @SerializedName("childcatName")
    @Expose
    private String childcatName;
    @SerializedName("tutorName")
    @Expose
    private String tutorName;
    private final static long serialVersionUID = -8898412426322093906L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Course withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Course withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Course withImg(String img) {
        this.img = img;
        return this;
    }

    public Object getVideo() {
        return video;
    }

    public void setVideo(Object video) {
        this.video = video;
    }

    public Course withVideo(Object video) {
        this.video = video;
        return this;
    }

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
    }

    public Course withTutorId(Integer tutorId) {
        this.tutorId = tutorId;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Course withPrice(String price) {
        this.price = price;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Course withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Course withSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public String getPromoVideo() {
        return promoVideo;
    }

    public void setPromoVideo(String promoVideo) {
        this.promoVideo = promoVideo;
    }

    public Course withPromoVideo(String promoVideo) {
        this.promoVideo = promoVideo;
        return this;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Course withDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Course withCatName(String catName) {
        this.catName = catName;
        return this;
    }

    public String getSubcatName() {
        return subcatName;
    }

    public void setSubcatName(String subcatName) {
        this.subcatName = subcatName;
    }

    public Course withSubcatName(String subcatName) {
        this.subcatName = subcatName;
        return this;
    }

    public String getChildcatName() {
        return childcatName;
    }

    public void setChildcatName(String childcatName) {
        this.childcatName = childcatName;
    }

    public Course withChildcatName(String childcatName) {
        this.childcatName = childcatName;
        return this;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public Course withTutorName(String tutorName) {
        this.tutorName = tutorName;
        return this;
    }

}
