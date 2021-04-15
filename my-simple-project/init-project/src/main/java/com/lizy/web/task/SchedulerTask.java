package com.lizy.web.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class SchedulerTask {
	
	/**
	    * 固定时间执行cron
	 */
    
    @Scheduled(cron="*/6 * * * * ?")
    private void process(){
        System.out.println("this is scheduler task runing  ");
    }
    
    
    
    
    /**
                * 固定间隔执行
     */
    @Scheduled(fixedRate = 6000)
    public void reportCurrentTime() {
    	SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }

}
