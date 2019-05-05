package com.radiantsage.service.product._1;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceProvider;

/*@WebServiceProvider(serviceName="ProductService",
					wsdlLocation = "WEB-INF/wsdl/product.wsdl", 
					portName = "ProductServiceSoap11Port", 
					targetNamespace = "http://service.radiantsage.com/product/1.0")*/

@WebService
public class ProductWebService {
	private ProductService productService;

	@WebMethod(exclude = true)
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@WebMethod
	public Product registerProduct(Product product) {
		return this.productService.registerProduct(product);
	}
}
