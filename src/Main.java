//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.Logger logger = System.getLogger(Main.class.getName());
//        Box B = new Box();
//        B.printVolume();
//        Scanner in = new Scanner(System.in);

//        Surface square = new Surface(50);
//        Surface circle = new Surface(10.0);
//        Surface rectangle = new Surface(5, 50);
//        System.out.println("Square : " + square.getArea());
//        System.out.println("Circle : " + circle.getArea());
//        System.out.println("Rectangle : " + rectangle.getArea());

//        II_Year student = new II_Year(null, -35, "Android");
//        student.displayDetails();
//        BankAccount account = new BankAccount("000212", "Shryansh");
//        account.deposit(1000);
//        try {
//            account.withdraw(500);
//            account.withdraw(1000);
//        } catch (InsufficientFundsException e) {
////            System.err.println(e.getMessage());
//            logger.log(System.Logger.Level.valueOf("ERROR"), e.getMessage());
//        }

//        A a = new A();
//        B b = new B();
//        C c = new C();
//        a.run();
//        b.run();
//        c.run();

        A a = new A();
        B b = new B();
        a.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.MIN_PRIORITY);
        a.start();
        b.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        a.stopThread();
//        b.stopThread();
//
//        System.out.println(a.count + " " + b.count + " " + (b.count - a.count));
    }
//    579612202 585993964
}