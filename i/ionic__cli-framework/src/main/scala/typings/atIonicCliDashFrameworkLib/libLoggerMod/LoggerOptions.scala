package typings
package atIonicCliDashFrameworkLib.libLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions extends js.Object {
  val handlers: js.UndefOr[stdLib.Set[LoggerHandler]] = js.undefined
  val level: js.UndefOr[LoggerLevelWeight] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(handlers: stdLib.Set[LoggerHandler] = null, level: js.UndefOr[LoggerLevelWeight] = js.undefined): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (handlers != null) __obj.updateDynamic("handlers")(handlers)
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[LoggerOptions]
  }
}

