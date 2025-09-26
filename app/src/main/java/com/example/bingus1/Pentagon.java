package com.example.bingus1;

public class Pentagon extends Shape{
    // Regular pentagon, idk what you do wiht the y value lol just ignore it
    /*

      ^   ^
    | u w u |
     -------

     */
    int sidelength;
    public Pentagon(int x, int y){
        super(x, y);
        sidelength = super.x;
    }

}
