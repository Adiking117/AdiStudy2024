class MyData {
    int value;
    boolean flag = true;

    synchronized public void set(int v){
        while(flag!=true){
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }      
        value = v;
        flag = false;
        notify();
    }

    synchronized public int get(){
        int x = 0;
        while (flag!=false) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        x = value;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread{
    MyData d;
    Producer(MyData data){
        d= data;
    }
    public void run(){
        int i = 0;
        while (i<10000) {
            d.set(i);
            System.out.println("Producer:"+i);
            i++;
        }
    }
}

class Consumer extends Thread{
    MyData d;
    Consumer(MyData data){
        d= data;
    }
    public void run(){
        int i = 0;
        while (i<10000) {
            int val = d.get();
            System.out.println("Consumer:"+val);
            i++;
        }
    }
}



class InterThreadComm {
    public static void main(String[] args) {
        MyData d = new MyData();

        Producer p = new Producer(d);
        Consumer c = new Consumer(d);

        p.start();
        c.start();
    }
}
