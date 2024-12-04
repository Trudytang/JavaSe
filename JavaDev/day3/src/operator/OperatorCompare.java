package operator;

public class OperatorCompare {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        System.out.println(a=b);//赋值运算 a=b=4
        System.out.println(a == b);//比较运算 true

        System.out.println( );
        System.out.println(4 >= 4);
        System.out.println(4 <= 8);
        System.out.println(4 >= 10);
    }
}
