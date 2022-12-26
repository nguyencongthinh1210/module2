package ss01_introduction_java.practice;

import java.util.Scanner;

public class su_dung_toan_tu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter width: ");
        float width = scanner.nextFloat();
        System.out.println("enter height: ");
        float height = scanner.nextFloat();
        float s;
        s=width*height;
        System.out.println(s);
    }
}
