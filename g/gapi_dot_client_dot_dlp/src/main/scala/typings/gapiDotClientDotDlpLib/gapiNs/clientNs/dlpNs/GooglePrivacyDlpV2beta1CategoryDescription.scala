package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1CategoryDescription extends js.Object {
  /** Human readable form of the category name. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** Internal name of the category. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object GooglePrivacyDlpV2beta1CategoryDescription {
  @scala.inline
  def apply(displayName: java.lang.String = null, name: java.lang.String = null): GooglePrivacyDlpV2beta1CategoryDescription = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CategoryDescription]
  }
}

