package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowActionButtonDescriptor extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  var title: java.lang.String
  var `type`: inboxsdkLib.inboxsdkLibStrings.LINK
  var url: java.lang.String
}

object ThreadRowActionButtonDescriptor {
  @scala.inline
  def apply(
    title: java.lang.String,
    `type`: inboxsdkLib.inboxsdkLibStrings.LINK,
    url: java.lang.String,
    className: java.lang.String = null,
    onClick: js.Function1[/* event */ js.Any, scala.Unit] = null
  ): ThreadRowActionButtonDescriptor = {
    val __obj = js.Dynamic.literal(title = title, `type` = `type`, url = url)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[ThreadRowActionButtonDescriptor]
  }
}

