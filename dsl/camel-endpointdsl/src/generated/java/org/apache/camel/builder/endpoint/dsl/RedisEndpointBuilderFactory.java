/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import jakarta.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Send and receive messages from Redis.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RedisEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Spring Redis component.
     */
    public interface RedisEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedRedisEndpointConsumerBuilder advanced() {
            return (AdvancedRedisEndpointConsumerBuilder) this;
        }
        /**
         * List of topic names or name patterns to subscribe to. Multiple names
         * can be separated by comma.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param channels the value to set
         * @return the dsl builder
         */
        default RedisEndpointConsumerBuilder channels(String channels) {
            doSetProperty("channels", channels);
            return this;
        }
        /**
         * Default command, which can be overridden by message header. Notice
         * the consumer only supports the following commands: PSUBSCRIBE and
         * SUBSCRIBE.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.redis.Command&lt;/code&gt;
         * type.
         * 
         * Default: SET
         * Group: common
         * 
         * @param command the value to set
         * @return the dsl builder
         */
        default RedisEndpointConsumerBuilder command(
                org.apache.camel.component.redis.Command command) {
            doSetProperty("command", command);
            return this;
        }
        /**
         * Default command, which can be overridden by message header. Notice
         * the consumer only supports the following commands: PSUBSCRIBE and
         * SUBSCRIBE.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.redis.Command&lt;/code&gt;
         * type.
         * 
         * Default: SET
         * Group: common
         * 
         * @param command the value to set
         * @return the dsl builder
         */
        default RedisEndpointConsumerBuilder command(String command) {
            doSetProperty("command", command);
            return this;
        }
        /**
         * Reference to a pre-configured RedisConnectionFactory instance to use.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.data.redis.connection.RedisConnectionFactory&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param connectionFactory the value to set
         * @return the dsl builder
         */
        default RedisEndpointConsumerBuilder connectionFactory(
                org.springframework.data.redis.connection.RedisConnectionFactory connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * Reference to a pre-configured RedisConnectionFactory instance to use.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.springframework.data.redis.connection.RedisConnectionFactory&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param connectionFactory the value to set
         * @return the dsl builder
         */
        default RedisEndpointConsumerBuilder connectionFactory(
                String connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * Reference to a pre-configured RedisTemplate instance to use.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.data.redis.core.RedisTemplate&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param redisTemplate the value to set
         * @return the dsl builder
         */
        default RedisEndpointConsumerBuilder redisTemplate(
                org.springframework.data.redis.core.RedisTemplate redisTemplate) {
            doSetProperty("redisTemplate", redisTemplate);
            return this;
        }
        /**
         * Reference to a pre-configured RedisTemplate instance to use.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.springframework.data.redis.core.RedisTemplate&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param redisTemplate the value to set
         * @return the dsl builder
         */
        default RedisEndpointConsumerBuilder redisTemplate(String redisTemplate) {
            doSetProperty("redisTemplate", redisTemplate);
            return this;
        }
        /**
         * Reference to a pre-configured RedisSerializer instance to use.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.data.redis.serializer.RedisSerializer&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serializer the value to set
         * @return the dsl builder
         */
        default RedisEndpointConsumerBuilder serializer(
                org.springframework.data.redis.serializer.RedisSerializer serializer) {
            doSetProperty("serializer", serializer);
            return this;
        }
        /**
         * Reference to a pre-configured RedisSerializer instance to use.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.springframework.data.redis.serializer.RedisSerializer&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serializer the value to set
         * @return the dsl builder
         */
        default RedisEndpointConsumerBuilder serializer(String serializer) {
            doSetProperty("serializer", serializer);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default RedisEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default RedisEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Spring Redis component.
     */
    public interface AdvancedRedisEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default RedisEndpointConsumerBuilder basic() {
            return (RedisEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedRedisEndpointConsumerBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedRedisEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedRedisEndpointConsumerBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedRedisEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Reference to a pre-configured RedisMessageListenerContainer instance
         * to use.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.data.redis.listener.RedisMessageListenerContainer&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param listenerContainer the value to set
         * @return the dsl builder
         */
        default AdvancedRedisEndpointConsumerBuilder listenerContainer(
                org.springframework.data.redis.listener.RedisMessageListenerContainer listenerContainer) {
            doSetProperty("listenerContainer", listenerContainer);
            return this;
        }
        /**
         * Reference to a pre-configured RedisMessageListenerContainer instance
         * to use.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.springframework.data.redis.listener.RedisMessageListenerContainer&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param listenerContainer the value to set
         * @return the dsl builder
         */
        default AdvancedRedisEndpointConsumerBuilder listenerContainer(
                String listenerContainer) {
            doSetProperty("listenerContainer", listenerContainer);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Spring Redis component.
     */
    public interface RedisEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedRedisEndpointProducerBuilder advanced() {
            return (AdvancedRedisEndpointProducerBuilder) this;
        }
        /**
         * List of topic names or name patterns to subscribe to. Multiple names
         * can be separated by comma.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param channels the value to set
         * @return the dsl builder
         */
        default RedisEndpointProducerBuilder channels(String channels) {
            doSetProperty("channels", channels);
            return this;
        }
        /**
         * Default command, which can be overridden by message header. Notice
         * the consumer only supports the following commands: PSUBSCRIBE and
         * SUBSCRIBE.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.redis.Command&lt;/code&gt;
         * type.
         * 
         * Default: SET
         * Group: common
         * 
         * @param command the value to set
         * @return the dsl builder
         */
        default RedisEndpointProducerBuilder command(
                org.apache.camel.component.redis.Command command) {
            doSetProperty("command", command);
            return this;
        }
        /**
         * Default command, which can be overridden by message header. Notice
         * the consumer only supports the following commands: PSUBSCRIBE and
         * SUBSCRIBE.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.redis.Command&lt;/code&gt;
         * type.
         * 
         * Default: SET
         * Group: common
         * 
         * @param command the value to set
         * @return the dsl builder
         */
        default RedisEndpointProducerBuilder command(String command) {
            doSetProperty("command", command);
            return this;
        }
        /**
         * Reference to a pre-configured RedisConnectionFactory instance to use.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.data.redis.connection.RedisConnectionFactory&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param connectionFactory the value to set
         * @return the dsl builder
         */
        default RedisEndpointProducerBuilder connectionFactory(
                org.springframework.data.redis.connection.RedisConnectionFactory connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * Reference to a pre-configured RedisConnectionFactory instance to use.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.springframework.data.redis.connection.RedisConnectionFactory&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param connectionFactory the value to set
         * @return the dsl builder
         */
        default RedisEndpointProducerBuilder connectionFactory(
                String connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * Reference to a pre-configured RedisTemplate instance to use.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.data.redis.core.RedisTemplate&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param redisTemplate the value to set
         * @return the dsl builder
         */
        default RedisEndpointProducerBuilder redisTemplate(
                org.springframework.data.redis.core.RedisTemplate redisTemplate) {
            doSetProperty("redisTemplate", redisTemplate);
            return this;
        }
        /**
         * Reference to a pre-configured RedisTemplate instance to use.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.springframework.data.redis.core.RedisTemplate&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param redisTemplate the value to set
         * @return the dsl builder
         */
        default RedisEndpointProducerBuilder redisTemplate(String redisTemplate) {
            doSetProperty("redisTemplate", redisTemplate);
            return this;
        }
        /**
         * Reference to a pre-configured RedisSerializer instance to use.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.data.redis.serializer.RedisSerializer&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serializer the value to set
         * @return the dsl builder
         */
        default RedisEndpointProducerBuilder serializer(
                org.springframework.data.redis.serializer.RedisSerializer serializer) {
            doSetProperty("serializer", serializer);
            return this;
        }
        /**
         * Reference to a pre-configured RedisSerializer instance to use.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.springframework.data.redis.serializer.RedisSerializer&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serializer the value to set
         * @return the dsl builder
         */
        default RedisEndpointProducerBuilder serializer(String serializer) {
            doSetProperty("serializer", serializer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default RedisEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default RedisEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Spring Redis component.
     */
    public interface AdvancedRedisEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default RedisEndpointProducerBuilder basic() {
            return (RedisEndpointProducerBuilder) this;
        }
    }

    /**
     * Builder for endpoint for the Spring Redis component.
     */
    public interface RedisEndpointBuilder
            extends
                RedisEndpointConsumerBuilder,
                RedisEndpointProducerBuilder {
        default AdvancedRedisEndpointBuilder advanced() {
            return (AdvancedRedisEndpointBuilder) this;
        }
        /**
         * List of topic names or name patterns to subscribe to. Multiple names
         * can be separated by comma.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param channels the value to set
         * @return the dsl builder
         */
        default RedisEndpointBuilder channels(String channels) {
            doSetProperty("channels", channels);
            return this;
        }
        /**
         * Default command, which can be overridden by message header. Notice
         * the consumer only supports the following commands: PSUBSCRIBE and
         * SUBSCRIBE.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.redis.Command&lt;/code&gt;
         * type.
         * 
         * Default: SET
         * Group: common
         * 
         * @param command the value to set
         * @return the dsl builder
         */
        default RedisEndpointBuilder command(
                org.apache.camel.component.redis.Command command) {
            doSetProperty("command", command);
            return this;
        }
        /**
         * Default command, which can be overridden by message header. Notice
         * the consumer only supports the following commands: PSUBSCRIBE and
         * SUBSCRIBE.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.redis.Command&lt;/code&gt;
         * type.
         * 
         * Default: SET
         * Group: common
         * 
         * @param command the value to set
         * @return the dsl builder
         */
        default RedisEndpointBuilder command(String command) {
            doSetProperty("command", command);
            return this;
        }
        /**
         * Reference to a pre-configured RedisConnectionFactory instance to use.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.data.redis.connection.RedisConnectionFactory&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param connectionFactory the value to set
         * @return the dsl builder
         */
        default RedisEndpointBuilder connectionFactory(
                org.springframework.data.redis.connection.RedisConnectionFactory connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * Reference to a pre-configured RedisConnectionFactory instance to use.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.springframework.data.redis.connection.RedisConnectionFactory&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param connectionFactory the value to set
         * @return the dsl builder
         */
        default RedisEndpointBuilder connectionFactory(String connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * Reference to a pre-configured RedisTemplate instance to use.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.data.redis.core.RedisTemplate&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param redisTemplate the value to set
         * @return the dsl builder
         */
        default RedisEndpointBuilder redisTemplate(
                org.springframework.data.redis.core.RedisTemplate redisTemplate) {
            doSetProperty("redisTemplate", redisTemplate);
            return this;
        }
        /**
         * Reference to a pre-configured RedisTemplate instance to use.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.springframework.data.redis.core.RedisTemplate&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param redisTemplate the value to set
         * @return the dsl builder
         */
        default RedisEndpointBuilder redisTemplate(String redisTemplate) {
            doSetProperty("redisTemplate", redisTemplate);
            return this;
        }
        /**
         * Reference to a pre-configured RedisSerializer instance to use.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.data.redis.serializer.RedisSerializer&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serializer the value to set
         * @return the dsl builder
         */
        default RedisEndpointBuilder serializer(
                org.springframework.data.redis.serializer.RedisSerializer serializer) {
            doSetProperty("serializer", serializer);
            return this;
        }
        /**
         * Reference to a pre-configured RedisSerializer instance to use.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.springframework.data.redis.serializer.RedisSerializer&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serializer the value to set
         * @return the dsl builder
         */
        default RedisEndpointBuilder serializer(String serializer) {
            doSetProperty("serializer", serializer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Spring Redis component.
     */
    public interface AdvancedRedisEndpointBuilder
            extends
                AdvancedRedisEndpointConsumerBuilder,
                AdvancedRedisEndpointProducerBuilder {
        default RedisEndpointBuilder basic() {
            return (RedisEndpointBuilder) this;
        }
    }

    public interface RedisBuilders {
        /**
         * Spring Redis (camel-spring-redis)
         * Send and receive messages from Redis.
         * 
         * Category: spring,nosql
         * Since: 2.11
         * Maven coordinates: org.apache.camel:camel-spring-redis
         * 
         * Syntax: <code>spring-redis:host:port</code>
         * 
         * Path parameter: host (required)
         * The host where Redis server is running.
         * 
         * Path parameter: port (required)
         * Redis server port number
         * 
         * @param path host:port
         * @return the dsl builder
         */
        default RedisEndpointBuilder springRedis(String path) {
            return RedisEndpointBuilderFactory.endpointBuilder("spring-redis", path);
        }
        /**
         * Spring Redis (camel-spring-redis)
         * Send and receive messages from Redis.
         * 
         * Category: spring,nosql
         * Since: 2.11
         * Maven coordinates: org.apache.camel:camel-spring-redis
         * 
         * Syntax: <code>spring-redis:host:port</code>
         * 
         * Path parameter: host (required)
         * The host where Redis server is running.
         * 
         * Path parameter: port (required)
         * Redis server port number
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path host:port
         * @return the dsl builder
         */
        default RedisEndpointBuilder springRedis(
                String componentName,
                String path) {
            return RedisEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static RedisEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class RedisEndpointBuilderImpl extends AbstractEndpointBuilder implements RedisEndpointBuilder, AdvancedRedisEndpointBuilder {
            public RedisEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new RedisEndpointBuilderImpl(path);
    }
}