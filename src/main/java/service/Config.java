package service;

import io.dropwizard.Configuration;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class Config extends Configuration {

    private Class<? extends AbstractBinder> hk2BinderClass;

    public Class<? extends AbstractBinder> getHk2BinderClass() {
        return hk2BinderClass;
    }
}
