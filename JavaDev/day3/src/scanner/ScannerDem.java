package scanner;
import java.util.Scanner;
public class ScannerDem {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);//重要链接键盘
    int i= scan.nextInt();//only int
    System.out.println("i="+i);

    String str = scan.next();//string also can be scanned
    System.out.println("str="+str);
    }
}
