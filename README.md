# First_Sprint
Tarim Project
Configuration.properties:
properties is a file extension for files mainly used in Java related  technologies to store the configurable parameters of an 
application. They can also be used for storing strings for Internationalization and localization; 
these are known as Property Resource Bundles.
Properties are used to externalize the data which is configurable and if you put that data in your code (test script) you have
to build the code each time you want to change the value of the property. The main advantage of properties is that they are 
outside your source code and you can change them anytime.

Configuration Reader 

	Create a java class named ReadPropertyFile.java inside the same project where config.properties file is created → include 
  “public static main” method and Finish.

Attention : 
System.out.println(conFig.getProperties(“name”));
- Make sure you use the same key as mentioned in properties file. This is case sensitive.
- If you use “Name” (System.out.println(prop.getProperty(“Name”))) instead of “name”, it will print null in console, as “Name” is undefined.
- Also, if you comment “name” property by typing “#” in front of it in config.properties file and try to print “name” property(System.out.println( conFig.getProperties(“name”))), it will print null, as “name” is commented in properties file and hence cannot be accessed.
- Now in future, if your browser is firefox, you just need to update your properties file, instead of editing the class files/ test-scripts. Avoid to make changes in script. Nothing should be hard-coded at test-script level.


