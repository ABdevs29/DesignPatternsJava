package creational.singleton.multithreaded;

public class DBConn implements Runnable {
    private static volatile DBConn dbConn = null;
    private DBConn(){};

    public static DBConn createInstance () {
        if(dbConn == null) {
            synchronized (DBConn.class) {
                if(dbConn == null) {
                    dbConn = new DBConn();
                }
            }
        }
        return dbConn;
    }

    @Override
    public void run() {
        createInstance();
    }
}
