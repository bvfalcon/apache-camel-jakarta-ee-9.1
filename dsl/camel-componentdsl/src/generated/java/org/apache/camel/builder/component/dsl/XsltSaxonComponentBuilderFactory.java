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
import org.apache.camel.component.xslt.saxon.XsltSaxonComponent;

/**
 * Transform XML payloads using an XSLT template using Saxon.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface XsltSaxonComponentBuilderFactory {

    /**
     * XSLT Saxon (camel-xslt-saxon)
     * Transform XML payloads using an XSLT template using Saxon.
     * 
     * Category: core,transformation
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-xslt-saxon
     * 
     * @return the dsl builder
     */
    static XsltSaxonComponentBuilder xsltSaxon() {
        return new XsltSaxonComponentBuilderImpl();
    }

    /**
     * Builder for the XSLT Saxon component.
     */
    interface XsltSaxonComponentBuilder
            extends
                ComponentBuilder<XsltSaxonComponent> {
        /**
         * Cache for the resource content (the stylesheet file) when it is
         * loaded. If set to false Camel will reload the stylesheet file on each
         * message processing. This is good for development. A cached stylesheet
         * can be forced to reload at runtime via JMX using the
         * clearCachedStylesheet operation.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param contentCache the value to set
         * @return the dsl builder
         */
        default XsltSaxonComponentBuilder contentCache(boolean contentCache) {
            doSetProperty("contentCache", contentCache);
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
        default XsltSaxonComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
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
        default XsltSaxonComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * To use a custom Saxon configuration.
         * 
         * The option is a: &lt;code&gt;net.sf.saxon.Configuration&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param saxonConfiguration the value to set
         * @return the dsl builder
         */
        default XsltSaxonComponentBuilder saxonConfiguration(
                net.sf.saxon.Configuration saxonConfiguration) {
            doSetProperty("saxonConfiguration", saxonConfiguration);
            return this;
        }
        /**
         * To set custom Saxon configuration properties.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param saxonConfigurationProperties the value to set
         * @return the dsl builder
         */
        default XsltSaxonComponentBuilder saxonConfigurationProperties(
                java.util.Map<java.lang.String, java.lang.Object> saxonConfigurationProperties) {
            doSetProperty("saxonConfigurationProperties", saxonConfigurationProperties);
            return this;
        }
        /**
         * Allows you to use a custom
         * net.sf.saxon.lib.ExtensionFunctionDefinition. You would need to add
         * camel-saxon to the classpath. The function is looked up in the
         * registry, where you can comma to separate multiple values to lookup.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param saxonExtensionFunctions the value to set
         * @return the dsl builder
         */
        default XsltSaxonComponentBuilder saxonExtensionFunctions(
                java.lang.String saxonExtensionFunctions) {
            doSetProperty("saxonExtensionFunctions", saxonExtensionFunctions);
            return this;
        }
        /**
         * To use a custom XSLT transformer factory, specified as a FQN class
         * name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param transformerFactoryClass the value to set
         * @return the dsl builder
         */
        default XsltSaxonComponentBuilder transformerFactoryClass(
                java.lang.String transformerFactoryClass) {
            doSetProperty("transformerFactoryClass", transformerFactoryClass);
            return this;
        }
        /**
         * A configuration strategy to apply on freshly created instances of
         * TransformerFactory.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param transformerFactoryConfigurationStrategy the value to set
         * @return the dsl builder
         */
        default XsltSaxonComponentBuilder transformerFactoryConfigurationStrategy(
                org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy transformerFactoryConfigurationStrategy) {
            doSetProperty("transformerFactoryConfigurationStrategy", transformerFactoryConfigurationStrategy);
            return this;
        }
        /**
         * To use a custom UriResolver. Should not be used together with the
         * option 'uriResolverFactory'.
         * 
         * The option is a:
         * &lt;code&gt;javax.xml.transform.URIResolver&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param uriResolver the value to set
         * @return the dsl builder
         */
        default XsltSaxonComponentBuilder uriResolver(
                javax.xml.transform.URIResolver uriResolver) {
            doSetProperty("uriResolver", uriResolver);
            return this;
        }
        /**
         * To use a custom UriResolver which depends on a dynamic endpoint
         * resource URI. Should not be used together with the option
         * 'uriResolver'.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xslt.XsltUriResolverFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param uriResolverFactory the value to set
         * @return the dsl builder
         */
        default XsltSaxonComponentBuilder uriResolverFactory(
                org.apache.camel.component.xslt.XsltUriResolverFactory uriResolverFactory) {
            doSetProperty("uriResolverFactory", uriResolverFactory);
            return this;
        }
    }

    class XsltSaxonComponentBuilderImpl
            extends
                AbstractComponentBuilder<XsltSaxonComponent>
            implements
                XsltSaxonComponentBuilder {
        @Override
        protected XsltSaxonComponent buildConcreteComponent() {
            return new XsltSaxonComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "contentCache": ((XsltSaxonComponent) component).setContentCache((boolean) value); return true;
            case "lazyStartProducer": ((XsltSaxonComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((XsltSaxonComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "saxonConfiguration": ((XsltSaxonComponent) component).setSaxonConfiguration((net.sf.saxon.Configuration) value); return true;
            case "saxonConfigurationProperties": ((XsltSaxonComponent) component).setSaxonConfigurationProperties((java.util.Map) value); return true;
            case "saxonExtensionFunctions": ((XsltSaxonComponent) component).setSaxonExtensionFunctions((java.lang.String) value); return true;
            case "transformerFactoryClass": ((XsltSaxonComponent) component).setTransformerFactoryClass((java.lang.String) value); return true;
            case "transformerFactoryConfigurationStrategy": ((XsltSaxonComponent) component).setTransformerFactoryConfigurationStrategy((org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy) value); return true;
            case "uriResolver": ((XsltSaxonComponent) component).setUriResolver((javax.xml.transform.URIResolver) value); return true;
            case "uriResolverFactory": ((XsltSaxonComponent) component).setUriResolverFactory((org.apache.camel.component.xslt.XsltUriResolverFactory) value); return true;
            default: return false;
            }
        }
    }
}