package de.ralfhecktor.architectureblueprint.domain.user.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import de.ralfhecktor.architectureblueprint.domain.user.model.User;
import de.ralfhecktor.architectureblueprint.domain.user.model.UserId;

@Component
public class UserMockAdapter implements UserAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserMockAdapter.class);

    @Value("${user.mock.name:World}")
    private String name;

    @Override
    public User retrieveUser(UserId userId) {
        LOGGER.info("[Adapter] Retrieving user information.");
        return new User(userId, name);
    }

}
