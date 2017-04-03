import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cordinat1 = scanner.nextInt();
        int cordinat2 = scanner.nextInt();
        if (cordinat1 > 0 && cordinat2 > 0) {
            System.out.println(1);
        }
        if (cordinat1 < 0 && cordinat2 > 0) {
            System.out.println(2);
        }
        if (cordinat1 < 0 && cordinat2 < 0) {
            System.out.println(3);
        }
        if (cordinat1 > 0 && cordinat2 < 0) {
            System.out.println(4);
        }
    }
}
