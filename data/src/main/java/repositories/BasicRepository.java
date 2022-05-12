package repositories;

import java.util.Arrays;

import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import config.MongoConfig;


public class BasicRepository {

    MongoConfig config = new MongoConfig();

    MongoClient client = config.getClient();
}
