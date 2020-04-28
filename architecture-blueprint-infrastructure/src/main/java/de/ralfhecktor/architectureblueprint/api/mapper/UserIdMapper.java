package de.ralfhecktor.architectureblueprint.api.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.ralfhecktor.architectureblueprint.domain.user.model.UserId;
import de.ralfhecktor.architectureblueprint.greeting.dto.GreetingRequestDTO;

public class UserIdMapper {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserIdMapper.class);

    public static UserId fromDTO(GreetingRequestDTO dto) {

        LOGGER.info("[Mapper] Mapping request to user id.");

        return new UserId(dto.getUserId());

    }

}
