package typings
package nodeDashGcmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.UndefOr[java.lang.String] = js.undefined
  var message_id: js.UndefOr[java.lang.String] = js.undefined
  var registration_id: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(
    error: java.lang.String = null,
    message_id: java.lang.String = null,
    registration_id: java.lang.String = null
  ): Anon_Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (message_id != null) __obj.updateDynamic("message_id")(message_id)
    if (registration_id != null) __obj.updateDynamic("registration_id")(registration_id)
    __obj.asInstanceOf[Anon_Error]
  }
}

