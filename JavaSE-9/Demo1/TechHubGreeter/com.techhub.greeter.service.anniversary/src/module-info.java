module com.techhub.greeter.service.anniversary {
    requires com.techhub.greeter.service.api;
    provides com.techhub.greeter.service.api.GreeterService with com.techhub.greeter.service.anniversary.AnniversaryGreeterService;
}