package service;

import io.dropwizard.testing.junit.DropwizardAppRule;
import org.junit.Rule;
import org.junit.Test;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AppTest {

    @Rule
    public final DropwizardAppRule<Config> appRule = new DropwizardAppRule<>(App.class, "config-test.yaml");

    @Test
    public void testHelloResourceIsMock() {

        // given
        URI target = UriBuilder.fromUri("http://localhost")
                .port(appRule.getLocalPort())
                .path("hello")
                .build();

        // when
        String hello = appRule.client()
                .target(target)
                .request()
                .get(String.class);

        // then
        assertThat(hello, is("test-world"));
    }
}
