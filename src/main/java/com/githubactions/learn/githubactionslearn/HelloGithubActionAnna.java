package com.githubactions.learn.githubactionslearn;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/entry")
public class HelloGithubActionAnna {

    @GetMapping("/welcome/{userName}")
    public ResponseEntity<Object> sayHelloToUser(@PathVariable String userName) {
        return ResponseEntity.ok("Hello " + userName);
    }

}
