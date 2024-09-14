package com.study.Board.aop;

import groovy.util.logging.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Aspec
@Component
public class LoggerAspect {
    @Around
    public Object printLog(Proceeding)
}
