package service.api;

public class HelloResourceMockImpl implements HelloResource {

    @Override
    public String hello() {
        return "test-world";
    }
}
