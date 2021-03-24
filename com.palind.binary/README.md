### Build

mvn clean install

### Run

mvn spring-boot:run

### Services to Run in Sequence

    1) registry
    2) palind-binary
    
### Swagger Endpoint

  http://localhost:8007/swagger-ui.html
  
### DB details

    - Launch following url for h2 client, http://localhost:8007/h2-console/   and fill in below details,
    - Driver Class : org.h2.Driver
    - Jdbc Url :    jdbc:h2:mem:testdb
    - Username : sa
    - Password : password