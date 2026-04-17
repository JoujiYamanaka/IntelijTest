package test.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class TestController {

    @GetMapping(value = "/response", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> getTest(){
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, JSON!");
        return ResponseEntity.ok(response);
    }
}
