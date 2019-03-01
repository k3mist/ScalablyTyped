package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterprisesListResponse extends js.Object {
  /** An enterprise. */
  var enterprise: js.UndefOr[js.Array[Enterprise]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#enterprisesListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object EnterprisesListResponse {
  @scala.inline
  def apply(enterprise: js.Array[Enterprise] = null, kind: java.lang.String = null): EnterprisesListResponse = {
    val __obj = js.Dynamic.literal()
    if (enterprise != null) __obj.updateDynamic("enterprise")(enterprise)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[EnterprisesListResponse]
  }
}

