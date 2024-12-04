package supermarket;

import java.util.Scanner;

public class supermarketTicket {
    public static void main(String[] args) {
        System.out.print("请输入第一件商品的名称：");
        Scanner scan = new Scanner(System.in);
        String Good1 = scan.next();
        System.out.print("请输入第一件商品的数量：");
        int Good1Quantity = scan.nextInt();
        System.out.print("请输入第一件商品的单价：");
        double Good1price = scan.nextDouble();
        System.out.println("第一件商品录入成功！");

        System.out.print("请输入第二件商品的名称：");
        String Good2 = scan.next();
        System.out.print("请输入第二件商品的数量：");
        int Good2Quantity = scan.nextInt();
        System.out.print("请输入第二件商品的单价：");
        double Good2price = scan.nextDouble();
        System.out.println("第二件商品录入成功！");

        System.out.print("请输入第三件商品的名称：");
        String Good3 = scan.next();
        System.out.print("请输入第三件商品的数量：");
        int Good3Quantity = scan.nextInt();
        System.out.print("请输入第三件商品的单价：");
        double Good3price = scan.nextDouble();
        System.out.println("第三件商品录入成功！");
        double Good1Amount = Good1price * Good1Quantity;
        double Good2Amount = Good2price * Good2Quantity;
        double Good3Amount = Good3price * Good3Quantity;
        System.out.println("***欢迎来到旺旺超市***");
        System.out.println("--------------------------");
        System.out.println("商品名称      数量      单价      金额");
        System.out.println(Good1 + "        " + Good1Quantity + "        " + Good1price + "        " + Good1Amount);
        System.out.println(Good2 + "        " + Good2Quantity + "        " + Good2price + "        " + Good2Amount);
        System.out.println(Good3 + "        " + Good3Quantity + "        " + Good3price + "        " + Good3Amount);
        System.out.println("--------------------------");
        int TotalQuantity = Good1Quantity + Good2Quantity + Good3Quantity;
        double TotalAmount = Good1Amount + Good2Amount + Good3Amount;
        double Discountedprice = (TotalQuantity > 10 || TotalAmount > 100) ? (TotalAmount / 2) : 0;
        double TruePrice = TotalAmount - Discountedprice;
        System.out.println("总数量：" + TotalQuantity);
        System.out.println("总金额：" + TotalAmount);
        System.out.println("已优惠金额；" + Discountedprice);
        System.out.println("实付金额：" + TruePrice);
    }
}
