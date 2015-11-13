package ch01.ts;

import javax.xml.ws.Endpoint;

/**
 * Created by liang on 11/12/2015.
 * See WSDL in http://localhost:9876/ts?wsdl
 */
public class TimeServerPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9876/ts", new TimeServerImpl());
    }
}
