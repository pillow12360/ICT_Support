package ictproj.ictcomplain.controller;


import ictproj.ictcomplain.domain.SiteUser;
import ictproj.ictcomplain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    /*@PostMapping("/signup")
    public SiteUser create(@RequestBody SiteUser user) {
        return userService.create(user);
    }*/
    @PostMapping("/signup")
    public ResponseEntity<SiteUser> signup(@RequestBody SiteUser user){
        SiteUser createdUser = userService.signup(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
}
