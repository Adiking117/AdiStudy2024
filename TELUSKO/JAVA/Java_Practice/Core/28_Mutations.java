class Counter {
    int count;
    public synchronized void increment(){
        count ++;
    }
    // synchronuzed helps in wehenver a thread is exceuting this method 
    // it will tell the other threads to wait
}


class Mutations {
    public static void main(String[] args) {

        Counter c = new Counter();
    
        Runnable obj1 = () -> {
                for(int i=0 ; i<1000 ; i++){
                    c.increment();
                }
        };
        Runnable obj2 = () -> {
                for(int i=0 ; i<1000  ; i++){
                    c.increment();
                }
        };

        // new state
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // runnable state
        t1.start();
        t2.start();

        // when thread is running on cpu is running state

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
        }

        // it will wait the main method for threads 
        // t1 and t2 to join

        System.out.println(c.count);
        // whenever 2000 comes it means that all thread incremented 
        // variable one at a time i.e thread safe

        // but if value comes different it means thread 
        // executed the variable at the same time


    }
}
