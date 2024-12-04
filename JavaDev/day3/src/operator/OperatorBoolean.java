package operator;

public class OperatorBoolean {
    public static void main(String[] args) {
        System.out.println(true || false);//有真即为真
        System.out.println(true || true);
        System.out.println(false || false);
        int n = 10;
        System.out.println(n > 4 || (n = 15) < 100);//true
        System.out.println(n);//n=10 只要出现true 后面表达式不再判断

        System.out.println( );
        System.out.println(true && true);//全真才为真
        System.out.println(true && false);
        System.out.println(false && false);
        int m = 3;
        System.out.println(m > 4 && (m = 10) < 100);//false
        System.out.println(m);//3//true//只要出现false 后面表达式不再判断

        System.out.println();
        System.out.println(!true);

    }
}
