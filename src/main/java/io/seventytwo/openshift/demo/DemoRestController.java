package io.seventytwo.openshift.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

@RestController
@RequestMapping("/")
public class DemoRestController {

    @RequestMapping(produces = TEXT_PLAIN_VALUE)
    public String get() {
        return "hello";
    }
}
