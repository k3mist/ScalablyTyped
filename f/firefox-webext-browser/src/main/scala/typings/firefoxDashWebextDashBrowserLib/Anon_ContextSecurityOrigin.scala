package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextSecurityOrigin extends js.Object {
  /**
    * Evaluate the expression in the context of a content script of an extension that matches the specified
    * origin. If given, contextSecurityOrigin overrides the 'true' setting on userContentScriptContext.
    * @deprecated Unsupported on Firefox at this time.
    */
  var contextSecurityOrigin: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If specified, the expression is evaluated on the iframe whose URL matches the one specified. By default, the
    * expression is evaluated in the top frame of the inspected page.
    * @deprecated Unsupported on Firefox at this time.
    */
  var frameURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Evaluate the expression in the context of the content script of the calling extension, provided that the
    * content script is already injected into the inspected page. If not, the expression is not evaluated and the
    * callback is invoked with the exception parameter set to an object that has the `isError` field set to true
    * and the `code` field set to `E_NOTFOUND`.
    * @deprecated Unsupported on Firefox at this time.
    */
  var useContentScriptContext: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ContextSecurityOrigin {
  @scala.inline
  def apply(
    contextSecurityOrigin: java.lang.String = null,
    frameURL: java.lang.String = null,
    useContentScriptContext: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ContextSecurityOrigin = {
    val __obj = js.Dynamic.literal()
    if (contextSecurityOrigin != null) __obj.updateDynamic("contextSecurityOrigin")(contextSecurityOrigin)
    if (frameURL != null) __obj.updateDynamic("frameURL")(frameURL)
    if (!js.isUndefined(useContentScriptContext)) __obj.updateDynamic("useContentScriptContext")(useContentScriptContext)
    __obj.asInstanceOf[Anon_ContextSecurityOrigin]
  }
}

