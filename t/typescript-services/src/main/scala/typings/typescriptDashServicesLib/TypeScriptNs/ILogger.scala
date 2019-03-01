package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogger extends js.Object {
  def debug(): scala.Boolean
  def error(): scala.Boolean
  def fatal(): scala.Boolean
  def information(): scala.Boolean
  def log(s: java.lang.String): scala.Unit
  def warning(): scala.Boolean
}

object ILogger {
  @scala.inline
  def apply(
    debug: js.Function0[scala.Boolean],
    error: js.Function0[scala.Boolean],
    fatal: js.Function0[scala.Boolean],
    information: js.Function0[scala.Boolean],
    log: js.Function1[java.lang.String, scala.Unit],
    warning: js.Function0[scala.Boolean]
  ): ILogger = {
    val __obj = js.Dynamic.literal(debug = debug, error = error, fatal = fatal, information = information, log = log, warning = warning)
  
    __obj.asInstanceOf[ILogger]
  }
}

