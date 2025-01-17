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
 * Execute commands on the underlying operating system.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ExecEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Exec component.
     */
    public interface ExecEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedExecEndpointBuilder advanced() {
            return (AdvancedExecEndpointBuilder) this;
        }
        /**
         * The arguments may be one or many whitespace-separated tokens.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param args the value to set
         * @return the dsl builder
         */
        default ExecEndpointBuilder args(String args) {
            doSetProperty("args", args);
            return this;
        }
        /**
         * A reference to a org.apache.commons.exec.ExecBinding in the Registry.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.exec.ExecBinding&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param binding the value to set
         * @return the dsl builder
         */
        default ExecEndpointBuilder binding(
                org.apache.camel.component.exec.ExecBinding binding) {
            doSetProperty("binding", binding);
            return this;
        }
        /**
         * A reference to a org.apache.commons.exec.ExecBinding in the Registry.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.exec.ExecBinding&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param binding the value to set
         * @return the dsl builder
         */
        default ExecEndpointBuilder binding(String binding) {
            doSetProperty("binding", binding);
            return this;
        }
        /**
         * A reference to a org.apache.commons.exec.ExecCommandExecutor in the
         * Registry that customizes the command execution. The default command
         * executor utilizes the commons-exec library, which adds a shutdown
         * hook for every executed command.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.exec.ExecCommandExecutor&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param commandExecutor the value to set
         * @return the dsl builder
         */
        default ExecEndpointBuilder commandExecutor(
                org.apache.camel.component.exec.ExecCommandExecutor commandExecutor) {
            doSetProperty("commandExecutor", commandExecutor);
            return this;
        }
        /**
         * A reference to a org.apache.commons.exec.ExecCommandExecutor in the
         * Registry that customizes the command execution. The default command
         * executor utilizes the commons-exec library, which adds a shutdown
         * hook for every executed command.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.exec.ExecCommandExecutor&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param commandExecutor the value to set
         * @return the dsl builder
         */
        default ExecEndpointBuilder commandExecutor(String commandExecutor) {
            doSetProperty("commandExecutor", commandExecutor);
            return this;
        }
        /**
         * Logging level to be used for commands during execution. The default
         * value is DEBUG. Possible values are TRACE, DEBUG, INFO, WARN, ERROR
         * or OFF. (Values of ExecCommandLogLevelType enum).
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.LoggingLevel&lt;/code&gt; type.
         * 
         * Default: DEBUG
         * Group: producer
         * 
         * @param commandLogLevel the value to set
         * @return the dsl builder
         */
        default ExecEndpointBuilder commandLogLevel(
                org.apache.camel.LoggingLevel commandLogLevel) {
            doSetProperty("commandLogLevel", commandLogLevel);
            return this;
        }
        /**
         * Logging level to be used for commands during execution. The default
         * value is DEBUG. Possible values are TRACE, DEBUG, INFO, WARN, ERROR
         * or OFF. (Values of ExecCommandLogLevelType enum).
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.LoggingLevel&lt;/code&gt; type.
         * 
         * Default: DEBUG
         * Group: producer
         * 
         * @param commandLogLevel the value to set
         * @return the dsl builder
         */
        default ExecEndpointBuilder commandLogLevel(String commandLogLevel) {
            doSetProperty("commandLogLevel", commandLogLevel);
            return this;
        }
        /**
         * The exit values of successful executions. If the process exits with
         * another value, an exception is raised. Comma-separated list of exit
         * values. And empty list (the default) sets no expected exit values and
         * disables the check.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param exitValues the value to set
         * @return the dsl builder
         */
        default ExecEndpointBuilder exitValues(String exitValues) {
            doSetProperty("exitValues", exitValues);
            return this;
        }
        /**
         * The name of a file, created by the executable, that should be
         * considered as its output. If no outFile is set, the standard output
         * (stdout) of the executable will be used instead.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param outFile the value to set
         * @return the dsl builder
         */
        default ExecEndpointBuilder outFile(String outFile) {
            doSetProperty("outFile", outFile);
            return this;
        }
        /**
         * The timeout, in milliseconds, after which the executable should be
         * terminated. If execution has not completed within the timeout, the
         * component will send a termination request.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default ExecEndpointBuilder timeout(long timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * The timeout, in milliseconds, after which the executable should be
         * terminated. If execution has not completed within the timeout, the
         * component will send a termination request.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default ExecEndpointBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * A boolean indicating that when stdout is empty, this component will
         * populate the Camel Message Body with stderr. This behavior is
         * disabled (false) by default.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useStderrOnEmptyStdout the value to set
         * @return the dsl builder
         */
        default ExecEndpointBuilder useStderrOnEmptyStdout(
                boolean useStderrOnEmptyStdout) {
            doSetProperty("useStderrOnEmptyStdout", useStderrOnEmptyStdout);
            return this;
        }
        /**
         * A boolean indicating that when stdout is empty, this component will
         * populate the Camel Message Body with stderr. This behavior is
         * disabled (false) by default.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useStderrOnEmptyStdout the value to set
         * @return the dsl builder
         */
        default ExecEndpointBuilder useStderrOnEmptyStdout(
                String useStderrOnEmptyStdout) {
            doSetProperty("useStderrOnEmptyStdout", useStderrOnEmptyStdout);
            return this;
        }
        /**
         * The directory in which the command should be executed. If null, the
         * working directory of the current process will be used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param workingDir the value to set
         * @return the dsl builder
         */
        default ExecEndpointBuilder workingDir(String workingDir) {
            doSetProperty("workingDir", workingDir);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Exec component.
     */
    public interface AdvancedExecEndpointBuilder
            extends
                EndpointProducerBuilder {
        default ExecEndpointBuilder basic() {
            return (ExecEndpointBuilder) this;
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedExecEndpointBuilder lazyStartProducer(
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedExecEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface ExecBuilders {
        /**
         * Exec (camel-exec)
         * Execute commands on the underlying operating system.
         * 
         * Category: system
         * Since: 2.3
         * Maven coordinates: org.apache.camel:camel-exec
         * 
         * @return the dsl builder for the headers' name.
         */
        default ExecHeaderNameBuilder exec() {
            return ExecHeaderNameBuilder.INSTANCE;
        }
        /**
         * Exec (camel-exec)
         * Execute commands on the underlying operating system.
         * 
         * Category: system
         * Since: 2.3
         * Maven coordinates: org.apache.camel:camel-exec
         * 
         * Syntax: <code>exec:executable</code>
         * 
         * Path parameter: executable (required)
         * Sets the executable to be executed. The executable must not be empty
         * or null.
         * 
         * @param path executable
         * @return the dsl builder
         */
        default ExecEndpointBuilder exec(String path) {
            return ExecEndpointBuilderFactory.endpointBuilder("exec", path);
        }
        /**
         * Exec (camel-exec)
         * Execute commands on the underlying operating system.
         * 
         * Category: system
         * Since: 2.3
         * Maven coordinates: org.apache.camel:camel-exec
         * 
         * Syntax: <code>exec:executable</code>
         * 
         * Path parameter: executable (required)
         * Sets the executable to be executed. The executable must not be empty
         * or null.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path executable
         * @return the dsl builder
         */
        default ExecEndpointBuilder exec(String componentName, String path) {
            return ExecEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Exec component.
     */
    public static class ExecHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final ExecHeaderNameBuilder INSTANCE = new ExecHeaderNameBuilder();

        /**
         * The name of the system command that will be executed. Overrides
         * executable in the URI.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: in
         * 
         * @return the name of the header {@code ExecCommandExecutable}.
         */
        public String execCommandExecutable() {
            return "ExecCommandExecutable";
        }

        /**
         * Command-line argument(s) to pass to the executed process. The
         * argument(s) is/are used literally - no quoting is applied. Overrides
         * any existing args in the URI.
         * 
         * The option is a: {@code java.util.List<String> or String} type.
         * 
         * Group: in
         * 
         * @return the name of the header {@code ExecCommandArgs}.
         */
        public String execCommandArgs() {
            return "ExecCommandArgs";
        }

        /**
         * The name of a file, created by the executable, that should be
         * considered as its output. Overrides any existing outFile in the URI.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: in
         * 
         * @return the name of the header {@code ExecCommandOutFile}.
         */
        public String execCommandOutFile() {
            return "ExecCommandOutFile";
        }

        /**
         * The directory in which the command should be executed. Overrides any
         * existing workingDir in the URI.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: in
         * 
         * @return the name of the header {@code ExecCommandWorkingDir}.
         */
        public String execCommandWorkingDir() {
            return "ExecCommandWorkingDir";
        }

        /**
         * The timeout, in milliseconds, after which the executable should be
         * terminated. Overrides any existing timeout in the URI.
         * 
         * The option is a: {@code long} type.
         * 
         * Group: in
         * 
         * @return the name of the header {@code ExecCommandTimeout}.
         */
        public String execCommandTimeout() {
            return "ExecCommandTimeout";
        }

        /**
         * The exit values for successful execution of the process. Overrides
         * any existing exitValues in the URI.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: in
         * 
         * @return the name of the header {@code ExecExitValues}.
         */
        public String execExitValues() {
            return "ExecExitValues";
        }

        /**
         * The value of this header points to the standard error stream (stderr)
         * of the executable. If no stderr is written, the value is null.
         * 
         * The option is a: {@code java.io.InputStream} type.
         * 
         * Group: out
         * 
         * @return the name of the header {@code ExecStderr}.
         */
        public String execStderr() {
            return "ExecStderr";
        }

        /**
         * The value of this header is the _exit value_ of the executable.
         * Non-zero exit values typically indicate abnormal termination. Note
         * that the exit value is OS-dependent.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: out
         * 
         * @return the name of the header {@code ExecExitValue}.
         */
        public String execExitValue() {
            return "ExecExitValue";
        }

        /**
         * Indicates that when stdout is empty, this component will populate the
         * Camel Message Body with stderr. This behavior is disabled (false) by
         * default.
         * 
         * The option is a: {@code boolean} type.
         * 
         * Group: in
         * 
         * @return the name of the header {@code ExecUseStderrOnEmptyStdout}.
         */
        public String execUseStderrOnEmptyStdout() {
            return "ExecUseStderrOnEmptyStdout";
        }

        /**
         * Logging level to be used for commands during execution. The default
         * value is DEBUG. Possible values are TRACE, DEBUG, INFO, WARN, ERROR
         * or OFF (Values of LoggingLevel enum).
         * 
         * The option is a: {@code String} type.
         * 
         * Group: in
         * 
         * @return the name of the header {@code ExecCommandLogLevel}.
         */
        public String execCommandLogLevel() {
            return "ExecCommandLogLevel";
        }
    }
    static ExecEndpointBuilder endpointBuilder(String componentName, String path) {
        class ExecEndpointBuilderImpl extends AbstractEndpointBuilder implements ExecEndpointBuilder, AdvancedExecEndpointBuilder {
            public ExecEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new ExecEndpointBuilderImpl(path);
    }
}