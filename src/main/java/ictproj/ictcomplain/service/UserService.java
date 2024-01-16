package ictproj.ictcomplain.service;

import ictproj.ictcomplain.domain.SiteUser;
import ictproj.ictcomplain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    /*public SiteUser create(String username, String email, String password, String building){
        SiteUser user = new SiteUser();
        user.setPassword(password);
        user.setUsername(username);
        user.setEmail(email);
        user.setBuilding(building);
        return this.userRepository.save(user);
    }*/
    public SiteUser signup(SiteUser user){
        return userRepository.save(user);
    }
}
