package pattern.singleton;

import java.util.Random;

public class Database {

    private static Database database;

    private final Integer PORT;

    private Database() {
        Random random = new Random();
        this.PORT = random.nextInt(10000);
    }

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    public Integer getPort() {
        return PORT;
    }
}
