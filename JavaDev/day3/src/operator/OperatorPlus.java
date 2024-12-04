package operator;

public class OperatorPlus {
    public static void main(String[] args) {
        int a = 3;
        double c = 3.5;
        System.out.println(a + c);//6.5
        //运算时 小范围数据值自动类型转换提升为大范围值
        System.out.println((int) (a + c));//6
        //+用在字符串上为拼接作用
        System.out.println("5+5=" + 5 + 5);//5+5=55
        System.out.println("5+5=" + (5 + 5));//5+5=10,先计算(5+5),最后再与 "5+5=" 拼接

        int b=++a;//先计算再赋值
        System.out.println("b="+b);//b=4
        System.out.println("a=" + a);//a=4

        int m=10;
        int n =m++;//先赋值再计算
        System.out.println("m=" + m);//m=10
        System.out.println("n=" + n);//n=11

    }
}
