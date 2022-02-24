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
package org.apache.camel.component.sjms.reply;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.MessageConsumer;
import javax.jms.Session;

import org.apache.camel.component.sjms.MessageListenerContainer;
import org.apache.camel.component.sjms.SjmsEndpoint;
import org.apache.camel.component.sjms.consumer.SimpleMessageListenerContainer;

/**
 * This {@link MessageListenerContainer} is used for reply queues which are exclusive.
 * <p/>
 * Mind that exclusive reply queues is per producer, so if you run in a clustered environment then each producer should
 * use an unique reply queue destination name. If not then other nodes may steal reply messages which was intended for
 * another. For clustered environments it may be safer to use shared queues as each node will only consume reply
 * messages which are intended for itself.
 */
public class ExclusiveQueueMessageListenerContainer extends SimpleMessageListenerContainer {

    // no need to override any methods currently

    public ExclusiveQueueMessageListenerContainer(SjmsEndpoint endpoint) {
        super(endpoint);
    }

    @Override
    protected Session createSession(Connection connection, SjmsEndpoint endpoint) throws Exception {
        // cannot be transacted when doing request/reply
        return connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
    }

    @Override
    protected MessageConsumer createMessageConsumer(Session session) throws Exception {
        Destination destination = getDestinationCreationStrategy().createDestination(session, getDestinationName(), false);
        return getEndpoint().getJmsObjectFactory().createQueueMessageConsumer(session, destination);
    }
}
