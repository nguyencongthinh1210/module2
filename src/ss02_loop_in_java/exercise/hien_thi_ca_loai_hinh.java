package ss02_loop_in_java.exercise;

import java.util.Scanner;

public class hien_thi_ca_loai_hinh {
    public static void main(String[] args) {
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("Print isosceles triangle");
        System.out.println("4.Exit");
        Choose();
    }
    public static void Choose(){
        int choose;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your choose: ");
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                Rectangle();
                break;
            case 2:
                Triangle();
                break;
            case 3:
                IsoscelesTriangle();
                break;
            case 4:
                break;
        }
    }
    public static void Rectangle(){
        int height,width;
        Scanner scanner = new Scanner(System.in);
         System.out.println("enter height: ");
         height = Integer.parseInt(scanner.nextLine());
         System.out.println("enter width: ");
         width = Integer.parseInt(scanner.nextLine());
         for (int i=1;i<=height;i++){
             for (int j=1;j<=width;j++){
                 System.out.print(" * ");
             }
             System.out.print("\n");
         }
         Choose();
    }
    public static void  Triangle(){
        int height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter height: ");
        height = Integer.parseInt(scanner.nextLine());
        for (int i=1; i<=height;i++){
            for (int j=1; j<=i;j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i=1; i<=height;i++){
            for (int j=(height-i+1);j>0;j--){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i=1; i<=height;i++){
            for (int t=0;t<i;t++){
                if (t==0){
                }
                else {
                    System.out.print("   ");
                }
            }
            for (int j=(height-i+1); j>0;j--){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i=0;i<height;i++){
            for (int t=0;t<(height-i);t++){
                if (t==0){
                }
                else {
                    System.out.print("   ");
                }
            }
            for (int j=(height-i); j<=height;j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        Choose();
    }
    public static void IsoscelesTriangle(){
        int height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter height: ");
        height = Integer.parseInt(scanner.nextLine());
        for (int i=1; i<(height*2);i+=2){
            for (int j=1;j<(2*height-i);j+=2){
                System.out.print("   ");
            }
            for (int t=(height*2+1-i*2);t<(height*2);t+=2){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        Choose();
    }
}
