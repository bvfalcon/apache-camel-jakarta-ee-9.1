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
package org.apache.camel.builder.component.dsl;

import jakarta.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.validator.msv.MsvComponent;

/**
 * Validate XML payloads using Multi-Schema Validator (MSV).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface MsvComponentBuilderFactory {

    /**
     * MSV (camel-msv)
     * Validate XML payloads using Multi-Schema Validator (MSV).
     * 
     * Category: validation
     * Since: 1.1
     * Maven coordinates: org.apache.camel:camel-msv
     * 
     * @return the dsl builder
     */
    @Deprecated
    static MsvComponentBuilder msv() {
        return new MsvComponentBuilderImpl();
    }

    /**
     * Builder for the MSV component.
     */
    interface MsvComponentBuilder extends ComponentBuilder<MsvComponent> {
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
        default MsvComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default MsvComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * To use a custom LSResourceResolver which depends on a dynamic
         * endpoint resource URI.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.validator.ValidatorResourceResolverFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param resourceResolverFactory the value to set
         * @return the dsl builder
         */
        default MsvComponentBuilder resourceResolverFactory(
                org.apache.camel.component.validator.ValidatorResourceResolverFactory resourceResolverFactory) {
            doSetProperty("resourceResolverFactory", resourceResolverFactory);
            return this;
        }
        /**
         * To use the javax.xml.validation.SchemaFactory.
         * 
         * The option is a:
         * &lt;code&gt;javax.xml.validation.SchemaFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param schemaFactory the value to set
         * @return the dsl builder
         */
        default MsvComponentBuilder schemaFactory(
                javax.xml.validation.SchemaFactory schemaFactory) {
            doSetProperty("schemaFactory", schemaFactory);
            return this;
        }
    }

    class MsvComponentBuilderImpl
            extends
                AbstractComponentBuilder<MsvComponent>
            implements
                MsvComponentBuilder {
        @Override
        protected MsvComponent buildConcreteComponent() {
            return new MsvComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "lazyStartProducer": ((MsvComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((MsvComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "resourceResolverFactory": ((MsvComponent) component).setResourceResolverFactory((org.apache.camel.component.validator.ValidatorResourceResolverFactory) value); return true;
            case "schemaFactory": ((MsvComponent) component).setSchemaFactory((javax.xml.validation.SchemaFactory) value); return true;
            default: return false;
            }
        }
    }
}