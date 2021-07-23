package com.exquisApp.datapresenter.handler;

import com.exquisApp.datapresenter.models.SecurityReview;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import java.util.function.Function;

@Service
public class EventHandler {

    Logger logger = LoggerFactory.getLogger(EventHandler.class);

    @Bean
    public Function<SecurityReview, SecurityReview> processor() {
        return securityReview -> {
            // This is supposed to pick react to event received by data ingest and send to presenter-destination
            logger.info(" Receive event of type [{}], event [{}] ", SecurityReview.class, securityReview);
            return securityReview;
        };
    }

}
