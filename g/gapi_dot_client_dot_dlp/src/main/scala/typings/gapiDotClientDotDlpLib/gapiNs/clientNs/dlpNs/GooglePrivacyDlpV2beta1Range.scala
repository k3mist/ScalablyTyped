package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1Range extends js.Object {
  /** Index of the last character of the range (exclusive). */
  var end: js.UndefOr[java.lang.String] = js.undefined
  /** Index of the first character of the range (inclusive). */
  var start: js.UndefOr[java.lang.String] = js.undefined
}

object GooglePrivacyDlpV2beta1Range {
  @scala.inline
  def apply(end: java.lang.String = null, start: java.lang.String = null): GooglePrivacyDlpV2beta1Range = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Range]
  }
}

