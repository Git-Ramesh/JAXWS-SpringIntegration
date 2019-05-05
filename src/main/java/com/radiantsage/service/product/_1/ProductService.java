
package com.radiantsage.service.product._1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductService", targetNamespace = "http://service.radiantsage.com/product/1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductService {


    /**
     * 
     * @param product
     * @return
     *     returns com.radiantsage.service.product._1.Product
     */
    @WebMethod(action = "http://service.radiantsage.com/product/1.0/registerProduct")
    @WebResult(name = "ProductSoapOut", targetNamespace = "http://service.radiantsage.com/product/1.0", partName = "parameters")
    public Product registerProduct(
        @WebParam(name = "ProductSoapIn", targetNamespace = "http://service.radiantsage.com/product/1.0", partName = "product")
        Product product);

}