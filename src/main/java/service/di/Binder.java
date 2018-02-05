package service.di;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import service.api.HelloResource;
import service.api.HelloResourceImpl;

@SuppressWarnings("unused")
public class Binder extends AbstractBinder {

    @Override
    protected void configure() {
        bind(HelloResourceImpl.class).to(HelloResource.class);
    }
}
