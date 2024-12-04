package operator;

public class TribleOperater {
    public static void main(String[] args) {
        /*
        格式
        （条件表达式）？表达式1；表达式2
        如果条件表达式为true 则执行1 否则2
         */
        System.out.println(3<5?"greater":"less");

        int a=4;
        int b=5;
        int c=(a>b?10:20);
        System.out.println(c);//假 所以20
    }
}
