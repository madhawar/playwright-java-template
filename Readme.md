# 🎭 Microsoft Playwright with Java binding template

## 🎭 Playwright for Java docs

https://playwright.dev/java

## 🎭 Playwright Inspector

````
npx playwright codegen thirddriver.medium.com
````

## 🎭 Structure

#### Page Objects Java classes
+ 📁 src
    + 📁 main
        + 📁 java
            - 📂 pages

#### BaseClass.java with browser initiation, resources for JSON data files/ POJO file, and test case Java classes with TestNG annotations
+ 📁 src
    + 📁 test
        + 📁 java
            - 📂 base
                - 📝 BaseClass.java
            - 📂 resources
                - 📝 DataPOJO.java
            - 📂 testcases
#### pom.xml for dependencies such as Playwright, TestNG, Cucumber, Gson and plugins such as maven-compiler, maven-surefire
- 📝 pom.xml

### 🎭 References

https://applitools.com/blog/playwright-java