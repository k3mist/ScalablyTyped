package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  /** Source file name. Depending on the runtime environment, this might be a simple name or a fully-qualified name. */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Human-readable name of the function or method being invoked, with optional context such as the class or package name. This information is used in
    * contexts such as the logs viewer, where a file and line number are less meaningful. The format can vary by language. For example:
    * qual.if.ied.Class.method (Java), dir/package.func (Go), function (Python).
    */
  var functionName: js.UndefOr[java.lang.String] = js.undefined
  /** Line within the source file. */
  var line: js.UndefOr[java.lang.String] = js.undefined
}

object SourceLocation {
  @scala.inline
  def apply(
    file: java.lang.String = null,
    functionName: java.lang.String = null,
    line: java.lang.String = null
  ): SourceLocation = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    if (functionName != null) __obj.updateDynamic("functionName")(functionName)
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[SourceLocation]
  }
}

