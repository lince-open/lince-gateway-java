package work.lince.gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;
import java.time.temporal.Temporal;
import java.util.Date;

@Component
public class GatewayInfoContributor implements InfoContributor {

    @Autowired
    protected ApplicationContext context;

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("user", "anonymous");
        builder.withDetail("now", this.getServerDateTime());
        builder.withDetail("startupDate", this.getServerStartup());
    }

    protected Temporal getServerDateTime() {
        return ZonedDateTime.now();
    }

    protected Date getServerStartup() {
        return new Date(context.getStartupDate());
    }


}