package com.githubactions.learn.githubactionslearn;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloGithubActionAnna {

    @GetMapping("/welcome/{name}")
    public ResponseEntity<Object> sayHelloToUser(@PathVariable String name) {
        log.info("Request received in API");
        return ResponseEntity.ok("Hello " + name);
    }

}
