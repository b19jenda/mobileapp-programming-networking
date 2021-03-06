package com.example.networking;

public class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain(){
        name="saknar namn";
        location="saknar plats";
        height=2;
    }
    public Mountain(String n, String l, int i){
        name=n;
        location=l;
        height=i;
    }

    public String info(){
        String text = new String();
        text+="Berget "+name+" är "+height+" meter högt och ligger i bergkedjan "+location;
        return text;
    }

    @Override
    public String toString(){
        return name;
    }
}
