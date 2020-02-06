# Workshop: Test-Driving Your Domain Core

This repository should contain everything to get you started with Java, Maven, Cucumber and JUnit 5. Just `mvn install` and everything should be set up.

`mvn test` should  run both acceptance and unit tests. 

The **acceptance tests** themselves have already been written for you - you just need to provide some "glue" to run the application. You should do that in [ShoppingCartSteps](src/test/java/eu/ddd/ShoppingCartSteps)

**Caution**: Please note that Java 5 uses different annotations than Java 4 - any potential problems may well be related to faulty imports.
