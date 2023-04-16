package com.nobrainer.springboot.demo.helloworldapp;

import com.nobrainer.springboot.demo.helloworldapp.entity.Student;
import com.nobrainer.springboot.demo.helloworldapp.repository.StudentDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloWorldBatchApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldBatchApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDao studentDao) {
        return runner ->
           createStudent(studentDao);
    }

    private void createStudent(StudentDao studentDao) {
        studentDao.save(
                Student.builder()
                        .firstName("alex")
                        .lastName("bob")
                        .email("alex.bob@bob.com")
                        .build());
    }

}
