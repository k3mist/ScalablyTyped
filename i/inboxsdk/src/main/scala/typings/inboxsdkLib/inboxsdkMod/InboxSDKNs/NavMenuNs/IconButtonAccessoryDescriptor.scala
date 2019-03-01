package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.NavMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconButtonAccessoryDescriptor extends js.Object {
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: java.lang.String
  var `type`: inboxsdkLib.inboxsdkLibStrings.ICON_BUTTON
  def onClick(): scala.Unit
}

object IconButtonAccessoryDescriptor {
  @scala.inline
  def apply(
    iconUrl: java.lang.String,
    onClick: js.Function0[scala.Unit],
    `type`: inboxsdkLib.inboxsdkLibStrings.ICON_BUTTON,
    iconClass: java.lang.String = null
  ): IconButtonAccessoryDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl, onClick = onClick, `type` = `type`)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    __obj.asInstanceOf[IconButtonAccessoryDescriptor]
  }
}

