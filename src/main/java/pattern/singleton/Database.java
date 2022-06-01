package pattern.singleton;

import java.util.Random;

public class Database {

    private final Integer port;

    public Database() {
        Random random = new Random();
        this.port = random.nextInt(10000);
    }

    public Integer getPort() {
        return port;
    }
}
