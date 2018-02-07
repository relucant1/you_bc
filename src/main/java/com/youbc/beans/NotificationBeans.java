package com.youbc.beans;

import com.pusher.rest.Pusher;
import com.youbc.services.notification.NotificationService;
import com.youbc.utilities.EnvProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan({"com.youbc"})
@PropertySource("classpath:configurations/notification.properties")
public class NotificationBeans {

    private Environment env;

    @Autowired
    public NotificationBeans(Environment env) {
        this.env = env;
    }

    @Bean
    public NotificationService notificationService() {
        Pusher pusher = new Pusher(
                env.getProperty(EnvProperties.PUSHER_APPID),
                env.getProperty(EnvProperties.PUSHER_KEY),
                env.getProperty(EnvProperties.PUSHER_SECRET)
        );
        pusher.setCluster(env.getProperty(EnvProperties.PUSHER_CLUSTER));
        pusher.setEncrypted(env.getProperty(EnvProperties.PUSHER_ENCRYPTED, Boolean.class));
        return new NotificationService(pusher);
    }
}
