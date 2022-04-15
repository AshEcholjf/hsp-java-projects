package try_;

public class SystemDemo {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
