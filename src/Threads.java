//class A implements Runnable {
//    public void run() {
//        for (int i = 0; i < 5; i++)
//            System.out.println(i);
//    }
//}
//
//class B implements Runnable {
//    public void run() {
//        for (int i = 0; i < 5; i++)
//            System.out.println(i);
//    }
//}
//
//class C implements Runnable {
//    public void run() {
//        for (int i = 0; i < 5; i++)
//            System.out.println(i);
//    }
//}

class call_me {
    synchronized static void call(String msg) {
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println("]");
        }
    }
}

class A extends Thread {
    public void run() {
        call_me.call("Hello");
    }

}

class B extends Thread {
    public void run() {
        call_me.call("World");
        }
}
