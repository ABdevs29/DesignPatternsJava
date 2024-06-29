package creational.singleton.singlethreaded;

public class DBConn {
    private static DBConn dbConn = null;
    private DBConn(){};

    public static DBConn createInstance () {
        if(dbConn == null) {
            dbConn = new DBConn();
        }
        return dbConn;
    }
}
