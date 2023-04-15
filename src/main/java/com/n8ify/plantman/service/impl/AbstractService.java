package com.n8ify.plantman.service.impl;

import com.n8ify.plantman.misc.callback.TimeUsageLoggable;
import com.n8ify.plantman.util.DateUtil;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractService implements TimeUsageLoggable {

    @Override
    public void logTimeUsage(Long startMillis, String tag, String message) {
        log.info(String.format("[%s] %s, Time usage is [%s]", tag, message, DateUtil.prettyTime(System.currentTimeMillis() - startMillis)));
    }

}
