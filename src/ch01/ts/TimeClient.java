package ch01.ts;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by liazhang on 11/13/2015.
 */
public class TimeClient {
    public static void main(String args[]) throws MalformedURLException {
        URL url = new URL("http://localhost:9876/ts");

        QName qname = new QName("http://ts.ch01/", "TimeServerImplService");

        Service service = Service.create(url, qname);

        TimeServer ts = service.getPort(TimeServer.class);

        System.out.println(ts.getTimeAsElapsed());
        System.out.println(ts.getTimeAsString());
    }
}
