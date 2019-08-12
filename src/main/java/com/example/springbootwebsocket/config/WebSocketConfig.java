package com.example.springbootwebsocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    MessageBrokerRegistry registry;
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // create a message broker
        this.registry = StompEndpointRegistry.addEndpoint("/websocket-demo").withSockJS();
    }

    @Override
        public void configureMessageBroker(MessageBrokerRegistry config) {
            // add prefix to msg broker
            this.registry.enableSimpleBroker("/topic");
            // set prefix for msg destination
            this.registry.setApplicationDestinationPrefixes("/app");
        }

    }

}
