package fr.formation.springintro.pojos;

import java.util.Date;

public class HelloWorld {

    private String text;
    private String date;


    public HelloWorld(String text) {
        this.text = text;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        date = new Date().toString();
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
