package com.allstars.server.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "allstars", ignoreUnknownFields = false)
public class AllStarsProperties {

    private final Async async = new Async();

    public Async getAsync() {
        return async;
    }

    public static class Async {

        private int corePoolSize = AllStarsDefaults.Async.corePoolSize;

        private int maxPoolSize = AllStarsDefaults.Async.maxPoolSize;

        private int queueCapacity = AllStarsDefaults.Async.queueCapacity;

        public int getCorePoolSize() {
            return corePoolSize;
        }

        public void setCorePoolSize(int corePoolSize) {
            this.corePoolSize = corePoolSize;
        }

        public int getMaxPoolSize() {
            return maxPoolSize;
        }

        public void setMaxPoolSize(int maxPoolSize) {
            this.maxPoolSize = maxPoolSize;
        }

        public int getQueueCapacity() {
            return queueCapacity;
        }

        public void setQueueCapacity(int queueCapacity) {
            this.queueCapacity = queueCapacity;
        }
    }
}
