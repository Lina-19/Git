package com.example.demo;

import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo3Application  {

    public static void main(String[] args) {

        SpringApplication.run(Demo3Application.class, args);

    }
    @Bean
 CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            Patient patient;
            patientRepository.save(new Patient(null,"test","test1","email@gmail.com","314544563464","jvlgvlvlfjv;","6465463dzef",null,null));
        };
 }

}
