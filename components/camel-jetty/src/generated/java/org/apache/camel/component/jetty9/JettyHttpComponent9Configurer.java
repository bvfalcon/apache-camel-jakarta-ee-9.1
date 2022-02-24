/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jetty9;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.component.jetty11.JettyHttpComponent11;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JettyHttpComponent9Configurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JettyHttpComponent11 target = (JettyHttpComponent11) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowjavaserializedobject":
        case "allowJavaSerializedObject": target.setAllowJavaSerializedObject(property(camelContext, boolean.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "continuationtimeout":
        case "continuationTimeout": target.setContinuationTimeout(property(camelContext, java.lang.Long.class, value)); return true;
        case "enablejmx":
        case "enableJmx": target.setEnableJmx(property(camelContext, boolean.class, value)); return true;
        case "errorhandler":
        case "errorHandler": target.setErrorHandler(property(camelContext, org.eclipse.jetty.server.handler.ErrorHandler.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "httpbinding":
        case "httpBinding": target.setHttpBinding(property(camelContext, org.apache.camel.http.common.HttpBinding.class, value)); return true;
        case "httpconfiguration":
        case "httpConfiguration": target.setHttpConfiguration(property(camelContext, org.apache.camel.http.common.HttpConfiguration.class, value)); return true;
        case "jettyhttpbinding":
        case "jettyHttpBinding": target.setJettyHttpBinding(property(camelContext, org.apache.camel.component.jetty.JettyHttpBinding.class, value)); return true;
        case "keystore": target.setKeystore(property(camelContext, java.lang.String.class, value)); return true;
        case "maxthreads":
        case "maxThreads": target.setMaxThreads(property(camelContext, java.lang.Integer.class, value)); return true;
        case "mbcontainer":
        case "mbContainer": target.setMbContainer(property(camelContext, org.eclipse.jetty.jmx.MBeanContainer.class, value)); return true;
        case "minthreads":
        case "minThreads": target.setMinThreads(property(camelContext, java.lang.Integer.class, value)); return true;
        case "muteexception":
        case "muteException": target.setMuteException(property(camelContext, boolean.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "requestbuffersize":
        case "requestBufferSize": target.setRequestBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "requestheadersize":
        case "requestHeaderSize": target.setRequestHeaderSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "responsebuffersize":
        case "responseBufferSize": target.setResponseBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "responseheadersize":
        case "responseHeaderSize": target.setResponseHeaderSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "sendserverversion":
        case "sendServerVersion": target.setSendServerVersion(property(camelContext, boolean.class, value)); return true;
        case "socketconnectorproperties":
        case "socketConnectorProperties": target.setSocketConnectorProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "socketconnectors":
        case "socketConnectors": target.setSocketConnectors(property(camelContext, java.util.Map.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "sslkeypassword":
        case "sslKeyPassword": target.setSslKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslpassword":
        case "sslPassword": target.setSslPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslsocketconnectorproperties":
        case "sslSocketConnectorProperties": target.setSslSocketConnectorProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sslsocketconnectors":
        case "sslSocketConnectors": target.setSslSocketConnectors(property(camelContext, java.util.Map.class, value)); return true;
        case "threadpool":
        case "threadPool": target.setThreadPool(property(camelContext, org.eclipse.jetty.util.thread.ThreadPool.class, value)); return true;
        case "usecontinuation":
        case "useContinuation": target.setUseContinuation(property(camelContext, boolean.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "usexforwardedforheader":
        case "useXForwardedForHeader": target.setUseXForwardedForHeader(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowjavaserializedobject":
        case "allowJavaSerializedObject": return boolean.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "continuationtimeout":
        case "continuationTimeout": return java.lang.Long.class;
        case "enablejmx":
        case "enableJmx": return boolean.class;
        case "errorhandler":
        case "errorHandler": return org.eclipse.jetty.server.handler.ErrorHandler.class;
        case "headerfilterstrategy":
        case "headerFilterStrategy": return org.apache.camel.spi.HeaderFilterStrategy.class;
        case "httpbinding":
        case "httpBinding": return org.apache.camel.http.common.HttpBinding.class;
        case "httpconfiguration":
        case "httpConfiguration": return org.apache.camel.http.common.HttpConfiguration.class;
        case "jettyhttpbinding":
        case "jettyHttpBinding": return org.apache.camel.component.jetty.JettyHttpBinding.class;
        case "keystore": return java.lang.String.class;
        case "maxthreads":
        case "maxThreads": return java.lang.Integer.class;
        case "mbcontainer":
        case "mbContainer": return org.eclipse.jetty.jmx.MBeanContainer.class;
        case "minthreads":
        case "minThreads": return java.lang.Integer.class;
        case "muteexception":
        case "muteException": return boolean.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "requestbuffersize":
        case "requestBufferSize": return java.lang.Integer.class;
        case "requestheadersize":
        case "requestHeaderSize": return java.lang.Integer.class;
        case "responsebuffersize":
        case "responseBufferSize": return java.lang.Integer.class;
        case "responseheadersize":
        case "responseHeaderSize": return java.lang.Integer.class;
        case "sendserverversion":
        case "sendServerVersion": return boolean.class;
        case "socketconnectorproperties":
        case "socketConnectorProperties": return java.util.Map.class;
        case "socketconnectors":
        case "socketConnectors": return java.util.Map.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "sslkeypassword":
        case "sslKeyPassword": return java.lang.String.class;
        case "sslpassword":
        case "sslPassword": return java.lang.String.class;
        case "sslsocketconnectorproperties":
        case "sslSocketConnectorProperties": return java.util.Map.class;
        case "sslsocketconnectors":
        case "sslSocketConnectors": return java.util.Map.class;
        case "threadpool":
        case "threadPool": return org.eclipse.jetty.util.thread.ThreadPool.class;
        case "usecontinuation":
        case "useContinuation": return boolean.class;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return boolean.class;
        case "usexforwardedforheader":
        case "useXForwardedForHeader": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        JettyHttpComponent11 target = (JettyHttpComponent11) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowjavaserializedobject":
        case "allowJavaSerializedObject": return target.isAllowJavaSerializedObject();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "continuationtimeout":
        case "continuationTimeout": return target.getContinuationTimeout();
        case "enablejmx":
        case "enableJmx": return target.isEnableJmx();
        case "errorhandler":
        case "errorHandler": return target.getErrorHandler();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "httpbinding":
        case "httpBinding": return target.getHttpBinding();
        case "httpconfiguration":
        case "httpConfiguration": return target.getHttpConfiguration();
        case "jettyhttpbinding":
        case "jettyHttpBinding": return target.getJettyHttpBinding();
        case "keystore": return target.getKeystore();
        case "maxthreads":
        case "maxThreads": return target.getMaxThreads();
        case "mbcontainer":
        case "mbContainer": return target.getMbContainer();
        case "minthreads":
        case "minThreads": return target.getMinThreads();
        case "muteexception":
        case "muteException": return target.isMuteException();
        case "proxyhost":
        case "proxyHost": return target.getProxyHost();
        case "proxyport":
        case "proxyPort": return target.getProxyPort();
        case "requestbuffersize":
        case "requestBufferSize": return target.getRequestBufferSize();
        case "requestheadersize":
        case "requestHeaderSize": return target.getRequestHeaderSize();
        case "responsebuffersize":
        case "responseBufferSize": return target.getResponseBufferSize();
        case "responseheadersize":
        case "responseHeaderSize": return target.getResponseHeaderSize();
        case "sendserverversion":
        case "sendServerVersion": return target.isSendServerVersion();
        case "socketconnectorproperties":
        case "socketConnectorProperties": return target.getSocketConnectorProperties();
        case "socketconnectors":
        case "socketConnectors": return target.getSocketConnectors();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "sslkeypassword":
        case "sslKeyPassword": return target.getSslKeyPassword();
        case "sslpassword":
        case "sslPassword": return target.getSslPassword();
        case "sslsocketconnectorproperties":
        case "sslSocketConnectorProperties": return target.getSslSocketConnectorProperties();
        case "sslsocketconnectors":
        case "sslSocketConnectors": return target.getSslSocketConnectors();
        case "threadpool":
        case "threadPool": return target.getThreadPool();
        case "usecontinuation":
        case "useContinuation": return target.isUseContinuation();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        case "usexforwardedforheader":
        case "useXForwardedForHeader": return target.isUseXForwardedForHeader();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "socketconnectorproperties":
        case "socketConnectorProperties": return java.lang.Object.class;
        case "socketconnectors":
        case "socketConnectors": return org.eclipse.jetty.server.Connector.class;
        case "sslsocketconnectorproperties":
        case "sslSocketConnectorProperties": return java.lang.Object.class;
        case "sslsocketconnectors":
        case "sslSocketConnectors": return org.eclipse.jetty.server.Connector.class;
        default: return null;
        }
    }
}

