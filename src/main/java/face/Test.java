package face;


public class Test {
    public static void main(String[] args) {
        MajusculeABC maj = new MajusculeABC();
        Thread t_a = new Thread(new Thread_ABC(maj , 'A'));
        Thread t_b = new Thread(new Thread_ABC(maj , 'B'));
        Thread t_c = new Thread(new Thread_ABC(maj , 'C'));
        t_a.start();
        t_b.start();
        t_c.start();
    }
}

class MajusculeABC {
    // 请补充代码
    public static  int count =10;
    public static  char currentName ='A';
}


class Thread_ABC implements Runnable {
    // 请补充代码
    private MajusculeABC major;
    private char name;

    public Thread_ABC(MajusculeABC major,char name){
        this.major =major;
        this.name = name;
    }

    public void run() {
        int i =0;
        while( i< MajusculeABC.count){
            synchronized (major){
                while(name != MajusculeABC.currentName){
                    try {
                        major.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(name);
                i++;
                switch (name){
                    case 'A' :
                        MajusculeABC.currentName='B';
                        break;
                    case 'B' :
                        MajusculeABC.currentName='C';
                        break;
                    case 'C':
                        MajusculeABC.currentName='A';
                        break;
                }
                major.notifyAll();
            }
        }
    }
}