package com.techhub.greeter.service.anniversary;

import com.techhub.greeter.service.api.GreeterService;

public class AnniversaryGreeterService implements GreeterService {

    @Override
    public String greet(String name) {

        return "WISH YOU VERY HAPPY ANNIVERSARY "+name;
    }
}
