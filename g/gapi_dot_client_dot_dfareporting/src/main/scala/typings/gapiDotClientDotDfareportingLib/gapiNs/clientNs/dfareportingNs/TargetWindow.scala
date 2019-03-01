package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetWindow extends js.Object {
  /** User-entered value. */
  var customHtml: js.UndefOr[java.lang.String] = js.undefined
  /** Type of browser window for which the backup image of the flash creative can be displayed. */
  var targetWindowOption: js.UndefOr[java.lang.String] = js.undefined
}

object TargetWindow {
  @scala.inline
  def apply(customHtml: java.lang.String = null, targetWindowOption: java.lang.String = null): TargetWindow = {
    val __obj = js.Dynamic.literal()
    if (customHtml != null) __obj.updateDynamic("customHtml")(customHtml)
    if (targetWindowOption != null) __obj.updateDynamic("targetWindowOption")(targetWindowOption)
    __obj.asInstanceOf[TargetWindow]
  }
}

