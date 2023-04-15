package com.n8ify.plantman.misc.callback;

import java.util.function.Consumer;

public interface TimeUsageLoggable {

    void logTimeUsage(Long startMillis, String tag, String message);

}
