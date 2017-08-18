# spring-data

# Step-1

# Dependencies

    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
    
# application.properties

spring.jpa.show-sql=true
spring.h2.console.enabled=true
    
# DAO

  @PersistenceContext
	private EntityManager entityManager;   
  
# Test class
public class DatabaseApp implements CommandLineRunner

@Override
	public void run(String... arg0) throws Exception {
  }
