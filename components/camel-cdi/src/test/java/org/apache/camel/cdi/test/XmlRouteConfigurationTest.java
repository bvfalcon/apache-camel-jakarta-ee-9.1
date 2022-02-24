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
package org.apache.camel.cdi.test;

import java.nio.file.Paths;

import jakarta.inject.Inject;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.cdi.CdiCamelExtension;
import org.apache.camel.cdi.ImportResource;
import org.apache.camel.cdi.Uri;
import org.apache.camel.component.mock.MockEndpoint;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.fail;

@RunWith(Arquillian.class)
@ImportResource("imported-context.xml")
public class XmlRouteConfigurationTest {

    @Inject
    private ProducerTemplate template;

    @Inject
    @Uri("mock:error")
    private MockEndpoint mock;

    @Deployment
    public static Archive<?> deployment() {
        return ShrinkWrap.create(JavaArchive.class)
                // Camel CDI
                .addPackage(CdiCamelExtension.class.getPackage())
                // Test Camel XML
                .addAsResource(
                        Paths.get("src/test/resources/camel-context-routeConfiguration.xml").toFile(),
                        "imported-context.xml")
                // Bean archive deployment descriptor
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Test
    public void testRoutesConfigurationOnException() throws Exception {
        mock.expectedBodiesReceived("Bye World");

        try {
            template.sendBody("direct:start", "Hello World");
            fail("Should throw exception");
        } catch (Exception e) {
            // expected
        }
        template.sendBody("direct:start2", "Bye World");

        mock.assertIsSatisfied();
    }
}
