package com.orcchg.util.logger

object Logger {
    private val baseArray = mutableListOf<Antilog>()

    fun install(logger: Antilog) {
        baseArray.add(logger)
    }

    fun v(tag: String = "", message: String) {
        if (isEnabled()) log(LogSeverity.VERBOSE, tag, null, message)
    }
    fun d(tag: String = "", message: String) {
        if (isEnabled()) log(LogSeverity.DEBUG, tag, null, message)
    }
    fun i(tag: String = "", message: String) {
        if (isEnabled()) log(LogSeverity.INFO, tag, null, message)
    }
    fun w(tag: String = "", e: Throwable? = null, message: String) {
        if (isEnabled()) log(LogSeverity.WARN, tag, e, message)
    }
    fun e(tag: String = "", e: Throwable? = null, message: String) {
        if (isEnabled()) log(LogSeverity.ERROR, tag, e, message)
    }

    private fun isEnabled(): Boolean = baseArray.isNotEmpty()
    private fun log(severity: LogSeverity, tag: String, e: Throwable? = null, message: String) {
        baseArray.forEach { it.log(severity, tag, e, message) }
    }
}
