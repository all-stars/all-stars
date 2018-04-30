package com.allstars.server.config;

public class AllStarsDefaults {

    interface Async {

        int corePoolSize = 2;
        int maxPoolSize = 50;
        int queueCapacity = 10000;
    }

}
