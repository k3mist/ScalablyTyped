package typings
package eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonStandardEvent
  extends _EventData[js.Any, js.Any, js.Any]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var `type`: java.lang.String
}

object NonStandardEvent {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): NonStandardEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NonStandardEvent]
  }
}

