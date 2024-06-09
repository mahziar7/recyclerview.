package com.example.recyclerview;

public class Templistitem { private String name [] ={
        "Ali",
        "Mohammad",
        "Hossein",
        "mehdi",

};
    private int Avatar [] ={
            R.drawable.avatar1,
            R.drawable.avatar10,
            R.drawable.avatar11,
            R.drawable.avatar13,
            R.drawable.avatar12,
            R.drawable.avatar14,
            R.drawable.avatar15,
    };
    public String [] getName(){
        return name;
    }
    public int [] getAvatar(){
        return Avatar;
    }
}
