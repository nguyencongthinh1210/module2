package ss02_loop_in_java.exercise;

public class hien_thi_cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        for (int i=2;i<=100;i++){
            if (IsFrime(i)==true){
                System.out.println(i);
            }
        }
    }
    public static boolean IsFrime(int n){

        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
