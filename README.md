Prerequisites
-------------

- Install JDK 7, meaning also set JAVA_HOME
```
[master]~/Documents/Projects/SampleProject/SampleJavaProject: java -version
java version "1.7.0_25"
Java(TM) SE Runtime Environment (build 1.7.0_25-b15)
Java HotSpot(TM) 64-Bit Server VM (build 23.25-b01, mixed mode)
```
- Install Maven 3, meaning also set MVN_HOME
```
[master]~/Documents/Projects/SampleProject/SampleJavaProject: mvn -version
Apache Maven 3.0.3 (r1075438; 2011-02-28 09:31:09-0800)
Maven home: /usr/share/maven
Java version: 1.7.0_25, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.7.0_25.jdk/Contents/Home/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.8.5", arch: "x86_64", family: "mac"
```
- Install IDE of your choice, eclipse or intellij

Commands to run:
------
```
1) mvn clean install
2) mvn eclipse:eclipse or mvn idea:idea
3) mvn tomcat:run
4) http://localhost:8080/my-webapp/welcome should come up
```
