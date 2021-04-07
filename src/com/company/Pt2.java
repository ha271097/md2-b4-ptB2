package com.company;

public class Pt2 {
    double a, b, c;
    public Pt2(){
    }
    public Pt2(double a, double b ,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDelta(){
        return (Math.pow(this.b,2) - 4*(a*c) );
    }
    public void getX(){
        double delta = this.getDelta();
        double x1, x2;
        if(delta < 0){
            System.out.println("PT vo nghiem");
        }
        else if(delta == 0){
            x1 = (-this.b) / ( 2 * this.a );
            System.out.println("Pt co nghiem kep la: ");
            System.out.println("x1,x2 = " + x1);
        }
        else {
            x1 = ((-this.b) - Math.sqrt(delta)) / 2*a;
            x2 = ((-this.b) + Math.sqrt(delta)) / 2*a;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

}
