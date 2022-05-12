package config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MongoConfig {

    private String uri = "mongodb://root:example@localhost:27017";

    MongoClient client = MongoClients.create(uri);

    public MongoClient getClient() {
        return client;
    }

}
