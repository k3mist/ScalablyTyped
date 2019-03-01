package typings
package sumoDashLoggerLib.sumoDashLoggerMod.SumoLoggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerMessageOptions extends js.Object {
  /** Override a session key set in the `config` call. */
  var sessionKey: java.lang.String
  /**
    * Defaults to `new Date()` called when processing the log call.
    * Use this when the event being logged occurred
    * at a different time than when the log was sent.
    */
  var timestamp: stdLib.Date
  /** Override client URL set in the config call. (Node version only) */
  var url: java.lang.String
}

object PerMessageOptions {
  @scala.inline
  def apply(sessionKey: java.lang.String, timestamp: stdLib.Date, url: java.lang.String): PerMessageOptions = {
    val __obj = js.Dynamic.literal(sessionKey = sessionKey, timestamp = timestamp, url = url)
  
    __obj.asInstanceOf[PerMessageOptions]
  }
}

