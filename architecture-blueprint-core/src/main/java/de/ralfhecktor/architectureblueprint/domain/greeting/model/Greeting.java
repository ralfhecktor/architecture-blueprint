package de.ralfhecktor.architectureblueprint.domain.greeting.model;

import org.springframework.util.Assert;

import de.ralfhecktor.architectureblueprint.domain.user.model.User;
import de.ralfhecktor.architectureblueprint.common.ValueObject;

import static de.ralfhecktor.architectureblueprint.common.Message.ASSERTION_NOT_NULL;

@ValueObject
public class Greeting {

    private User user;
    private String greetingMessage;

    public Greeting(User user, String greetingMessage) {
        Assert.notNull(user, ASSERTION_NOT_NULL.getFormattedMessage("user"));
        Assert.notNull(greetingMessage, ASSERTION_NOT_NULL.getFormattedMessage("greetingMessage"));

        this.user = user;
        this.greetingMessage = greetingMessage;
    }

    public User getUser() {
        return user;
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }
}
