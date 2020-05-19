package com.wanghengbing.myInterfaceAbs;

public class Rectangle implements MyInterfaceAbs{

    private float width;
    private float high;

    public Rectangle(float width,float high){
        this.width = width;
        this.high = high;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public float getWidth() {
        return width;
    }

    public float getHigh() {
        return high;
    }

    @Override
    public float perimeter() {
        return this.width + this.high;
    }

    @Override
    public float measure() {
        return this.width * this.high;
    }

    @Override
    public String info() {
       return this.toString();
    }
}
