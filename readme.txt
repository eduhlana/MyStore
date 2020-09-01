#Para executar o sistema:
To the framework work as well it is required
 -Maven 
 -Java

Open a terminal inside this root directory: 

Run the following comand

mvn install 

#To execute order test
 -mvn test -Dtest=exec.OrderTest

#To execute login Test 
 -mvn test -Dtest=exec.LoginTest

#To execute contact test
 -mvn test -Dtest=exec.ContactUsTest

#To execute Register test
 -mvn test -Dtest=exec.RegisterTest


#To execute all
 -mvn test -Dtest=exec.*
