package org.derryfield.math;

public class Geometry {
    public static double getVolSphere(double r){
        double vol = 4.0/3.0 * Math.PI*r*r*r;
        return vol;
    }

    public static double getAreaSphere(double r){
        double surface = 4.0 * Math.PI * r * r;
        return surface;
    }
    
}
