package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordChangeTicketParams extends js.Object {
  var connection_id: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var new_password: js.UndefOr[java.lang.String] = js.undefined
  var result_url: js.UndefOr[java.lang.String] = js.undefined
  var ttl_sec: js.UndefOr[scala.Double] = js.undefined
  var user_id: js.UndefOr[java.lang.String] = js.undefined
}

object PasswordChangeTicketParams {
  @scala.inline
  def apply(
    connection_id: java.lang.String = null,
    email: java.lang.String = null,
    new_password: java.lang.String = null,
    result_url: java.lang.String = null,
    ttl_sec: scala.Int | scala.Double = null,
    user_id: java.lang.String = null
  ): PasswordChangeTicketParams = {
    val __obj = js.Dynamic.literal()
    if (connection_id != null) __obj.updateDynamic("connection_id")(connection_id)
    if (email != null) __obj.updateDynamic("email")(email)
    if (new_password != null) __obj.updateDynamic("new_password")(new_password)
    if (result_url != null) __obj.updateDynamic("result_url")(result_url)
    if (ttl_sec != null) __obj.updateDynamic("ttl_sec")(ttl_sec.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id)
    __obj.asInstanceOf[PasswordChangeTicketParams]
  }
}

