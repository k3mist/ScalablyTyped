package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Administrator extends js.Object {
  /** The admin's email address. */
  var email: js.UndefOr[java.lang.String] = js.undefined
}

object Administrator {
  @scala.inline
  def apply(email: java.lang.String = null): Administrator = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    __obj.asInstanceOf[Administrator]
  }
}

