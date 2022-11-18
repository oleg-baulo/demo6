package com.example.demo6;

public class foodDescription {
    private String name;
    private String url;
    private String ingridienty;
    private String recept;
    private String callory;
    private int time;

    public foodDescription(String name, String url, String ingridienty, String recept, String callory, int time) {
        this.name = name;
        this.url = url;
        this.ingridienty = ingridienty;
        this.recept = recept;
        this.callory = callory;
        this.time = time;
    }
    public String getName() {return name;}
    public String getUrl() {return url;}
    public String getIngridienty() {return ingridienty;}
    public String getRecept() {return recept;}
    public String getCallory() {return callory;}
    public int getTime() {return time;}
}
