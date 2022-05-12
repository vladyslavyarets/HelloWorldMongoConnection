# HelloWorldMongoConnection
Simplest example for connection to mongoDB@docker


### Prerequisites:
 1) Java 11
 2) Maven
 3) Docker

### How to launch:
1) Clone repo.
2) Open project through IDE and load all dependencies.
3) Execute `docker-commpose` from the `launch` directory.
4) Wait to containers setup. For continue the `launch-mongo` container should
have the following log:
```aidl
{"t":{"$date":"2022-05-12T00:34:58.207+00:00"},"s":"I",  "c":"NETWORK",  "id":23016,   "ctx":"listener","msg":"Waiting for connections","attr":{"port":27017,"ssl":"off"}}
```
5) Execute `MongoExec` from `${projectRoot}/data/src/main/java/execution`


## Expected result:

![exec1](/docs/readme%20media/1.jpg)