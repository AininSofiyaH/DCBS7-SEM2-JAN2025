package chapter2;

public class task7 {
    public static void main(String[] args) {
        int number;

        System.out.println("There are 2 types of increment and 2 types of decrement");
        System.out.println("example of pre-increment is as such, i will use the value of 5 as the starting number:");
        number = 5;
        System.out.println("(before increment):" + number);
        System.out.println("(during increment):" + (++number));
        System.out.println("(after increment):" + number);
        System.out.println();

        System.out.println("example of post-increment is as such");
        number = 5;
        System.out.println("(before increment):" + number);
        System.out.println("(during increment):" + (number++));
        System.out.println("(after increment):" + number);
        System.out.println();

        System.out.println("example of pre-decrement is as such");
        number = 5;
        System.out.println("(before decrement):" + number);
        System.out.println("(during decrement):" + (--number));
        System.out.println("(after decrement):" + number);
        System.out.println();

        System.out.println("example of post-decrement is as such");
        number = 5;
        System.out.println("(before decrement):" + number);
        System.out.println("(during decrement):" + (number--));
        System.out.println("(after decrement):" + number);
        System.out.println();

        System.out.println("hai miss");
    }
}