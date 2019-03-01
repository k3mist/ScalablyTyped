package typings
package reactDashInlinesvgLib.reactDashInlinesvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineSVGError
  extends stdLib.Error {
  var isConfigurationError: scala.Boolean
  var isSupportedBrowser: scala.Boolean
  var isUnsupportedBrowserError: scala.Boolean
  @JSName("name")
  var name_InlineSVGError: reactDashInlinesvgLib.reactDashInlinesvgLibStrings.InlineSVGError
}

object InlineSVGError {
  @scala.inline
  def apply(
    isConfigurationError: scala.Boolean,
    isSupportedBrowser: scala.Boolean,
    isUnsupportedBrowserError: scala.Boolean,
    message: java.lang.String,
    name: reactDashInlinesvgLib.reactDashInlinesvgLibStrings.InlineSVGError,
    stack: java.lang.String = null
  ): InlineSVGError = {
    val __obj = js.Dynamic.literal(isConfigurationError = isConfigurationError, isSupportedBrowser = isSupportedBrowser, isUnsupportedBrowserError = isUnsupportedBrowserError, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InlineSVGError]
  }
}

