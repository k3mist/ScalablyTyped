package typings
package protractorLib.builtPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionResult extends js.Object {
  var errorMsg: js.UndefOr[java.lang.String] = js.undefined
  var passed: scala.Boolean
  var stackTrace: js.UndefOr[java.lang.String] = js.undefined
}

object AssertionResult {
  @scala.inline
  def apply(passed: scala.Boolean, errorMsg: java.lang.String = null, stackTrace: java.lang.String = null): AssertionResult = {
    val __obj = js.Dynamic.literal(passed = passed)
    if (errorMsg != null) __obj.updateDynamic("errorMsg")(errorMsg)
    if (stackTrace != null) __obj.updateDynamic("stackTrace")(stackTrace)
    __obj.asInstanceOf[AssertionResult]
  }
}

