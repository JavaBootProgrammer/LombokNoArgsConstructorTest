package com.google;

import com.google.vehcle.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokNoArgsConstructorTest {

    public static void main(String[] args) {
        SpringApplication.run(LombokNoArgsConstructorTest.class, args);

        Car car = new Car();
        System.out.println(car);

    }

}
