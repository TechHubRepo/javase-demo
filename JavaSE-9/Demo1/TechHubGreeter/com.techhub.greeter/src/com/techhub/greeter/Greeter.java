package com.techhub.greeter;

import com.techhub.greeter.service.api.GreeterService;

import java.util.List;
import java.util.ServiceLoader;

public class Greeter {

    public static void main(String[] args) {

        String name = args.length==0 ? "Harish Kumar" : args[0];

        ServiceLoader<GreeterService> greeters = ServiceLoader.load(GreeterService.class);
        System.out.println("Services found: " + greeters.stream().count());

        for(GreeterService greeter : greeters) {
            System.out.println(greeter.greet(name));
        }
    }
}
