package ru.romanow.protocols.soap.generated.wrapped.model;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-09-26T03:44:10.395+04:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "WebServiceDocumentLiteralWrappedImplService", 
                  wsdlLocation = "file:/Users/ronin/Develop/JAVA/inst/web-protocols/soap-client/src/main/resources/wsdl/document-literal-wrapped.wsdl",
                  targetNamespace = "http://web.soap.protocols.romanow.ru/") 
public class WebServiceDocumentLiteralWrappedImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://web.soap.protocols.romanow.ru/", "WebServiceDocumentLiteralWrappedImplService");
    public final static QName WebServiceDocumentLiteralWrappedImplPort = new QName("http://web.soap.protocols.romanow.ru/", "WebServiceDocumentLiteralWrappedImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/ronin/Develop/JAVA/inst/web-protocols/soap-client/src/main/resources/wsdl/document-literal-wrapped.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WebServiceDocumentLiteralWrappedImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/ronin/Develop/JAVA/inst/web-protocols/soap-client/src/main/resources/wsdl/document-literal-wrapped.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WebServiceDocumentLiteralWrappedImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WebServiceDocumentLiteralWrappedImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceDocumentLiteralWrappedImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public WebServiceDocumentLiteralWrappedImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WebServiceDocumentLiteralWrappedImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WebServiceDocumentLiteralWrappedImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns WebServiceDocumentWrapped
     */
    @WebEndpoint(name = "WebServiceDocumentLiteralWrappedImplPort")
    public WebServiceDocumentWrapped getWebServiceDocumentLiteralWrappedImplPort() {
        return super.getPort(WebServiceDocumentLiteralWrappedImplPort, WebServiceDocumentWrapped.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceDocumentWrapped
     */
    @WebEndpoint(name = "WebServiceDocumentLiteralWrappedImplPort")
    public WebServiceDocumentWrapped getWebServiceDocumentLiteralWrappedImplPort(WebServiceFeature... features) {
        return super.getPort(WebServiceDocumentLiteralWrappedImplPort, WebServiceDocumentWrapped.class, features);
    }

}
