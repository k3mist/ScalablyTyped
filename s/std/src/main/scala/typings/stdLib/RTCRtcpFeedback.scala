package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtcpFeedback extends js.Object {
  var parameter: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object RTCRtcpFeedback {
  @scala.inline
  def apply(parameter: java.lang.String = null, `type`: java.lang.String = null): RTCRtcpFeedback = {
    val __obj = js.Dynamic.literal()
    if (parameter != null) __obj.updateDynamic("parameter")(parameter)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RTCRtcpFeedback]
  }
}

