package com.example.demo6.Descriptions;


public class FilmDescription {


    private String name;
    private String trurl;
    private String url;
    private double rating;
    private int reliseYear;
    private int age;
    private int timeMin;

    public FilmDescription(String name, String trurl, String url, double rating, int reliseYear, int age, int timeMin) {
        this.name = name;
        this.url = url;
        this.trurl = trurl;
        this.rating = rating;
        this.reliseYear = reliseYear;
        this.age = age;
        this.timeMin = timeMin;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;}
    public String getUrl() {return url;}

    public String getTrurl() {return trurl;}

    public double getRating() {return rating;}
    public void setRating(double rating) {this.rating = rating;}
    public int getReliseYear() {return reliseYear;}
    public void setReliseYear(int reliseYear) {this.reliseYear = reliseYear;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public int getTimeMin() {return timeMin;}
    public void setTimeMin(int timeMin) {this.timeMin = timeMin;}
}
