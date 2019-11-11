package com.file3.mycomplex;

import static java.lang.Math.sqrt;

public class MyComplex {
    private double real=0.0;
    private double imag=0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real=real;
        this.imag=imag;
    }

    @Override
    public String toString() {
        return "(" +
                real +
                imag +
                "i)";
    }

    public boolean isReal(){
        return imag==0;
    }

    public boolean isImaginary(){
        return real==0;
    }

    public boolean equals(double real, double imag) {
        return this.real==real&&this.imag==imag;
    }

    public boolean equals(MyComplex another) {
        return this.real==another.real&&this.imag==another.imag;
    }

    public double magnitude(){
        return sqrt(real*real+imag*imag);
    }

    public double argument(){
        return Math.asin(imag/magnitude());
    }  //in radians

    public MyComplex add(MyComplex right){
        right.real=this.real+right.real;
        right.imag=this.imag+right.imag;
        return right;
    }

    public MyComplex addNew(MyComplex right){
        MyComplex result = new MyComplex();
        result.real=this.real+right.real;
        result.imag=this.imag+right.imag;
        return result;
    }


    public MyComplex subtract(MyComplex right){
        MyComplex result = new MyComplex();
        right.real=right.real-this.real;
        right.imag=right.imag-this.imag;
        return right;
    }

    public MyComplex subtractNew(MyComplex right){
        MyComplex result = new MyComplex();
        result.real=this.real-right.real;
        result.imag=this.imag-right.imag;
        return result;
    }

    public MyComplex multiply(MyComplex right){
        right.real=right.real*this.real-right.imag*this.imag;
        right.imag=right.real*this.imag+right.imag*this.real;
        return right;
    }

    public MyComplex divide(MyComplex right){
        right.real=(this.real*right.real+this.imag*right.imag)/(this.real*this.real+this.imag*this.imag);
        right.imag=(this.imag*right.real-this.real*right.imag)/(right.real*right.real+right.imag*right.imag);
        return right;
    }

    public MyComplex conjugate(){
        MyComplex result = new MyComplex();
        result.real=this.real;
        result.imag=-this.imag;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return Double.compare(myComplex.real, real) == 0 &&
                Double.compare(myComplex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + (int)Double.doubleToLongBits(real);
        result = 31*result + (int)Double.doubleToLongBits(imag);
        return result;
    }
}
