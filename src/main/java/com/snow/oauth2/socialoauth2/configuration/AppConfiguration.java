package com.snow.oauth2.socialoauth2.configuration;


import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
@EnableAsync
@Configuration
@ConfigurationProperties(prefix = "app")
public class AppConfiguration {
    private List<String> authorizedRedirectUris = new ArrayList<>();
    private String tokenSecret;
    private long tokenExpirationMsec;

    @PostConstruct
    public void init() {
        System.out.println("Token Secret: " + tokenSecret);
        System.out.println("Authorized Redirect URIs: " + authorizedRedirectUris);
    }
}
