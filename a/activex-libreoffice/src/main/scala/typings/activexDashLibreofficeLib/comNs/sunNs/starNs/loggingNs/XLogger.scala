package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implemented by a component which is able to log events.
  *
  * This interface is roughly designed after the [Java Logging API]{@link
  * url="http://java.sun.com/javase/6/docs/api/java/util/logging/package-summary.html"} . However, there are some differences, the major ones being:
  * There's no support (yet) for filtering log events.There ain't no convenience methods for logging.There's no localization support.Logger instances do
  * not form a hierarchy.
  * @since OOo 2.3
  */
trait XLogger extends js.Object {
  /**
    * specifies which log events are logged or ignored.
    * @see LogLevel
    */
  var Level: scala.Double
  /** denotes the name of the logger. */
  var Name: java.lang.String
  /**
    * adds the given handler to the list of handlers.
    *
    * When an event is logged, the logger will create a {@link LogRecord} for this event, and pass this record to all registered handlers. Single handlers
    * might or might not log those records at their own discretion, and depending on additional restrictions such as filters specified at handler level.
    *
    * Note: The log level of the given handler ( {@link XLogHandler.Level} ) will not be touched. In particular, it will not be set to the logger's log
    * level. It's the responsibility of the component which knits a logger with one or more log handlers to ensure that all loggers have appropriate levels
    * set.
    * @param LogHandler the handler to add to the list of handlers. The call is ignored if this parameter is `NULL` .
    */
  def addLogHandler(LogHandler: XLogHandler): scala.Unit
  /**
    * determines whether logger instance would produce any output for the given level.
    *
    * The method can be used to optimize performance as maybe complex parameter evaluation in the `log` calls can be omitted if `isLoggable` evaluates to
    * false.
    * @param Level level to be checked against
    * @returns `TRUE` if there would be some output for this {@link XLogger} for the given level, `FALSE` otherwise. Note that a return value of `FALSE` could a
    * @see addLogHandler
    * @see removeLogHandler
    */
  def isLoggable(Level: scala.Double): scala.Boolean
  /**
    * logs a given message
    * @param Level the log level of this message. If this level is smaller than the logger's {@link Level} attribute, then the call will be ignored.
    * @param Message the message to log
    */
  def log(Level: scala.Double, Message: java.lang.String): scala.Unit
  /**
    * logs a given message, detailing the source class and method at which the logged event occurred.
    * @param Level the log level of this message. If this level is smaller than the logger's {@link Level} attribute, then the call will be ignored.
    * @param SourceClass the source class at which the logged event occurred.
    * @param SourceMethod the source class at which the logged event occurred.
    * @param Message the message to log
    */
  def logp(
    Level: scala.Double,
    SourceClass: java.lang.String,
    SourceMethod: java.lang.String,
    Message: java.lang.String
  ): scala.Unit
  /**
    * removes the given handler from the list of handlers.
    * @param LogHandler the handler to remove from the list of handlers. The call is ignored if this parameter is `NULL` , or if the handler has not previousl
    */
  def removeLogHandler(LogHandler: XLogHandler): scala.Unit
}

object XLogger {
  @scala.inline
  def apply(
    Level: scala.Double,
    Name: java.lang.String,
    addLogHandler: js.Function1[XLogHandler, scala.Unit],
    isLoggable: js.Function1[scala.Double, scala.Boolean],
    log: js.Function2[scala.Double, java.lang.String, scala.Unit],
    logp: js.Function4[scala.Double, java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    removeLogHandler: js.Function1[XLogHandler, scala.Unit]
  ): XLogger = {
    val __obj = js.Dynamic.literal(Level = Level, Name = Name, addLogHandler = addLogHandler, isLoggable = isLoggable, log = log, logp = logp, removeLogHandler = removeLogHandler)
  
    __obj.asInstanceOf[XLogger]
  }
}

