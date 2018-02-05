package service.api;

public class HelloResourceImpl implements HelloResource {

    @Override
    public String hello() {
        return "world";
    }
}
