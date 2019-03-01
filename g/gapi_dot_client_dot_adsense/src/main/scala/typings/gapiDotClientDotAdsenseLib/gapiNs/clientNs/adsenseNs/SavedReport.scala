package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedReport extends js.Object {
  /** Unique identifier of this saved report. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is, in this case adsense#savedReport. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** This saved report's name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object SavedReport {
  @scala.inline
  def apply(id: java.lang.String = null, kind: java.lang.String = null, name: java.lang.String = null): SavedReport = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SavedReport]
  }
}

