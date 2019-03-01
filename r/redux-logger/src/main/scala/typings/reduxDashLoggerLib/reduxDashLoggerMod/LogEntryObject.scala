package typings
package reduxDashLoggerLib.reduxDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntryObject extends js.Object {
  var action: js.UndefOr[java.lang.String | scala.Boolean | ActionToString] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.undefined
  var nextState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.undefined
  var prevState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.undefined
  var started: js.UndefOr[scala.Double] = js.undefined
  var startedTime: js.UndefOr[stdLib.Date] = js.undefined
  var took: js.UndefOr[scala.Double] = js.undefined
}

object LogEntryObject {
  @scala.inline
  def apply(
    action: java.lang.String | scala.Boolean | ActionToString = null,
    error: js.Function1[/* error */ js.Any, _] = null,
    nextState: js.Function1[/* state */ js.Any, _] = null,
    prevState: js.Function1[/* state */ js.Any, _] = null,
    started: scala.Int | scala.Double = null,
    startedTime: stdLib.Date = null,
    took: scala.Int | scala.Double = null
  ): LogEntryObject = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (nextState != null) __obj.updateDynamic("nextState")(nextState)
    if (prevState != null) __obj.updateDynamic("prevState")(prevState)
    if (started != null) __obj.updateDynamic("started")(started.asInstanceOf[js.Any])
    if (startedTime != null) __obj.updateDynamic("startedTime")(startedTime)
    if (took != null) __obj.updateDynamic("took")(took.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntryObject]
  }
}

