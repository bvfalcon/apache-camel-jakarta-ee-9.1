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
 * Have only a single consumer in a cluster consuming from a given endpoint;
 * with automatic failover if the JVM dies.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ZooKeeperMasterEndpointBuilderFactory {


    /**
     * Builder for endpoint for the ZooKeeper Master component.
     */
    public interface ZooKeeperMasterEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedZooKeeperMasterEndpointBuilder advanced() {
            return (AdvancedZooKeeperMasterEndpointBuilder) this;
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
        default ZooKeeperMasterEndpointBuilder bridgeErrorHandler(
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
        default ZooKeeperMasterEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the ZooKeeper Master component.
     */
    public interface AdvancedZooKeeperMasterEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default ZooKeeperMasterEndpointBuilder basic() {
            return (ZooKeeperMasterEndpointBuilder) this;
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
        default AdvancedZooKeeperMasterEndpointBuilder exceptionHandler(
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
        default AdvancedZooKeeperMasterEndpointBuilder exceptionHandler(
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
        default AdvancedZooKeeperMasterEndpointBuilder exchangePattern(
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
        default AdvancedZooKeeperMasterEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    public interface ZooKeeperMasterBuilders {
        /**
         * ZooKeeper Master (camel-zookeeper-master)
         * Have only a single consumer in a cluster consuming from a given
         * endpoint; with automatic failover if the JVM dies.
         * 
         * Category: clustering,management,bigdata
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-zookeeper-master
         * 
         * Syntax: <code>zookeeper-master:groupName:consumerEndpointUri</code>
         * 
         * Path parameter: groupName (required)
         * The name of the cluster group to use
         * 
         * Path parameter: consumerEndpointUri (required)
         * The consumer endpoint to use in master/slave mode
         * 
         * @param path groupName:consumerEndpointUri
         * @return the dsl builder
         */
        default ZooKeeperMasterEndpointBuilder zookeeperMaster(String path) {
            return ZooKeeperMasterEndpointBuilderFactory.endpointBuilder("zookeeper-master", path);
        }
        /**
         * ZooKeeper Master (camel-zookeeper-master)
         * Have only a single consumer in a cluster consuming from a given
         * endpoint; with automatic failover if the JVM dies.
         * 
         * Category: clustering,management,bigdata
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-zookeeper-master
         * 
         * Syntax: <code>zookeeper-master:groupName:consumerEndpointUri</code>
         * 
         * Path parameter: groupName (required)
         * The name of the cluster group to use
         * 
         * Path parameter: consumerEndpointUri (required)
         * The consumer endpoint to use in master/slave mode
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path groupName:consumerEndpointUri
         * @return the dsl builder
         */
        default ZooKeeperMasterEndpointBuilder zookeeperMaster(
                String componentName,
                String path) {
            return ZooKeeperMasterEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static ZooKeeperMasterEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class ZooKeeperMasterEndpointBuilderImpl extends AbstractEndpointBuilder implements ZooKeeperMasterEndpointBuilder, AdvancedZooKeeperMasterEndpointBuilder {
            public ZooKeeperMasterEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new ZooKeeperMasterEndpointBuilderImpl(path);
    }
}