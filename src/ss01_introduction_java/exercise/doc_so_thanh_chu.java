package ss01_introduction_java.exercise;

import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class doc_so_thanh_chu {
    public static void main(String[] args) {
        String number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your number: ");
        number = scanner.nextLine();
        if (number.charAt(0)==0){
            if (number.charAt(1)==0){
                System.out.println("this number call vietnamese is: " + number.charAt(2));
            }
            else {
                System.out.println("this number call vietnamese is: " + number.charAt(1) + " muoi " + number.charAt(2));
            }
        }
            else {
                System.out.println("this number call vietnamese is: "+number.charAt(0) + " tram " + number.charAt(1) + " muoi " + number.charAt(2));
            }
        }
    }

