package de.ralfhecktor.architectureblueprint.domain.user.adapter;

import de.ralfhecktor.architectureblueprint.domain.user.model.User;
import de.ralfhecktor.architectureblueprint.domain.user.model.UserId;

public interface UserAdapter {

    User retrieveUser(UserId userId);

}
