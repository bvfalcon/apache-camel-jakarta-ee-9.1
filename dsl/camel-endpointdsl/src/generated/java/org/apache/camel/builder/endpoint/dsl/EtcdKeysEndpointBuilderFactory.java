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
 * Get, set or delete keys in etcd key-value store.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface EtcdKeysEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Etcd Keys component.
     */
    public interface EtcdKeysEndpointBuilder extends EndpointProducerBuilder {
        /**
         * To apply an action recursively.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param recursive the value to set
         * @return the dsl builder
         */
        default EtcdKeysEndpointBuilder recursive(boolean recursive) {
            doSetProperty("recursive", recursive);
            return this;
        }
        /**
         * To apply an action recursively.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param recursive the value to set
         * @return the dsl builder
         */
        default EtcdKeysEndpointBuilder recursive(String recursive) {
            doSetProperty("recursive", recursive);
            return this;
        }
        /**
         * The path to look for for service discovery.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: /services/
         * Group: producer
         * 
         * @param servicePath the value to set
         * @return the dsl builder
         */
        default EtcdKeysEndpointBuilder servicePath(String servicePath) {
            doSetProperty("servicePath", servicePath);
            return this;
        }
        /**
         * To set the maximum time an action could take to complete.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default EtcdKeysEndpointBuilder timeout(Long timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * To set the maximum time an action could take to complete.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default EtcdKeysEndpointBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * To set the URIs the client connects.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: http://localhost:2379,http://localhost:4001
         * Group: common
         * 
         * @param uris the value to set
         * @return the dsl builder
         */
        default EtcdKeysEndpointBuilder uris(String uris) {
            doSetProperty("uris", uris);
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
        default EtcdKeysEndpointBuilder lazyStartProducer(
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
        default EtcdKeysEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To set the lifespan of a key in milliseconds.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeToLive the value to set
         * @return the dsl builder
         */
        default EtcdKeysEndpointBuilder timeToLive(Integer timeToLive) {
            doSetProperty("timeToLive", timeToLive);
            return this;
        }
        /**
         * To set the lifespan of a key in milliseconds.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeToLive the value to set
         * @return the dsl builder
         */
        default EtcdKeysEndpointBuilder timeToLive(String timeToLive) {
            doSetProperty("timeToLive", timeToLive);
            return this;
        }
        /**
         * The password to use for basic authentication.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default EtcdKeysEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default EtcdKeysEndpointBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default EtcdKeysEndpointBuilder sslContextParameters(
                String sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * The user name to use for basic authentication.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param userName the value to set
         * @return the dsl builder
         */
        default EtcdKeysEndpointBuilder userName(String userName) {
            doSetProperty("userName", userName);
            return this;
        }
    }

    public interface EtcdKeysBuilders {
        /**
         * Etcd Keys (camel-etcd)
         * Get, set or delete keys in etcd key-value store.
         * 
         * Category: clustering,database
         * Since: 2.18
         * Maven coordinates: org.apache.camel:camel-etcd
         * 
         * Syntax: <code>etcd-keys:path</code>
         * 
         * Path parameter: path
         * The path the endpoint refers to
         * 
         * @param path path
         * @return the dsl builder
         */
        @Deprecated
        default EtcdKeysEndpointBuilder etcdKeys(String path) {
            return EtcdKeysEndpointBuilderFactory.endpointBuilder("etcd-keys", path);
        }
        /**
         * Etcd Keys (camel-etcd)
         * Get, set or delete keys in etcd key-value store.
         * 
         * Category: clustering,database
         * Since: 2.18
         * Maven coordinates: org.apache.camel:camel-etcd
         * 
         * Syntax: <code>etcd-keys:path</code>
         * 
         * Path parameter: path
         * The path the endpoint refers to
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path path
         * @return the dsl builder
         */
        @Deprecated
        default EtcdKeysEndpointBuilder etcdKeys(
                String componentName,
                String path) {
            return EtcdKeysEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    @Deprecated
    static EtcdKeysEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class EtcdKeysEndpointBuilderImpl extends AbstractEndpointBuilder implements EtcdKeysEndpointBuilder {
            public EtcdKeysEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new EtcdKeysEndpointBuilderImpl(path);
    }
}