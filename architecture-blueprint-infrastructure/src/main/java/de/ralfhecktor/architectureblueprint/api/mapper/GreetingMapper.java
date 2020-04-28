package de.ralfhecktor.architectureblueprint.api.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.ralfhecktor.architectureblueprint.domain.greeting.model.Greeting;
import de.ralfhecktor.architectureblueprint.greeting.dto.GreetingDTO;

public class GreetingMapper{

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingMapper.class);

    public static GreetingDTO toDTO(Greeting model) {

        LOGGER.info("[Mapper] Mapping from Greeting to DTO.");

        GreetingDTO dto = new GreetingDTO();

        dto.setMessage(model.getGreetingMessage());

        return dto;
    }
}
