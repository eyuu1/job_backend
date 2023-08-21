package com.example.BackEnd.campany;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class CampanyConfig {

    @Bean
    CommandLineRunner commandLineRunner(CampanyRepository repository){
        return args -> {
            Campany medroc = new Campany(
                    "medroc investment group",
                    "medroc@gmail.com"
            );

            Campany adamakorkoro = new Campany(
                    "adama plc group",
                    "adama@gmail.com"
            );

            repository.saveAll(
                    List.of(medroc,adamakorkoro));
        };

    }
}
