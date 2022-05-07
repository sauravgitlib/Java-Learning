import java.util.Date;

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        int result = add(5, 5);
        System.out.println(result);
        int input=0;
        do {
            System.out.println("Do first");
            input++;
        } while (input <=1);
        Date date;
        // Date date = new Date();
        System.out.println(date);

    }

    static int add(int x, int y) {
        return x + y;
    }
}
