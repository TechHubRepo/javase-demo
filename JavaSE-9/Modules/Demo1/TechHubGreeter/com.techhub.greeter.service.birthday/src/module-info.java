module com.techhub.greeter.service.birthday {
    requires com.techhub.greeter.service.api;
    provides  com.techhub.greeter.service.api.GreeterService with com.techhub.greeter.service.birthday.BirthdayGreeterService;
}