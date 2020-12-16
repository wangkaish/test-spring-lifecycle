package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author: wangkai
 * @create: 2020-12-16 09:10
 **/
@Component
@ComponentScan(basePackages = {"test"})
@SpringBootApplication
public class Main {

    static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Main booting");
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Main.class);
        builder.web(WebApplicationType.NONE);
        builder.bannerMode(Banner.Mode.LOG);
        builder.run(args);
    }

}
