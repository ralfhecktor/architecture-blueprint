package de.ralfhecktor.architectureblueprint.domain.greeting.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import de.ralfhecktor.architectureblueprint.domain.greeting.model.Greeting;
import de.ralfhecktor.architectureblueprint.domain.user.model.User;

/**
 * This is one of many possible implementations for the {@link GreetingAdapter}. In this case, it only returns a mock
 * greeting message. This is the place where normally the handling of the communication with the third party service
 * would take place.
 */
@Component
public class GreetingMockAdapter implements GreetingAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingMockAdapter.class);

    @Override
    public Greeting retrieveGreetingForUser(User user) {
        LOGGER.info("[Adapter] Retrieving personalized greeting.");
        String greetingMessage = String.format("Hello %s. I wish you a nice day!", user.getName());
        return new Greeting(user, greetingMessage);
    }
}
