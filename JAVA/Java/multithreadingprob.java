import java.util.*;

class AvailableTicket {
    int av1;
    int reqJ;
    int reqM;

    public AvailableTicket(int availtickets, int reqjohn, int reqmike) {
        this.av1 = availtickets;
        this.reqJ = reqjohn;
        this.reqM = reqmike;
    }

    public synchronized void booking() {
        if (Thread.currentThread().getName() == "John") {

            if (av1 >= reqJ) {
                System.out.println("John:booked:" + reqJ);
                av1 = av1 - reqJ;
            } else {
                System.out.println("John:notbooked:");
            }
        } else {

            if (av1 >= reqM) {
                System.out.println("Mike:booked:" + reqM);
                av1 = av1 - reqM;
            } else {
                System.out.println("Mike:notbooked:");
            }
        }
    }
}

public class multithreadingprob extends Thread {
    static AvailableTicket avlTic;

    public void run() {
        // System.out.println("Running...");
        avlTic.booking();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int availtickets = sc.nextInt();
        int reqjohn = sc.nextInt();
        int reqmike = sc.nextInt();
        avlTic = new AvailableTicket(availtickets, reqjohn, reqmike);
        multithreadingprob t1 = new multithreadingprob();
        multithreadingprob t2 = new multithreadingprob();
        // Thread t1 = new Thread();
        // Thread t2 = new Thread();
        t1.setName("John");
        t2.setName("Mike");
        t1.setPriority(10);
        t1.start();
        t2.start();

    }
}