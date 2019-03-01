package typings
package ckeditorLib.CKEDITORNs.pluginsNs.notificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait optionsBase extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var progress: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[`type`] = js.undefined
}

object optionsBase {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    progress: scala.Int | scala.Double = null,
    `type`: `type` = null
  ): optionsBase = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[optionsBase]
  }
}

