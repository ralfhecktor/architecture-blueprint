package de.ralfhecktor.architectureblueprint.domain.user.model;

import java.util.UUID;

import de.ralfhecktor.architectureblueprint.common.Id;
import de.ralfhecktor.architectureblueprint.common.ValueObject;

@ValueObject
public class UserId extends Id<UUID> {

    public UserId(UUID value) {
        super(value);
    }

}
