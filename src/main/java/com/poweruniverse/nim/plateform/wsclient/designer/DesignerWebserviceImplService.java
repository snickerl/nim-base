
package com.poweruniverse.nim.plateform.wsclient.designer;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DesignerWebserviceImplService", targetNamespace = "http://webservice.plateform.nim.poweruniverse.com/", wsdlLocation = "http://127.0.0.1:1081/ws/nim-plateform/designer?wsdl")
public class DesignerWebserviceImplService
    extends Service
{

    private final static URL DESIGNERWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException DESIGNERWEBSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName DESIGNERWEBSERVICEIMPLSERVICE_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "DesignerWebserviceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:1081/ws/nim-plateform/designer?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DESIGNERWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        DESIGNERWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public DesignerWebserviceImplService() {
        super(__getWsdlLocation(), DESIGNERWEBSERVICEIMPLSERVICE_QNAME);
    }

    public DesignerWebserviceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DESIGNERWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public DesignerWebserviceImplService(URL wsdlLocation) {
        super(wsdlLocation, DESIGNERWEBSERVICEIMPLSERVICE_QNAME);
    }

    public DesignerWebserviceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DESIGNERWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public DesignerWebserviceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DesignerWebserviceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DesignerWebserviceImpl
     */
    @WebEndpoint(name = "DesignerWebserviceImplPort")
    public DesignerWebserviceImpl getDesignerWebserviceImplPort() {
        return super.getPort(new QName("http://webservice.plateform.nim.poweruniverse.com/", "DesignerWebserviceImplPort"), DesignerWebserviceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DesignerWebserviceImpl
     */
    @WebEndpoint(name = "DesignerWebserviceImplPort")
    public DesignerWebserviceImpl getDesignerWebserviceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.plateform.nim.poweruniverse.com/", "DesignerWebserviceImplPort"), DesignerWebserviceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DESIGNERWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw DESIGNERWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return DESIGNERWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
