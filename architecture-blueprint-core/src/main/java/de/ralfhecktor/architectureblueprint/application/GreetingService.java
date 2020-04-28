package de.ralfhecktor.architectureblueprint.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.ralfhecktor.architectureblueprint.domain.greeting.adapter.GreetingAdapter;
import de.ralfhecktor.architectureblueprint.domain.greeting.model.Greeting;
import de.ralfhecktor.architectureblueprint.domain.user.adapter.UserAdapter;
import de.ralfhecktor.architectureblueprint.domain.user.model.User;
import de.ralfhecktor.architectureblueprint.domain.user.model.UserId;

/**
 * In terms of domain driven design, this class represents a so called application service. The purpose of this
 * component is to orchestrate the application flow for the different functionality covered by the application.
 */
@Component
public class GreetingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingService.class);

    private UserAdapter userAdapter;
    private GreetingAdapter greetingAdapter;

    @Autowired
    public GreetingService(UserAdapter userAdapter, GreetingAdapter greetingAdapter) {
        this.userAdapter = userAdapter;
        this.greetingAdapter = greetingAdapter;
    }

    public Greeting sayHelloTo(final UserId userId) {

        LOGGER.info("[Service] Starting business logic on how to greet a user.");

        User user = userAdapter.retrieveUser(userId);
        Greeting personalizedGreeting = greetingAdapter.retrieveGreetingForUser(user);

        // Do some more sophisticated business logic here.

        return personalizedGreeting;
    }

}
