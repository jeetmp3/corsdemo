### CORS Control

#### Files

 - run.sh - to run the program use below 
 ```bash
 ./run.sh
 ```
 
 - config.properties - property file contains the key to override origin `cors.allowed.origin=http://blogs.jbisht.com`. You can change origin value from here.
 - src/main/java/demo.cors.filters.MyFilter - class contains the logic to print the config value `cors.allowed.origin`
 - src/main/webapp/WEB-INF/spring-servlet.xml - bean definitions register both the filter as bean so that you can configure properties based on `config.properties` file
 - src/main/webapp/WEB-INF/web.xml - filter & filter-mapping. Note: In both the filters the filter name is same as the bean name in `spring-servlet.xml` file.