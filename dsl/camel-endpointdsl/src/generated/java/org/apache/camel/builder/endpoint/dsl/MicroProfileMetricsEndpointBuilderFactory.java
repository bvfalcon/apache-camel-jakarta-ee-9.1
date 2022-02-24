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
 * Expose metrics from Camel routes.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MicroProfileMetricsEndpointBuilderFactory {


    /**
     * Builder for endpoint for the MicroProfile Metrics component.
     */
    public interface MicroProfileMetricsEndpointBuilder
            extends
                EndpointProducerBuilder {
        /**
         * Action to use when using the timer type.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param action the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder action(String action) {
            doSetProperty("action", action);
            return this;
        }
        /**
         * Increment value when using the counter type.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param counterIncrement the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder counterIncrement(
                Long counterIncrement) {
            doSetProperty("counterIncrement", counterIncrement);
            return this;
        }
        /**
         * Increment value when using the counter type.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param counterIncrement the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder counterIncrement(
                String counterIncrement) {
            doSetProperty("counterIncrement", counterIncrement);
            return this;
        }
        /**
         * Metric description.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param description the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder description(
                String description) {
            doSetProperty("description", description);
            return this;
        }
        /**
         * Metric display name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param displayName the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder displayName(
                String displayName) {
            doSetProperty("displayName", displayName);
            return this;
        }
        /**
         * Decrement metric value when using concurrent gauge type.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param gaugeDecrement the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder gaugeDecrement(
                Boolean gaugeDecrement) {
            doSetProperty("gaugeDecrement", gaugeDecrement);
            return this;
        }
        /**
         * Decrement metric value when using concurrent gauge type.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param gaugeDecrement the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder gaugeDecrement(
                String gaugeDecrement) {
            doSetProperty("gaugeDecrement", gaugeDecrement);
            return this;
        }
        /**
         * Increment metric value when using the concurrent gauge type.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param gaugeIncrement the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder gaugeIncrement(
                Boolean gaugeIncrement) {
            doSetProperty("gaugeIncrement", gaugeIncrement);
            return this;
        }
        /**
         * Increment metric value when using the concurrent gauge type.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param gaugeIncrement the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder gaugeIncrement(
                String gaugeIncrement) {
            doSetProperty("gaugeIncrement", gaugeIncrement);
            return this;
        }
        /**
         * Decrement metric value when using concurrent gauge type.
         * 
         * The option is a: &lt;code&gt;java.lang.Number&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param gaugeValue the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder gaugeValue(Number gaugeValue) {
            doSetProperty("gaugeValue", gaugeValue);
            return this;
        }
        /**
         * Decrement metric value when using concurrent gauge type.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Number&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param gaugeValue the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder gaugeValue(String gaugeValue) {
            doSetProperty("gaugeValue", gaugeValue);
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
        default MicroProfileMetricsEndpointBuilder lazyStartProducer(
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
        default MicroProfileMetricsEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Mark value to set when using the meter type.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param mark the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder mark(Long mark) {
            doSetProperty("mark", mark);
            return this;
        }
        /**
         * Mark value to set when using the meter type.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param mark the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder mark(String mark) {
            doSetProperty("mark", mark);
            return this;
        }
        /**
         * Metric unit. See org.eclipse.microprofile.metrics.MetricUnits.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param metricUnit the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder metricUnit(String metricUnit) {
            doSetProperty("metricUnit", metricUnit);
            return this;
        }
        /**
         * Comma delimited list of tags associated with the metric in the format
         * tagName=tagValue.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param tags the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder tags(String tags) {
            doSetProperty("tags", tags);
            return this;
        }
        /**
         * Value to set when using the histogram type.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param value the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder value(Long value) {
            doSetProperty("value", value);
            return this;
        }
        /**
         * Value to set when using the histogram type.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param value the value to set
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder value(String value) {
            doSetProperty("value", value);
            return this;
        }
    }

    public interface MicroProfileMetricsBuilders {
        /**
         * MicroProfile Metrics (camel-microprofile-metrics)
         * Expose metrics from Camel routes.
         * 
         * Category: monitoring
         * Since: 3.0
         * Maven coordinates: org.apache.camel:camel-microprofile-metrics
         * 
         * Syntax: <code>microprofile-metrics:metricType:metricName</code>
         * 
         * Path parameter: metricType (required)
         * Metric type
         * There are 8 enums and the value can be one of: concurrent gauge,
         * counter, gauge, meter, histogram, timer, simple timer, invalid
         * 
         * Path parameter: metricName (required)
         * Metric name
         * 
         * @param path metricType:metricName
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder microprofileMetrics(
                String path) {
            return MicroProfileMetricsEndpointBuilderFactory.endpointBuilder("microprofile-metrics", path);
        }
        /**
         * MicroProfile Metrics (camel-microprofile-metrics)
         * Expose metrics from Camel routes.
         * 
         * Category: monitoring
         * Since: 3.0
         * Maven coordinates: org.apache.camel:camel-microprofile-metrics
         * 
         * Syntax: <code>microprofile-metrics:metricType:metricName</code>
         * 
         * Path parameter: metricType (required)
         * Metric type
         * There are 8 enums and the value can be one of: concurrent gauge,
         * counter, gauge, meter, histogram, timer, simple timer, invalid
         * 
         * Path parameter: metricName (required)
         * Metric name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path metricType:metricName
         * @return the dsl builder
         */
        default MicroProfileMetricsEndpointBuilder microprofileMetrics(
                String componentName,
                String path) {
            return MicroProfileMetricsEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static MicroProfileMetricsEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class MicroProfileMetricsEndpointBuilderImpl extends AbstractEndpointBuilder implements MicroProfileMetricsEndpointBuilder {
            public MicroProfileMetricsEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new MicroProfileMetricsEndpointBuilderImpl(path);
    }
}