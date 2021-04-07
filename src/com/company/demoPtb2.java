package com.company;

import java.util.Scanner;

public class demoPtb2 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        a = sc.nextDouble();
        System.out.println("Enter b:");
        b = sc.nextDouble();
        System.out.println("Enter c:");
        c = sc.nextDouble();
        Pt2 phuongtrinh1 = new Pt2(a, b, c);
        System.out.println("Delta la : " + phuongtrinh1.getDelta());
        phuongtrinh1.getX();

    }
}
