package com.company;

public class Sqrt {

    public static void koren(float a, float b, float c){
        double x1, x2;
        double x;

        double d;
        d = b * b - 4 * a * c;
        System.out.println("Дискиминант равен = " + d);
        if(d>0){
            x1 = (-b - Math.sqrt(d) )/ 2* a;
            x2 = (-b + Math.sqrt(d) )/ 2* a;
            System.out.println("1-ый корень уровнения = " + x1);
            System.out.println("2-ой корень уровнения = " + x2);
        }
        else if(d==0){
            x=-(b*b)/2*a;
            System.out.println("Корень равен = "+ x);

        }
        else
            System.out.println("Решений нет");
        }
    }


