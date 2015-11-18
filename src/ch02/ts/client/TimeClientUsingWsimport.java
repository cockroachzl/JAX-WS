package ch02.ts.client;

/**
 * Created by liang on 11/17/2015.
 */
public class TimeClientUsingWsimport {
    public static void main(String[] args) {
        TimeServerImplService service  = new TimeServerImplService();

        TimeServer timeServer = service.getTimeServerImplPort();

        System.out.println(timeServer.getTimeAsElapsed());
        System.out.println(timeServer.getTimeAsString());
    }
}
