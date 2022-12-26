package ss01_introduction_java.exercise;

import java.util.Scanner;

public class hien_thi_loi_chao {
    public static void main(String[] args) {
        String name;
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter your name: ");
        name = scanner.nextLine();
        System.out.println("Hello: "+name);
    }
}
