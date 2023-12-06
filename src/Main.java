import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type either the word Circle or Pyramid.");
        String str = sc.nextLine();
        if(str.equals("Circle")){
            System.out.println("What is the radius?");
            double r = sc.nextDouble();
            Calculate_circle(r);
        }
        else if(str.equals("Pyramid")){
            System.out.println("What is the length?");
            double l = sc.nextDouble();
            System.out.println("What is the width?");
            double w = sc.nextDouble();
            System.out.println("What is the height?");
            double h = sc.nextDouble();
            Calculate_pyramid(l, w, h);
        }else
            System.out.println("Invalid input.");
    }

    static void Calculate_circle(double r){
        System.out.println("Area is " + Math.PI*r*r);
        System.out.println("Circumference is " + 2*Math.PI*r);
    }

    static void  Calculate_pyramid(double l, double w, double h){
        System.out.println("Base area is " + l*w);
        System.out.println("Volume is " + l*w*h/3);
    }
}