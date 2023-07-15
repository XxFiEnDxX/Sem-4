// class Hi implements Runnable{
//     public void run(){
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(200);
//             } catch (Exception e) {}
//         }
//     }
// }

// class Hello implements Runnable{
//     public void run(){
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(200);
//             } catch (Exception e) {}
//         }
//     }
// }

public class _17_Threads {
    public static void main(String[] args) throws Exception{
        // Runnable obj1 = ()->{
        //         for (int i = 0; i < 5; i++) {
        //             System.out.println("Hi");
        //             try {
        //                 Thread.sleep(200);
        //             } catch (Exception e) {}
        //         }
        //     };

        // Runnable obj2 = ()->{
        //         for (int i = 0; i < 5; i++) {
        //             System.out.println("Hella");
        //             try {
        //                 Thread.sleep(200);
        //             } catch (Exception e) {}
        //         }
        //     };


        // Hi obj1 = new Hi();
        // Hello obj2 = new Hello();

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi "+Thread.currentThread().getPriority());
                try {
                    Thread.sleep(200);
                } catch (Exception e) {}
            }
        }, "Thread - HI");
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello ");
                try {
                    Thread.sleep(200);
                } catch (Exception e) {}
            }
        },"Thread - Hello");

        //Range of priority (1-10);
        t1.setPriority(1);
        t2.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        // System.out.println(t1.getName());
        // t1.setName("Thread - Hi");
        // System.out.println(t1.getName());


        // System.out.println(t1.isAlive()+"1");
        t1.start();
        t2.start();
        
        // System.out.println(t1.isAlive()+"2");
        t1.join();
        t2.join();
        
        // System.out.println(t1.isAlive()+"3");
        System.out.println(".....");
    }
}
