package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuShareWeibo extends ShareTimelineConfig {
  /**
    * 分享描述
    */
  var desc: java.lang.String
}

object MenuShareWeibo {
  @scala.inline
  def apply(
    desc: java.lang.String,
    link: java.lang.String,
    title: java.lang.String,
    cancel: js.Function0[scala.Unit] = null,
    complete: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    imgUrl: java.lang.String = null,
    success: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    trigger: js.Function0[scala.Unit] = null
  ): MenuShareWeibo = {
    val __obj = js.Dynamic.literal(desc = desc, link = link, title = title)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl)
    if (success != null) __obj.updateDynamic("success")(success)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[MenuShareWeibo]
  }
}

