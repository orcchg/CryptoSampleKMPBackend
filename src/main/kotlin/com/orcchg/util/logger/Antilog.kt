package com.orcchg.util.logger

abstract class Antilog {

    abstract val severity: LogSeverity

    fun log(severity: LogSeverity, tag: String, e: Throwable? = null, message: String) {
        if (this.severity.priority > severity.priority) {
            return
        }

        e?.let {
            println("$tag: ${e.message} :: $message")
            e.printStackTrace()
        }
            ?: println("$tag: $message")
    }
}

class DebugLogger : Antilog() {
    override val severity: LogSeverity = LogSeverity.VERBOSE
}

class InfoLogger : Antilog() {
    override val severity: LogSeverity = LogSeverity.INFO
}

class ReleaseLogger : Antilog() {
    override val severity: LogSeverity = LogSeverity.ERROR
}
