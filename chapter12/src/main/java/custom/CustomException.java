package custom;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        //1. int age = sc.nextInt();
        //            //至于什么时候抛出异常和之前一样，是由我们决定的
        //            if (age < 18 || age > 120){
        //                throw new AgeException("年龄异常");
        //            }

        //2.
        try {
            //至于什么时候抛出异常和之前一样，是由我们决定的
            if (age < 18 || age > 120) {
                throw new AgeException("年龄异常");
            }
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("年龄符合要求");
    }
}

//自定义一个异常
//1.一般情况下，我们自定义异常是继承RunTimeException
//2.即把自定义异常做成运行时异常，好处是：我们可以使用默认处理机制，比较方便，如果做成Exception那么我们需要显示的处理
class AgeException extends RuntimeException {
    //将异常信息传入到构造器中，传入到RunTimeException再传入到父类Throwable，再抛出信息

    public AgeException(String message) {
        super(message);
    }
}
