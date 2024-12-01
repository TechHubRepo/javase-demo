package com.techhub.greeter.service.birthday;

import com.techhub.greeter.service.api.GreeterService;

public class BirthdayGreeterService implements GreeterService {

    @Override
    public String greet(String name) {
        return "WISH YOU VERY HAPPY BIRTHDAY "+name;
    }
}


