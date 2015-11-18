package ch02.ts;

import javax.jws.WebService;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * Created by liang on 11/12/2015.
 */
@WebService(endpointInterface = "ch02.ts.TimeServer")
public class TimeServerImpl implements TimeServer {
    @Override
    public String getTimeAsString() {
        return LocalDateTime.now().toString();
    }

    @Override
    public long getTimeAsElapsed() {
        return LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
    }


}
