package creational.singleton.singlethreaded;

public class Client {
    public static void main(String [] args) {
        DBConn db1 = DBConn.createInstance();
        DBConn db2 = DBConn.createInstance();
    }
}
