package ru.romanow.protocols.soap.web;

import ru.romanow.protocols.api.model.TestObjectRequest;
import ru.romanow.protocols.api.model.TestObjectResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "WebServiceRpcLiteral")
@SOAPBinding(style = SOAPBinding.Style.RPC,
        use = SOAPBinding.Use.LITERAL,
        parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WebServiceRpcLiteral {

    @WebMethod(operationName = "processRequest")
    @WebResult(name = "TestObjectResponse")
    TestObjectResponse processRequest(
            @WebParam(name = "TestObjectRequest") TestObjectRequest request);
}
