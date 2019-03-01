package typings
package intercomDashWebLib.IntercomUnderscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntercomSettings extends js.Object {
  var alignment: js.UndefOr[java.lang.String] = js.undefined
  var app_id: js.UndefOr[java.lang.String] = js.undefined
  var company: js.UndefOr[intercomDashWebLib.Anon_Createdat] = js.undefined
  var created_at: js.UndefOr[scala.Double] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var hide_default_launcher: js.UndefOr[scala.Boolean] = js.undefined
  var horizontal_padding: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var user_hash: js.UndefOr[java.lang.String] = js.undefined
  var user_id: js.UndefOr[java.lang.String] = js.undefined
  var vertical_padding: js.UndefOr[scala.Double] = js.undefined
  var widget: js.UndefOr[intercomDashWebLib.Anon_Activator] = js.undefined
}

object IntercomSettings {
  @scala.inline
  def apply(
    alignment: java.lang.String = null,
    app_id: java.lang.String = null,
    company: intercomDashWebLib.Anon_Createdat = null,
    created_at: scala.Int | scala.Double = null,
    email: java.lang.String = null,
    hide_default_launcher: js.UndefOr[scala.Boolean] = js.undefined,
    horizontal_padding: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    user_hash: java.lang.String = null,
    user_id: java.lang.String = null,
    vertical_padding: scala.Int | scala.Double = null,
    widget: intercomDashWebLib.Anon_Activator = null
  ): IntercomSettings = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (company != null) __obj.updateDynamic("company")(company)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(hide_default_launcher)) __obj.updateDynamic("hide_default_launcher")(hide_default_launcher)
    if (horizontal_padding != null) __obj.updateDynamic("horizontal_padding")(horizontal_padding.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (user_hash != null) __obj.updateDynamic("user_hash")(user_hash)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id)
    if (vertical_padding != null) __obj.updateDynamic("vertical_padding")(vertical_padding.asInstanceOf[js.Any])
    if (widget != null) __obj.updateDynamic("widget")(widget)
    __obj.asInstanceOf[IntercomSettings]
  }
}

