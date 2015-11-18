
package ch02.ts.clientAsync;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TimeServer", targetNamespace = "http://ts.ch02/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TimeServer {


    /**
     * 
     * @return
     *     returns javax.xml.ws.Response<ch02.ts.clientAsync.GetTimeAsStringResponse>
     */
    @WebMethod(operationName = "getTimeAsString")
    @RequestWrapper(localName = "getTimeAsString", targetNamespace = "http://ts.ch02/", className = "ch02.ts.clientAsync.GetTimeAsString")
    @ResponseWrapper(localName = "getTimeAsStringResponse", targetNamespace = "http://ts.ch02/", className = "ch02.ts.clientAsync.GetTimeAsStringResponse")
    public Response<GetTimeAsStringResponse> getTimeAsStringAsync();

    /**
     * 
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getTimeAsString")
    @RequestWrapper(localName = "getTimeAsString", targetNamespace = "http://ts.ch02/", className = "ch02.ts.clientAsync.GetTimeAsString")
    @ResponseWrapper(localName = "getTimeAsStringResponse", targetNamespace = "http://ts.ch02/", className = "ch02.ts.clientAsync.GetTimeAsStringResponse")
    public Future<?> getTimeAsStringAsync(
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<GetTimeAsStringResponse> asyncHandler);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTimeAsString", targetNamespace = "http://ts.ch02/", className = "ch02.ts.clientAsync.GetTimeAsString")
    @ResponseWrapper(localName = "getTimeAsStringResponse", targetNamespace = "http://ts.ch02/", className = "ch02.ts.clientAsync.GetTimeAsStringResponse")
    @Action(input = "http://ts.ch02/TimeServer/getTimeAsStringRequest", output = "http://ts.ch02/TimeServer/getTimeAsStringResponse")
    public String getTimeAsString();

    /**
     * 
     * @return
     *     returns javax.xml.ws.Response<ch02.ts.clientAsync.GetTimeAsElapsedResponse>
     */
    @WebMethod(operationName = "getTimeAsElapsed")
    @RequestWrapper(localName = "getTimeAsElapsed", targetNamespace = "http://ts.ch02/", className = "ch02.ts.clientAsync.GetTimeAsElapsed")
    @ResponseWrapper(localName = "getTimeAsElapsedResponse", targetNamespace = "http://ts.ch02/", className = "ch02.ts.clientAsync.GetTimeAsElapsedResponse")
    public Response<GetTimeAsElapsedResponse> getTimeAsElapsedAsync();

    /**
     * 
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getTimeAsElapsed")
    @RequestWrapper(localName = "getTimeAsElapsed", targetNamespace = "http://ts.ch02/", className = "ch02.ts.clientAsync.GetTimeAsElapsed")
    @ResponseWrapper(localName = "getTimeAsElapsedResponse", targetNamespace = "http://ts.ch02/", className = "ch02.ts.clientAsync.GetTimeAsElapsedResponse")
    public Future<?> getTimeAsElapsedAsync(
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<GetTimeAsElapsedResponse> asyncHandler);

    /**
     * 
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTimeAsElapsed", targetNamespace = "http://ts.ch02/", className = "ch02.ts.clientAsync.GetTimeAsElapsed")
    @ResponseWrapper(localName = "getTimeAsElapsedResponse", targetNamespace = "http://ts.ch02/", className = "ch02.ts.clientAsync.GetTimeAsElapsedResponse")
    @Action(input = "http://ts.ch02/TimeServer/getTimeAsElapsedRequest", output = "http://ts.ch02/TimeServer/getTimeAsElapsedResponse")
    public long getTimeAsElapsed();

}