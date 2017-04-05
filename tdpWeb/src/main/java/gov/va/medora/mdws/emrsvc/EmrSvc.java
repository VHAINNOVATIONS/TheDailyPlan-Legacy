
/*
 * 
 */

package gov.va.medora.mdws.emrsvc;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.1.3
 * Wed Jan 05 13:15:55 MST 2011
 * Generated source version: 2.1.3
 * 
 */


@WebServiceClient(name = "EmrSvc", 
                  wsdlLocation = "file:src/main/resources/wsdl/emrsvc.wsdl",
                  targetNamespace = "http://mdws.medora.va.gov/EmrSvc") 
public class EmrSvc extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://mdws.medora.va.gov/EmrSvc", "EmrSvc");
    public final static QName EmrSvcSoap = new QName("http://mdws.medora.va.gov/EmrSvc", "EmrSvcSoap");
    public final static QName EmrSvcSoap12 = new QName("http://mdws.medora.va.gov/EmrSvc", "EmrSvcSoap12");
    public final static QName EmrSvcHttpGet = new QName("http://mdws.medora.va.gov/EmrSvc", "EmrSvcHttpGet");
    public final static QName EmrSvcHttpPost = new QName("http://mdws.medora.va.gov/EmrSvc", "EmrSvcHttpPost");
    static {
        URL url = null;
        try {
            url = new URL("file:src/main/resources/wsdl/emrsvc.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:src/main/resources/wsdl/emrsvc.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public EmrSvc(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EmrSvc(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmrSvc() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns EmrSvcSoap
     */
    @WebEndpoint(name = "EmrSvcSoap")
    public EmrSvcSoap getEmrSvcSoap() {
        return super.getPort(EmrSvcSoap, EmrSvcSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmrSvcSoap
     */
    @WebEndpoint(name = "EmrSvcSoap")
    public EmrSvcSoap getEmrSvcSoap(WebServiceFeature... features) {
        return super.getPort(EmrSvcSoap, EmrSvcSoap.class, features);
    }
    /**
     * 
     * @return
     *     returns EmrSvcSoap
     */
    @WebEndpoint(name = "EmrSvcSoap12")
    public EmrSvcSoap getEmrSvcSoap12() {
        return super.getPort(EmrSvcSoap12, EmrSvcSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmrSvcSoap
     */
    @WebEndpoint(name = "EmrSvcSoap12")
    public EmrSvcSoap getEmrSvcSoap12(WebServiceFeature... features) {
        return super.getPort(EmrSvcSoap12, EmrSvcSoap.class, features);
    }
    /**
     * 
     * @return
     *     returns EmrSvcHttpGet
     */
    @WebEndpoint(name = "EmrSvcHttpGet")
    public EmrSvcHttpGet getEmrSvcHttpGet() {
        return super.getPort(EmrSvcHttpGet, EmrSvcHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmrSvcHttpGet
     */
    @WebEndpoint(name = "EmrSvcHttpGet")
    public EmrSvcHttpGet getEmrSvcHttpGet(WebServiceFeature... features) {
        return super.getPort(EmrSvcHttpGet, EmrSvcHttpGet.class, features);
    }
    /**
     * 
     * @return
     *     returns EmrSvcHttpPost
     */
    @WebEndpoint(name = "EmrSvcHttpPost")
    public EmrSvcHttpPost getEmrSvcHttpPost() {
        return super.getPort(EmrSvcHttpPost, EmrSvcHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmrSvcHttpPost
     */
    @WebEndpoint(name = "EmrSvcHttpPost")
    public EmrSvcHttpPost getEmrSvcHttpPost(WebServiceFeature... features) {
        return super.getPort(EmrSvcHttpPost, EmrSvcHttpPost.class, features);
    }

}