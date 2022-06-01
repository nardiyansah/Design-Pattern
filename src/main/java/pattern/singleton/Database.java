package pattern.singleton;

import java.util.Random;

public class Database {

    private final Integer PORT;

    public Database() {
        Random random = new Random();
        this.PORT = random.nextInt(10000);
    }

    public Integer getPort() {
        return PORT;
    }
}
