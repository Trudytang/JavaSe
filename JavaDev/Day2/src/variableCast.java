public class variableCast {
    public static void main(String[] args) {
        /*范围小的直接转换为范围大的数据类型
        整数默认为int类型
        小数默认为double类型
         */
        //隐式 implicit 小范围变大范围 automatically cast
        long b = 134;//自转134
        int i = 13;
        double d1 = 17;//自转17.0
        double d2 = i;//自转13.0
        System.out.println(d1);
        System.out.println(i);
        System.out.println(d2);
        System.out.println(b);
        long l = 223344455555L;//编译时不在默认为int 而是long类型
        System.out.println(l);
        double d = 3.14;
        float f = 3.14f;//小数默认为double所以要加f
        System.out.println(f);
        System.out.println(d);
        //显式 explicit 大范围变小范围 manual cast
        int i1 = (int)3.14;
        byte b4 = 13;//byte的范围为-128~127 automatically
        System.out.println(i1);
        System.out.println(b4);

    }
}
