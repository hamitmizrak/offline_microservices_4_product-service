package com.hamitmizrak.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// Eureka
@EnableDiscoveryClient
@SpringBootApplication
public class ProductServiceApplication {

     /*
 @PostConstruct
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("IST"));
    }
 */

    // PSVM
    public static void main(String[] args) {

        // devtools active isActive
        // System.setProperty("spring.devtools.restart.enabled","true");

        // PORT Ayarlamak
        /*
        SpringApplication app = new SpringApplication(TurgutUniversitySpringAllInOneApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8083"));
        app.run(args);
         */

        // JOptional pane aktif etmek
        System.setProperty("java.awt.headless", "false");

        // Main
        SpringApplication.run(ProductServiceApplication.class, args);
    }

}
