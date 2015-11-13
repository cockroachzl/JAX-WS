package ch01.ts;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by liang on 11/12/2015.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TimeServer {
    @WebMethod String getTimeAsString();

    @WebMethod long getTimeAsElapsed();
}
