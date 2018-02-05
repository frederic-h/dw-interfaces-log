package service.di;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import service.api.HelloResource;
import service.api.HelloResourceMockImpl;

@SuppressWarnings("unused")
public class MockBinder extends AbstractBinder {

    @Override
    protected void configure() {
        bind(HelloResourceMockImpl.class).to(HelloResource.class);
    }
}
