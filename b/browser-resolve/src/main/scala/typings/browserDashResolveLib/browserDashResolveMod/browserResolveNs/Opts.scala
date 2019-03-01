package typings
package browserDashResolveLib.browserDashResolveMod.browserResolveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts extends js.Object {
  // the 'browser' property to use from package.json (defaults to 'browser')
  var browser: js.UndefOr[java.lang.String] = js.undefined
  // the calling filename where the require() call originated (in the source)
  var filename: js.UndefOr[java.lang.String] = js.undefined
  // modules object with id to path mappings to consult before doing manual resolution (use to provide core modules)
  var modules: js.UndefOr[js.Any] = js.undefined
}

object Opts {
  @scala.inline
  def apply(browser: java.lang.String = null, filename: java.lang.String = null, modules: js.Any = null): Opts = {
    val __obj = js.Dynamic.literal()
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (modules != null) __obj.updateDynamic("modules")(modules)
    __obj.asInstanceOf[Opts]
  }
}

