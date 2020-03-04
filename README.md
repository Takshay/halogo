### Prerequisites

* Install **Java 8**
* Nodejs and npm installed latest

In command prompt navigate to  halogo directory and execute following command

```
 ./gradlew clean build
 
 java -jar build/libs/halogo-0.0.1-SNAPSHOT.jar
```

For fron-end navigate to halogo/web-ui/ and execute following command 

```
ng serve --open
```

<em>Program converts billion number into words. Maximum to 2 digit decimal value will be converted.</em>

To test API please execute below command in terminal

```
curl -H "Content-Type: application/json" -X POST -d '{"name":"John","currency":"123"}' http://localhost:8080/convert
```

