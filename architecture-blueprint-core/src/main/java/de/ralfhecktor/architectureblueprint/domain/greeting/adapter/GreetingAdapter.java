package de.ralfhecktor.architectureblueprint.domain.greeting.adapter;

import de.ralfhecktor.architectureblueprint.domain.greeting.model.Greeting;
import de.ralfhecktor.architectureblueprint.domain.user.model.User;

/**
 * This interface describes all the functionality needed of an external "greeting service" so that this services
 * is operational and can fulfill its business purpose. This interface is implemented by a technology specific
 * implementation in the infrastructure module. One of the present implementations is then later injected by spring.
 */
public interface GreetingAdapter {

    Greeting retrieveGreetingForUser(User user);

}
