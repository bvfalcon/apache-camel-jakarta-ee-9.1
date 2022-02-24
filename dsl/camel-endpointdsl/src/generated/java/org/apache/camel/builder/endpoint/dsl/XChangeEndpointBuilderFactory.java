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
 * Access market data and trade on Bitcoin and Altcoin exchanges.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface XChangeEndpointBuilderFactory {


    /**
     * Builder for endpoint for the XChange component.
     */
    public interface XChangeEndpointBuilder extends EndpointProducerBuilder {
        /**
         * The currency.
         * 
         * The option is a:
         * &lt;code&gt;org.knowm.xchange.currency.Currency&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param currency the value to set
         * @return the dsl builder
         */
        default XChangeEndpointBuilder currency(
                org.knowm.xchange.currency.Currency currency) {
            doSetProperty("currency", currency);
            return this;
        }
        /**
         * The currency.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.knowm.xchange.currency.Currency&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param currency the value to set
         * @return the dsl builder
         */
        default XChangeEndpointBuilder currency(String currency) {
            doSetProperty("currency", currency);
            return this;
        }
        /**
         * The currency pair.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param currencyPair the value to set
         * @return the dsl builder
         */
        default XChangeEndpointBuilder currencyPair(String currencyPair) {
            doSetProperty("currencyPair", currencyPair);
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
        default XChangeEndpointBuilder lazyStartProducer(
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
        default XChangeEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The method to execute.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xchange.XChangeConfiguration.XChangeMethod&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param method the value to set
         * @return the dsl builder
         */
        default XChangeEndpointBuilder method(
                org.apache.camel.component.xchange.XChangeConfiguration.XChangeMethod method) {
            doSetProperty("method", method);
            return this;
        }
        /**
         * The method to execute.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.xchange.XChangeConfiguration.XChangeMethod&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param method the value to set
         * @return the dsl builder
         */
        default XChangeEndpointBuilder method(String method) {
            doSetProperty("method", method);
            return this;
        }
        /**
         * The service to call.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xchange.XChangeConfiguration.XChangeService&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param service the value to set
         * @return the dsl builder
         */
        default XChangeEndpointBuilder service(
                org.apache.camel.component.xchange.XChangeConfiguration.XChangeService service) {
            doSetProperty("service", service);
            return this;
        }
        /**
         * The service to call.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.xchange.XChangeConfiguration.XChangeService&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param service the value to set
         * @return the dsl builder
         */
        default XChangeEndpointBuilder service(String service) {
            doSetProperty("service", service);
            return this;
        }
    }

    public interface XChangeBuilders {
        /**
         * XChange (camel-xchange)
         * Access market data and trade on Bitcoin and Altcoin exchanges.
         * 
         * Category: bitcoin,blockchain
         * Since: 2.21
         * Maven coordinates: org.apache.camel:camel-xchange
         * 
         * Syntax: <code>xchange:name</code>
         * 
         * Path parameter: name (required)
         * The exchange to connect to
         * 
         * @param path name
         * @return the dsl builder
         */
        default XChangeEndpointBuilder xchange(String path) {
            return XChangeEndpointBuilderFactory.endpointBuilder("xchange", path);
        }
        /**
         * XChange (camel-xchange)
         * Access market data and trade on Bitcoin and Altcoin exchanges.
         * 
         * Category: bitcoin,blockchain
         * Since: 2.21
         * Maven coordinates: org.apache.camel:camel-xchange
         * 
         * Syntax: <code>xchange:name</code>
         * 
         * Path parameter: name (required)
         * The exchange to connect to
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path name
         * @return the dsl builder
         */
        default XChangeEndpointBuilder xchange(String componentName, String path) {
            return XChangeEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static XChangeEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class XChangeEndpointBuilderImpl extends AbstractEndpointBuilder implements XChangeEndpointBuilder {
            public XChangeEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new XChangeEndpointBuilderImpl(path);
    }
}