package ch02.ts;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by liang on 11/12/2015.
 */
@WebService
//@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface TimeServer {
    @WebMethod String getTimeAsString();

    @WebMethod long getTimeAsElapsed();
}
