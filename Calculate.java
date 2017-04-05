public class Calculate{

    public static void main(String[] arg) {   
        System.out.println("Calculate...");
        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        int summ = first + second;
        int razn = first - second;
        int proizv = first * second;
        int delen = first / second;
        System.out.println("Sum" + summ);
        System.out.println("razn" + razn);
        System.out.println("proizv" + proizv);
        System.out.println("delen" + delen);
    }
}