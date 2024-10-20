// class A extends Thread{
//     public void run(){
//         for(int i=0 ; i<100 ; i++){
//             System.out.println("Hi");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//         }
//     }
// }

// class A implements Runnable{
//     public void run(){
//         for(int i=0 ; i<100 ; i++){
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B extends Thread{
//     public void run(){
//         for(int i=0 ; i<100  ; i++){
//             System.out.println("Helo");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable{
//     public void run(){
//         for(int i=0 ; i<100  ; i++){
//             System.out.println("Helo");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

class Threads {
    public static void main(String[] args) {
        // A obj1 = new A();
        // B obj2 = new B();

        // obj1.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj1.getPriority()); // priority 1-10


        // obj1.start();
        // obj2.start();
        // in thread class there must be always run method
        // start method will call run method

        Runnable obj1 = () -> {
                for(int i=0 ; i<100 ; i++){
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };
        Runnable obj2 = () -> {
                for(int i=0 ; i<100  ; i++){
                    System.out.println("Helo");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }

}
