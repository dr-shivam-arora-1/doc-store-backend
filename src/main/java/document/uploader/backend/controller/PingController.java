package document.uploader.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @GetMapping("/heartbeat")
    String ping() {
        return "Application runs";
    }
}
