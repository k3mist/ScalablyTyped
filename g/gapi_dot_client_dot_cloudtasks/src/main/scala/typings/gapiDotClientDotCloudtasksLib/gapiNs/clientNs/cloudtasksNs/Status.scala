package typings
package gapiDotClientDotCloudtasksLib.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  /** The status code, which should be an enum value of google.rpc.Code. */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
    * A list of messages that carry the error details.  There is a common set of
    * message types for APIs to use.
    */
  var details: js.UndefOr[js.Array[stdLib.Record[java.lang.String, _]]] = js.undefined
  /**
    * A developer-facing error message, which should be in English. Any
    * user-facing error message should be localized and sent in the
    * google.rpc.Status.details field, or localized by the client.
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object Status {
  @scala.inline
  def apply(
    code: scala.Int | scala.Double = null,
    details: js.Array[stdLib.Record[java.lang.String, _]] = null,
    message: java.lang.String = null
  ): Status = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Status]
  }
}

