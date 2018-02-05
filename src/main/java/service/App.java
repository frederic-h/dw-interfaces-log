package service;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import service.healthchecks.DummyHealthCheck;

public class App extends Application<Config> {

    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public void run(Config configuration, Environment environment) throws Exception {
        // healthchecks
        environment.healthChecks().register("dummy", new DummyHealthCheck());

        // hk2
        environment.jersey().register(configuration.getHk2BinderClass().newInstance());

        // resources
        environment.jersey().packages("service.api");
    }
}
