package com.emirhansoylu.scheduled;

import java.util.Iterator;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component //spring containerde beani olması gerekiyo
public class ScheduledExample {
	
	// * * * * * *
	@Scheduled(cron =" 00 40 16 * * *" )
	public void write1To10() {
		for(int i=1; i<=10; i++) {
			System.out.println(i +"");
		}
		
	}

}
