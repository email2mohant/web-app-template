package com.nobrainer.springboot.demo.helloworldapp;

import com.nobrainer.springboot.demo.helloworldapp.entity.Student;
import com.nobrainer.springboot.demo.helloworldapp.repository.StudentRepository;
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
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return runner ->
           createStudent(studentRepository);
    }

    private void createStudent(StudentRepository studentRepository) {
        studentRepository.save(
                Student.builder()
                        .firstName("alex")
                        .lastName("bob")
                        .email("alex.bob@bob.com")
                        .build());
        System.out.println("student = " + studentRepository.findById(1));
        System.out.println(studentRepository.count());
        System.out.println(studentRepository.countAllByEmail("alex.bob@bob.com"));
    }

}
