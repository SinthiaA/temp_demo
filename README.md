**Summery**: TradesyCart Readme

**Purpose**: The purpose of this documentation is to explain the automation framework that was set up in order to run test cases for tradesy cart. It should help understanding the steps that were taken for test case verification.

**Tools**:
Intellij IDEA and ChromeDriver

**Language**:
Java

**Installations**:

In order to run the test, the user must have the following installations.
Download Intellij IDEA by following the instructions provided in this link:

    https://www.jetbrains.com/help/idea/installation-guide.html#standalone. 
    
After downloading Intellij open an empty project or an existing project if available and add the following dependencies into the pom.xml file. The following section is project information. This will vary based on the user's current project that they are using.

     <?xml version="1.0" encoding="UTF-8"?>
     <project xmlns="http://maven.apache.org/POM/4.0.0"
     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
     http://maven.apache.org/xsd/maven-4.0.0.xsd">
     <modelVersion>4.0.0</modelVersion>
     <groupId>org.example</groupId>
     <artifactId>Test</artifactId>
     <version>1.0-SNAPSHOT</version>

This section is needed to run tests. These are the dependencies that should be included before scripting any test cases.

     <build>
     <plugins>
     <plugin>
     <groupId>org.apache.maven.plugins</groupId>
     <artifactId>maven-compiler-plugin</artifactId>
     <version>3.6.1</version>
     <configuration>
     <release>12</release>
     <source>12</source>
     <target>12</target>
     </configuration>
     </plugin>
     </plugins>
     </build>
     <dependencies>
     <!--
     https://mvnrepository.com/artifact/org.seleniumhq.selenium/seleniu
     m-java -->
     <dependency>
     <groupId>org.seleniumhq.selenium</groupId>
     <artifactId>selenium-java</artifactId>
     <version>3.141.59</version>
     </dependency>
     <!-- https://mvnrepository.com/artifact/org.testng/testng
     -->
     <dependency>
     <groupId>org.testng</groupId>
     <artifactId>testng</artifactId> 
     <version>6.14.3</version>
     <scope>test</scope>
     </dependency>
     </dependencies>
     </project>
          
Once the dependencies are added refresh the project by clicking on the reload icon on the top right corner of the file or by right clicking on the
pom.xml file > then scroll down to maven option > and click on the reload project

Next, download Chromedriver for Mac or Windows machines based on preferences. Follow the instructions provided in this link:

    https://chromedriver.chromium.org/

Keep in mind the Chromedriver version must be same as Chrome browser version that the user is using. 

    Note - if user would like to run test in other browsers follow instructions from the link below:
      Edge: https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
      Firefox: https://github.com/mozilla/geckodriver/releases
      Safari: https://webkit.org/blog/6900/webdriver-support-in-safari-10/

  Once download is completed
    Go to the downloads folder > unzip the file > drag the chromedriver to the current project > go to pom.xml file > reload the project one more time.
    
      Do the same steps for other browsers if user would like to run tests on different browsers

**Setting up the first Test**:

Go to project > Expand the current project > Expand the src folder > Expand test folder > Expand java folder (This should be empty unless there has been other test added in the past) > Right click on the java folder > Click on New > Click on Java Class > Add in title of class file ex. TradesyCart > Begin Scripting
