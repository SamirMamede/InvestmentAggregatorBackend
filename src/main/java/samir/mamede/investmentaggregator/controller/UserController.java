package samir.mamede.investmentaggregator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import samir.mamede.investmentaggregator.entity.User;

@RestController
@RequestMapping("v1/users")
public class UserController {

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto createUserDto){

        return null;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") String userId){

        return null;
    }

    @PostMapping
    public ResponseEntity<User> example(@RequestBody String body){

        return null;
    }

    @PostMapping
    public ResponseEntity<User> exampleDoisr(@RequestBody String body){

        return null;
    }
}
