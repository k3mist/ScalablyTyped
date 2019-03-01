package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestIssue extends js.Object {
  /** A brief human-readable message describing the issue. Required. */
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  /** Severity of issue. Required. */
  var severity: js.UndefOr[java.lang.String] = js.undefined
  /** Deprecated in favor of stack trace fields inside specific warnings. */
  var stackTrace: js.UndefOr[StackTrace] = js.undefined
  /** Type of issue. Required. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Warning message with additional details of the issue. Should always be a message from com.google.devtools.toolresults.v1.warnings Required. */
  var warning: js.UndefOr[Any] = js.undefined
}

object TestIssue {
  @scala.inline
  def apply(
    errorMessage: java.lang.String = null,
    severity: java.lang.String = null,
    stackTrace: StackTrace = null,
    `type`: java.lang.String = null,
    warning: Any = null
  ): TestIssue = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (stackTrace != null) __obj.updateDynamic("stackTrace")(stackTrace)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[TestIssue]
  }
}

