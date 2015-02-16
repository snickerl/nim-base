
package com.poweruniverse.nim.data.wsclient.verify;

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
@WebServiceClient(name = "VerifyWebserviceImplService", targetNamespace = "http://webservice.data.nim.poweruniverse.com/", wsdlLocation = "http://127.0.0.1:1081/ws/nim-data/verify?wsdl")
public class VerifyWebserviceImplService
    extends Service
{

    private final static URL VERIFYWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException VERIFYWEBSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName VERIFYWEBSERVICEIMPLSERVICE_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "VerifyWebserviceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:1081/ws/nim-data/verify?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VERIFYWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        VERIFYWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public VerifyWebserviceImplService() {
        super(__getWsdlLocation(), VERIFYWEBSERVICEIMPLSERVICE_QNAME);
    }

    public VerifyWebserviceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VERIFYWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public VerifyWebserviceImplService(URL wsdlLocation) {
        super(wsdlLocation, VERIFYWEBSERVICEIMPLSERVICE_QNAME);
    }

    public VerifyWebserviceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VERIFYWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public VerifyWebserviceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VerifyWebserviceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VerifyWebserviceImpl
     */
    @WebEndpoint(name = "VerifyWebserviceImplPort")
    public VerifyWebserviceImpl getVerifyWebserviceImplPort() {
        return super.getPort(new QName("http://webservice.data.nim.poweruniverse.com/", "VerifyWebserviceImplPort"), VerifyWebserviceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VerifyWebserviceImpl
     */
    @WebEndpoint(name = "VerifyWebserviceImplPort")
    public VerifyWebserviceImpl getVerifyWebserviceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.data.nim.poweruniverse.com/", "VerifyWebserviceImplPort"), VerifyWebserviceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VERIFYWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw VERIFYWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return VERIFYWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
