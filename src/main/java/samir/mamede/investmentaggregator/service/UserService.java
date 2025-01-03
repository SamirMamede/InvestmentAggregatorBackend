package samir.mamede.investmentaggregator.service;

import org.springframework.stereotype.Service;
import samir.mamede.investmentaggregator.controller.CreateUserDto;
import samir.mamede.investmentaggregator.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(CreateUserDto createUserDto){

    }
}
