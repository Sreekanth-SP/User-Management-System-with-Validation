package com.geekster.UmsValidation.configuration;

import com.geekster.UmsValidation.model.UmsModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {
    @Bean
    public List<UmsModel> getInitializedList()
    {
        UmsModel initUser = new UmsModel(1,"MS Dhoni","1981-07-07","msd@bcci.com","919800907777", LocalDate.of(2004,12,23), LocalTime.of(7,7));
        List<UmsModel> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }

}