
package main;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RiverDatabaseService", targetNamespace = "http://main/", wsdlLocation = "http://localhost:8080/SOAP_253_CW/RiverDatabaseService?wsdl")
public class RiverDatabaseService
    extends Service
{

    private final static URL RIVERDATABASESERVICE_WSDL_LOCATION;
    private final static WebServiceException RIVERDATABASESERVICE_EXCEPTION;
    private final static QName RIVERDATABASESERVICE_QNAME = new QName("http://main/", "RiverDatabaseService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SOAP_253_CW/RiverDatabaseService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RIVERDATABASESERVICE_WSDL_LOCATION = url;
        RIVERDATABASESERVICE_EXCEPTION = e;
    }

    public RiverDatabaseService() {
        super(__getWsdlLocation(), RIVERDATABASESERVICE_QNAME);
    }

    public RiverDatabaseService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RIVERDATABASESERVICE_QNAME, features);
    }

    public RiverDatabaseService(URL wsdlLocation) {
        super(wsdlLocation, RIVERDATABASESERVICE_QNAME);
    }

    public RiverDatabaseService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RIVERDATABASESERVICE_QNAME, features);
    }

    public RiverDatabaseService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RiverDatabaseService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RiverDatabase
     */
    @WebEndpoint(name = "RiverDatabasePort")
    public RiverDatabase getRiverDatabasePort() {
        return super.getPort(new QName("http://main/", "RiverDatabasePort"), RiverDatabase.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RiverDatabase
     */
    @WebEndpoint(name = "RiverDatabasePort")
    public RiverDatabase getRiverDatabasePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://main/", "RiverDatabasePort"), RiverDatabase.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RIVERDATABASESERVICE_EXCEPTION!= null) {
            throw RIVERDATABASESERVICE_EXCEPTION;
        }
        return RIVERDATABASESERVICE_WSDL_LOCATION;
    }

}