package creational.singleton.earlyloading;

public class DBConn {
    private static final DBConn dbConn = new DBConn();
    private DBConn(){};

    public static DBConn createInstance () {
        return dbConn;
    }
}
