package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @author: wangkai
 * @create: 2020-12-16 09:13
 **/
@Component
public class StepTwo implements SmartLifecycle {

    private static final Logger logger = LoggerFactory.getLogger(StepTwo.class);
    private volatile boolean running = false;

    @Override
    public synchronized void start() {
        throw new RuntimeException("StepTwo error");
    }

    @Override
    public synchronized void stop() {
        if (running) {
            running = false;
            logger.info("^^^^^^^^^^ StepTwo stopped");
        }
    }

    @Override
    public void stop(Runnable callback) {
        stop();
        callback.run();
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public int getPhase() {
        return 2;
    }
}
