package ru.romanow.protocols.rpc.service.spring;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.AbstractReflectiveHandlerMapping;
import ru.romanow.protocols.rpc.service.RemoteService;

import java.util.Map;

public class SpringHandlerMapping
        extends AbstractReflectiveHandlerMapping {

    public void setHandlerMappings(Map<String, RemoteService> handlerMappings)
            throws XmlRpcException {
        SpringRequestProcessorFactoryFactory ff =
                (SpringRequestProcessorFactoryFactory)getRequestProcessorFactoryFactory();

        ff.init(handlerMappings);
        for (String serviceName : handlerMappings.keySet()) {
            RemoteService serviceBean = handlerMappings.get(serviceName);
            registerPublicMethods(serviceName, serviceBean.getClass());
        }
    }
}