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
 * Manage AWS STS cluster instances using AWS SDK version 2.x.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface STS2EndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS Security Token Service (STS) component.
     */
    public interface STS2EndpointBuilder extends EndpointProducerBuilder {
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
        default STS2EndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default STS2EndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.sts.STS2Operations&lt;/code&gt; type.
         * 
         * Required: true
         * Default: assumeRole
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default STS2EndpointBuilder operation(
                org.apache.camel.component.aws2.sts.STS2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.aws2.sts.STS2Operations&lt;/code&gt; type.
         * 
         * Required: true
         * Default: assumeRole
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default STS2EndpointBuilder operation(String operation) {
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
        default STS2EndpointBuilder overrideEndpoint(boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default STS2EndpointBuilder overrideEndpoint(String overrideEndpoint) {
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
        default STS2EndpointBuilder pojoRequest(boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default STS2EndpointBuilder pojoRequest(String pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * To define a proxy host when instantiating the STS client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default STS2EndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the STS client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default STS2EndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the STS client.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default STS2EndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the STS client.
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
        default STS2EndpointBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the STS client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: producer
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default STS2EndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which STS client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: aws-global
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default STS2EndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * To use a existing configured AWS STS as client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.sts.StsClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param stsClient the value to set
         * @return the dsl builder
         */
        default STS2EndpointBuilder stsClient(
                software.amazon.awssdk.services.sts.StsClient stsClient) {
            doSetProperty("stsClient", stsClient);
            return this;
        }
        /**
         * To use a existing configured AWS STS as client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.services.sts.StsClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param stsClient the value to set
         * @return the dsl builder
         */
        default STS2EndpointBuilder stsClient(String stsClient) {
            doSetProperty("stsClient", stsClient);
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
        default STS2EndpointBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default STS2EndpointBuilder trustAllCertificates(
                String trustAllCertificates) {
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
        default STS2EndpointBuilder uriEndpointOverride(
                String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * Set whether the STS client should expect to load credentials through
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
        default STS2EndpointBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the STS client should expect to load credentials through
         * a default credentials provider or to expect static credentials to be
         * passed in.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default STS2EndpointBuilder useDefaultCredentialsProvider(
                String useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
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
        default STS2EndpointBuilder accessKey(String accessKey) {
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
        default STS2EndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    public interface STS2Builders {
        /**
         * AWS Security Token Service (STS) (camel-aws2-sts)
         * Manage AWS STS cluster instances using AWS SDK version 2.x.
         * 
         * Category: cloud,management
         * Since: 3.5
         * Maven coordinates: org.apache.camel:camel-aws2-sts
         * 
         * Syntax: <code>aws2-sts:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param path label
         * @return the dsl builder
         */
        default STS2EndpointBuilder aws2Sts(String path) {
            return STS2EndpointBuilderFactory.endpointBuilder("aws2-sts", path);
        }
        /**
         * AWS Security Token Service (STS) (camel-aws2-sts)
         * Manage AWS STS cluster instances using AWS SDK version 2.x.
         * 
         * Category: cloud,management
         * Since: 3.5
         * Maven coordinates: org.apache.camel:camel-aws2-sts
         * 
         * Syntax: <code>aws2-sts:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path label
         * @return the dsl builder
         */
        default STS2EndpointBuilder aws2Sts(String componentName, String path) {
            return STS2EndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static STS2EndpointBuilder endpointBuilder(String componentName, String path) {
        class STS2EndpointBuilderImpl extends AbstractEndpointBuilder implements STS2EndpointBuilder {
            public STS2EndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new STS2EndpointBuilderImpl(path);
    }
}