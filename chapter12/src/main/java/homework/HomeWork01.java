package homework;

public class HomeWork01 {
    public static void main(String[] args) {
        try {
            if (args.length != 2){
                throw new ArrayIndexOutOfBoundsException("参数数目不对");
            }
            double n1 = Double.parseDouble(args[0]);
            double n2 = Double.parseDouble(args[1]);
            double cal = cal(n1, n2);
            System.out.println(cal);//Infinity无穷
            System.out.println( 1 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("参数格式不正确");
        }catch (ArithmeticException e){
            System.out.println("出现除0异常");
        }
    }

    //编写计算机类
    public static double cal(double n1, double n2) {
        return n1 / n2;
    }
}
