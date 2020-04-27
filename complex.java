
/**
 * complex
 */

import java.util.Objects;
import java.util.Scanner;

public class complex {
    private double re; // defining variable real part of complex number
    private double img; // imaginary part of complex number

    // Connstructor with parameters
    complex(double real, double image) {
        re = real;
        img = image;
    }

    // return a string representation of invoking instance
    public String toString() {
        if (img == 0)
            return re + "";
        if (re == 0)
            return img + "i";
        if (img < 0)
            return re + " - " + (-img) + "i";
        return re + " + " + img + "i";
    }

    // return abs/magnitude
    public double abs() {
        return Math.hypot(re, img);
    }

    // return after adding another complex number
    public complex plus(complex b) {
        complex a = this; // invokin object
        double real = a.re + b.re;
        double imag = a.img + b.img;
        return new complex(real, imag);
    }

    // return a new complex object whose value is (this*b)
    public complex times(complex b) {
        complex a = this;
        double real = (a.re * b.re) - (a.img * b.img);
        double imag = (a.re * b.img) + (a.img * b.re);
        return new complex(real, imag);

    }

    // sample client for testing
    public static void main(String[] args) {
        Scanner ans = new Scanner(System.in);
        char ch = 'Y';
        int input;
        System.out.print("Enter the real part of 1st number:");
        double x = ans.nextDouble();
        System.out.print("Enter the imaginary part of 1st number:");
        double y = ans.nextDouble();
        complex a = new complex(x, y);
        System.out.println(a.toString());
        System.out.print("\nEnter the real part of 2nd number:");
        x = ans.nextDouble();
        System.out.print("Enter the imaginary part of 2nd number:");
        y = ans.nextDouble();
        complex b = new complex(x, y);
        System.out.println(b.toString());
        System.out.println("\n\n**********This is a complex number program***********");
        do {
            System.out.println("-----------Enter Your Choice--------------");
            System.out.println("\n1.Add the numbers\n2.Multiply the numbers\n");
            input = ans.nextInt();
            switch (input) {
                case 1:
                    System.out.println("The sum of numbers is : " + a.plus(b));
                    System.out.print("Do you want to continue?[Y/N]>>");
                    break;
                case 2:
                    System.out.println("The product of numbers is: " + a.times(b));
                    System.out.print("Do you want to continue?[Y/N]>>");
                    break;
                default:
                    System.out.println("Wrong input!!!!");
                    break;
            }
            ch = ans.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');

    }

}