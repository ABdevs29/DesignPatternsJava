package creational.singleton.multithreaded;

public class Client {
    public static void main(String [] args) {
        Thread t1 = new Thread(DBConn.createInstance());
        Thread t2 = new Thread(DBConn.createInstance());

        t1.start();
        t2.start();
    }
}
