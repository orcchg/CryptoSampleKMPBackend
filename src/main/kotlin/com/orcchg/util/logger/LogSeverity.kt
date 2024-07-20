package com.orcchg.util.logger

enum class LogSeverity(val priority: Int) {
    VERBOSE(1),
    DEBUG(2),
    INFO(4 /** same as for ERROR */),
    WARN(3),
    ERROR(4)
}
