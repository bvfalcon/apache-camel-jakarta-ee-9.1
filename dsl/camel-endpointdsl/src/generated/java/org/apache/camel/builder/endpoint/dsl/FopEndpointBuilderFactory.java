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
 * Render messages into PDF and other output formats supported by Apache FOP.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface FopEndpointBuilderFactory {


    /**
     * Builder for endpoint for the FOP component.
     */
    public interface FopEndpointBuilder extends EndpointProducerBuilder {
        /**
         * Allows to use a custom configured or implementation of
         * org.apache.fop.apps.FopFactory.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.fop.apps.FopFactory&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param fopFactory the value to set
         * @return the dsl builder
         */
        default FopEndpointBuilder fopFactory(
                org.apache.fop.apps.FopFactory fopFactory) {
            doSetProperty("fopFactory", fopFactory);
            return this;
        }
        /**
         * Allows to use a custom configured or implementation of
         * org.apache.fop.apps.FopFactory.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.fop.apps.FopFactory&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param fopFactory the value to set
         * @return the dsl builder
         */
        default FopEndpointBuilder fopFactory(String fopFactory) {
            doSetProperty("fopFactory", fopFactory);
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
        default FopEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default FopEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The location of a configuration file which can be loaded from
         * classpath or file system.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param userConfigURL the value to set
         * @return the dsl builder
         */
        default FopEndpointBuilder userConfigURL(String userConfigURL) {
            doSetProperty("userConfigURL", userConfigURL);
            return this;
        }
    }

    public interface FopBuilders {
        /**
         * FOP (camel-fop)
         * Render messages into PDF and other output formats supported by Apache
         * FOP.
         * 
         * Category: file,transformation
         * Since: 2.10
         * Maven coordinates: org.apache.camel:camel-fop
         * 
         * Syntax: <code>fop:outputType</code>
         * 
         * Path parameter: outputType (required)
         * The primary output format is PDF but other output formats are also
         * supported.
         * There are 10 enums and the value can be one of: pdf, ps, pcl, png,
         * jpeg, svg, xml, mif, rtf, txt
         * 
         * @param path outputType
         * @return the dsl builder
         */
        default FopEndpointBuilder fop(String path) {
            return FopEndpointBuilderFactory.endpointBuilder("fop", path);
        }
        /**
         * FOP (camel-fop)
         * Render messages into PDF and other output formats supported by Apache
         * FOP.
         * 
         * Category: file,transformation
         * Since: 2.10
         * Maven coordinates: org.apache.camel:camel-fop
         * 
         * Syntax: <code>fop:outputType</code>
         * 
         * Path parameter: outputType (required)
         * The primary output format is PDF but other output formats are also
         * supported.
         * There are 10 enums and the value can be one of: pdf, ps, pcl, png,
         * jpeg, svg, xml, mif, rtf, txt
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path outputType
         * @return the dsl builder
         */
        default FopEndpointBuilder fop(String componentName, String path) {
            return FopEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static FopEndpointBuilder endpointBuilder(String componentName, String path) {
        class FopEndpointBuilderImpl extends AbstractEndpointBuilder implements FopEndpointBuilder {
            public FopEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new FopEndpointBuilderImpl(path);
    }
}