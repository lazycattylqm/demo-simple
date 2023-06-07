package com.demo.pure.demosimple.scheduler;

import java.time.Instant;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SchedulerJob {

  @Scheduled(cron = "0 0 * * * ?")
  public void run() {
    log.info("now time is {}", Instant.now());
  }
  
}
