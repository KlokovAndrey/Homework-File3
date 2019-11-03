package com.file3.BallClass;

import static java.lang.Math.*;


public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;           //step to move
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        if(direction<0){
            direction=abs(direction)+180;
        }
        this.xDelta = speed*(float)cos(toRadians(direction));
        this.yDelta = speed*(float)sin(toRadians(direction));
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){         //move one step
        this.x+=this.xDelta;
        this.y+=this.yDelta;
    }

    public void reflectHorisontal(){
        setxDelta(-getxDelta());
    }

    public void reflectVertical(){
        setyDelta(-getyDelta());
    }

    @Override
    public String toString() {
        return "Ball[" +
                "(" + x +
                ","+ y +
                "), speed=(" + xDelta +
                "," + yDelta +
                ")]";


    }
}
