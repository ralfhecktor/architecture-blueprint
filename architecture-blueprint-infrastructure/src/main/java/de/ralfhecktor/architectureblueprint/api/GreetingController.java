package de.ralfhecktor.architectureblueprint.api;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import de.ralfhecktor.architectureblueprint.api.mapper.UserIdMapper;
import de.ralfhecktor.architectureblueprint.application.GreetingService;
import de.ralfhecktor.architectureblueprint.domain.greeting.model.Greeting;
import de.ralfhecktor.architectureblueprint.domain.user.model.UserId;
import de.ralfhecktor.architectureblueprint.greeting.dto.GreetingDTO;
import de.ralfhecktor.architectureblueprint.greeting.dto.GreetingRequestDTO;

import static de.ralfhecktor.architectureblueprint.api.mapper.GreetingMapper.toDTO;

@RestController
public class GreetingController implements GreetingsApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);

    private GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public ResponseEntity<GreetingDTO> greet(@Valid GreetingRequestDTO greetingRequestDTO) {

        LOGGER.info("[Controller] Received request to greet a user.");

        UserId userId = UserIdMapper.fromDTO(greetingRequestDTO);

        Greeting greeting = greetingService.sayHelloTo(userId);

        return ResponseEntity.ok(toDTO(greeting));
    }
}
