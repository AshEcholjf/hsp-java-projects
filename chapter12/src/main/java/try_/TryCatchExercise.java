package try_;

import java.util.Scanner;

public class TryCatchExercise {
    public static void main(String[] args) {
        //使用异常机制规范用户输入的内容是数字
        //思路：
        //创建Scanner对象
        //将重复输入的代码写带while循环里
        //创建一个字符串来接受变量
        //将该变量转换成int型
        //如果抛出NumberFormatException就继续输入
        //如果没有出现异常就退出循环
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true){
            System.out.println("请输入一个整数");
            try {
                num = Integer.parseInt(sc.next());
                //如果这里出现异常就不退出
                break;
            } catch (NumberFormatException e) {
                System.out.println("你的输入有误，需要重新操作");
            }
        }
        System.out.println("你输入的整数是：" + num);
    }
}
