package com.example.coursedetails;

public class Course_Model {


    public String UpperCTitle =""        ;
        public String Cource_title          ="";

    public String getUpperCTitle() {
        return UpperCTitle;
    }

    public void setUpperCTitle(String upperCTitle) {
        UpperCTitle = upperCTitle;
    }

    public String getCource_title() {
        return Cource_title;
    }

    public void setCource_title(String cource_title) {
        Cource_title = cource_title;
    }

    public String getCource_Price() {
        return Cource_Price;
    }

    public void setCource_Price(String cource_Price) {
        Cource_Price = cource_Price;
    }

    public String Cource_Price          ="";








        public Course_Model(String UpperCTitle, String Cource_title, String Cource_Price)
        {

            this.UpperCTitle=UpperCTitle;
            this.Cource_title=Cource_title;
            this.Cource_Price=Cource_Price;




        }



}
