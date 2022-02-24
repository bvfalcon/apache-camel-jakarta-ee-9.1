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
 * Process XML payloads by a SAX ContentHandler.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface StAXEndpointBuilderFactory {


    /**
     * Builder for endpoint for the StAX component.
     */
    public interface StAXEndpointBuilder extends EndpointProducerBuilder {
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
        default StAXEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default StAXEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface StAXBuilders {
        /**
         * StAX (camel-stax)
         * Process XML payloads by a SAX ContentHandler.
         * 
         * Category: transformation
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-stax
         * 
         * Syntax: <code>stax:contentHandlerClass</code>
         * 
         * Path parameter: contentHandlerClass (required)
         * The FQN class name for the ContentHandler implementation to use.
         * 
         * @param path contentHandlerClass
         * @return the dsl builder
         */
        default StAXEndpointBuilder stax(String path) {
            return StAXEndpointBuilderFactory.endpointBuilder("stax", path);
        }
        /**
         * StAX (camel-stax)
         * Process XML payloads by a SAX ContentHandler.
         * 
         * Category: transformation
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-stax
         * 
         * Syntax: <code>stax:contentHandlerClass</code>
         * 
         * Path parameter: contentHandlerClass (required)
         * The FQN class name for the ContentHandler implementation to use.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path contentHandlerClass
         * @return the dsl builder
         */
        default StAXEndpointBuilder stax(String componentName, String path) {
            return StAXEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static StAXEndpointBuilder endpointBuilder(String componentName, String path) {
        class StAXEndpointBuilderImpl extends AbstractEndpointBuilder implements StAXEndpointBuilder {
            public StAXEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new StAXEndpointBuilderImpl(path);
    }
}