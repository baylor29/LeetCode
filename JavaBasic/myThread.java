package JavaBasic;

import java.lang.Object;


public class myThread extends Thread {

    public static void main(String[] args) {
        int x = 9;
        myThread mt = new myThread("newThread");
        myThread mt1 = new myThread("newThread1");
        func(2);
        mt.start();
        mt1.run();


    }

    static int func(int x) {
        return x * 2;
    }

    public myThread(String name){
        super(name);
    }

    public void run(){
        for (int i = 0; i <10; i++){
            System.out.println(Thread.currentThread().getName()+"   "+i);
        }
    }



}


