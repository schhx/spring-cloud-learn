package org.schhx.springbootlearn.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "info")
@Component
public class Info {

    private String profile;

    private String from;

    public String getProfile() {
        return profile;
    }

    public Info setProfile(String profile) {
        this.profile = profile;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public Info setFrom(String from) {
        this.from = from;
        return this;
    }
}
