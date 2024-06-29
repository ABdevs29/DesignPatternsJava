package creational.singleton.earlyloading;

public class Client {
    public static void main(String [] args) {
        DBConn db1 = DBConn.createInstance();
        DBConn db2 = DBConn.createInstance();
    }
}
