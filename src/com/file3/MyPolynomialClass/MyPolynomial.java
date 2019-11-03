package com.file3.MyPolynomialClass;

import java.util.Arrays;

import static java.lang.Math.pow;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double...coeffs) {
        this.coeffs = new double[coeffs.length];
        this.coeffs = Arrays.copyOf(coeffs, coeffs.length);
    }

    public int getDegree(){
        return this.coeffs.length-1;
    }

    @Override
    public String toString() {
        String s = Double.toString(coeffs[0]);
        for(int i=1;i<coeffs.length;i++){
            s=Double.toString(coeffs[i])+"x^"+i+"+"+s;
        }
        return s;
    }

    public double evaluate(double x){
        double result=0;
        for(int i=0;i<coeffs.length;i++){
            result+=coeffs[i]*pow(x,i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right){
        double arr[];
        if(this.coeffs.length>right.coeffs.length) {
            arr = new double[this.coeffs.length];
            for (int i = 0; i <right.coeffs.length;i++){
                arr[i]=this.coeffs[i]+right.coeffs[i];
            }
            System.arraycopy(this.coeffs, right.coeffs.length, arr, right.coeffs.length, this.coeffs.length-right.coeffs.length);
        }
        else{
            arr = new double[right.coeffs.length];
            for (int i = 0; i <this.coeffs.length;i++){
                arr[i]=this.coeffs[i]+right.coeffs[i];
            }
            System.arraycopy(right.coeffs, this.coeffs.length, arr, this.coeffs.length, right.coeffs.length-this.coeffs.length);
        }
        MyPolynomial myPolynomial = new MyPolynomial(arr);
        return myPolynomial;
    }


    public MyPolynomial multiply(MyPolynomial right){

        double arr[] = new double[this.coeffs.length+right.coeffs.length];
        for(int i=0;i<this.coeffs.length;i++){
            for (int j=0;j<right.coeffs.length;j++){
                arr[i+j]=this.coeffs[i]*right.coeffs[j];
            }
        }
        MyPolynomial myPolynomial = new MyPolynomial(arr);
        return myPolynomial;
    }
}
