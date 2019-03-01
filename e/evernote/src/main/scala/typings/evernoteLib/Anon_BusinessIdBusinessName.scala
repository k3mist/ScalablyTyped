package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BusinessIdBusinessName extends js.Object {
  var businessId: js.UndefOr[scala.Double] = js.undefined
  var businessName: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.BusinessUserRole] = js.undefined
}

object Anon_BusinessIdBusinessName {
  @scala.inline
  def apply(
    businessId: scala.Int | scala.Double = null,
    businessName: java.lang.String = null,
    email: java.lang.String = null,
    role: evernoteLib.evernoteMod.EvernoteNs.BusinessUserRole = null
  ): Anon_BusinessIdBusinessName = {
    val __obj = js.Dynamic.literal()
    if (businessId != null) __obj.updateDynamic("businessId")(businessId.asInstanceOf[js.Any])
    if (businessName != null) __obj.updateDynamic("businessName")(businessName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[Anon_BusinessIdBusinessName]
  }
}

