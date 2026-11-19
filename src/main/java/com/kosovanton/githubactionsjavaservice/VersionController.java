package com.kosovanton.githubactionsjavaservice;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VersionController {

    @GetMapping("/version")
    public Map<String, String> version() {
        return Map.of(
                "application", "github-actions-java-service",
                "version", "0.0.1-SNAPSHOT"
        );
    }
}