/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.quickstarts.wsba.participantcompletion.simple.jaxws;

import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.2-hudson-182-RC1 Generated source version: 2.0
 *
 */
@WebServiceClient(name = "SetServiceBAService", targetNamespace = "http://www.jboss.org/jboss-jdf/jboss-as-quickstart/helloworld/wsba/participantcompletion/set")
public class SetServiceBAService extends Service {

    private static final URL SETSERVICEBASERVICE_WSDL_LOCATION;
    private static final Logger logger = Logger.getLogger(SetServiceBAService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = SetServiceBAService.class.getResource(".");
            url = new URL(baseUrl, "/WEB-INF/wsdl/SetServiceBA.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: '/WEB-INF/wsdl/SetServiceBA.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SETSERVICEBASERVICE_WSDL_LOCATION = url;
    }

    public SetServiceBAService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SetServiceBAService() {
        super(SETSERVICEBASERVICE_WSDL_LOCATION, new QName("http://www.jboss.org/jboss-jdf/jboss-as-quickstart/Set",
            "SetServiceBAService"));
    }

    /**
     *
     * @return returns ISetServiceBA
     */
    @WebEndpoint(name = "SetServiceBA")
    public SetServiceBA getSetServiceBA() {
        return super.getPort(new QName("http://www.jboss.org/jboss-jdf/jboss-as-quickstart/Set", "SetServiceBA"), SetServiceBA.class);
    }

}
