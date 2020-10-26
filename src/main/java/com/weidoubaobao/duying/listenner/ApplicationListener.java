package com.weidoubaobao.duying.listenner;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationListener   {

    @EventListener
    public void onApplicationEvent(TestEvent testEvent) {
            testEvent.printMessage("好了 我知道了 我收到了噢");
    }
}
