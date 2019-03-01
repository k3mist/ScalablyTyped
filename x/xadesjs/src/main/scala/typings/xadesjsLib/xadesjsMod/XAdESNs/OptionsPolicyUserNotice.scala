package typings
package xadesjsLib.xadesjsMod.XAdESNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsPolicyUserNotice extends js.Object {
  var explicitText: js.UndefOr[java.lang.String] = js.undefined
  var noticeRef: js.UndefOr[OptionsNoticeReference] = js.undefined
}

object OptionsPolicyUserNotice {
  @scala.inline
  def apply(explicitText: java.lang.String = null, noticeRef: OptionsNoticeReference = null): OptionsPolicyUserNotice = {
    val __obj = js.Dynamic.literal()
    if (explicitText != null) __obj.updateDynamic("explicitText")(explicitText)
    if (noticeRef != null) __obj.updateDynamic("noticeRef")(noticeRef)
    __obj.asInstanceOf[OptionsPolicyUserNotice]
  }
}

