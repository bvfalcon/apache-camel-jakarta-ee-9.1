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
import org.apache.camel.component.aws2.ecs.ECS2Component;

/**
 * Manage AWS ECS cluster instances using AWS SDK version 2.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2EcsComponentBuilderFactory {

    /**
     * AWS Elastic Container Service (ECS) (camel-aws2-ecs)
     * Manage AWS ECS cluster instances using AWS SDK version 2.x.
     * 
     * Category: cloud,management
     * Since: 3.1
     * Maven coordinates: org.apache.camel:camel-aws2-ecs
     * 
     * @return the dsl builder
     */
    static Aws2EcsComponentBuilder aws2Ecs() {
        return new Aws2EcsComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Elastic Container Service (ECS) component.
     */
    interface Aws2EcsComponentBuilder extends ComponentBuilder<ECS2Component> {
        /**
         * Component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.ecs.ECS2Configuration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default Aws2EcsComponentBuilder configuration(
                org.apache.camel.component.aws2.ecs.ECS2Configuration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * To use a existing configured AWS ECS as client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.ecs.EcsClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param ecsClient the value to set
         * @return the dsl builder
         */
        default Aws2EcsComponentBuilder ecsClient(
                software.amazon.awssdk.services.ecs.EcsClient ecsClient) {
            doSetProperty("ecsClient", ecsClient);
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
        default Aws2EcsComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.ecs.ECS2Operations&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default Aws2EcsComponentBuilder operation(
                org.apache.camel.component.aws2.ecs.ECS2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Aws2EcsComponentBuilder overrideEndpoint(
                boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default Aws2EcsComponentBuilder pojoRequest(boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * To define a proxy host when instantiating the ECS client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default Aws2EcsComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the ECS client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Aws2EcsComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the ECS client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: producer
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Aws2EcsComponentBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which ECS client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default Aws2EcsComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Aws2EcsComponentBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default Aws2EcsComponentBuilder uriEndpointOverride(
                java.lang.String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * Set whether the ECS client should expect to load credentials through
         * a default credentials provider or to expect static credentials to be
         * passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Aws2EcsComponentBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
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
        default Aws2EcsComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default Aws2EcsComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default Aws2EcsComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    class Aws2EcsComponentBuilderImpl
            extends
                AbstractComponentBuilder<ECS2Component>
            implements
                Aws2EcsComponentBuilder {
        @Override
        protected ECS2Component buildConcreteComponent() {
            return new ECS2Component();
        }
        private org.apache.camel.component.aws2.ecs.ECS2Configuration getOrCreateConfiguration(
                org.apache.camel.component.aws2.ecs.ECS2Component component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.ecs.ECS2Configuration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((ECS2Component) component).setConfiguration((org.apache.camel.component.aws2.ecs.ECS2Configuration) value); return true;
            case "ecsClient": getOrCreateConfiguration((ECS2Component) component).setEcsClient((software.amazon.awssdk.services.ecs.EcsClient) value); return true;
            case "lazyStartProducer": ((ECS2Component) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((ECS2Component) component).setOperation((org.apache.camel.component.aws2.ecs.ECS2Operations) value); return true;
            case "overrideEndpoint": getOrCreateConfiguration((ECS2Component) component).setOverrideEndpoint((boolean) value); return true;
            case "pojoRequest": getOrCreateConfiguration((ECS2Component) component).setPojoRequest((boolean) value); return true;
            case "proxyHost": getOrCreateConfiguration((ECS2Component) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((ECS2Component) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((ECS2Component) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "region": getOrCreateConfiguration((ECS2Component) component).setRegion((java.lang.String) value); return true;
            case "trustAllCertificates": getOrCreateConfiguration((ECS2Component) component).setTrustAllCertificates((boolean) value); return true;
            case "uriEndpointOverride": getOrCreateConfiguration((ECS2Component) component).setUriEndpointOverride((java.lang.String) value); return true;
            case "useDefaultCredentialsProvider": getOrCreateConfiguration((ECS2Component) component).setUseDefaultCredentialsProvider((boolean) value); return true;
            case "autowiredEnabled": ((ECS2Component) component).setAutowiredEnabled((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((ECS2Component) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((ECS2Component) component).setSecretKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}