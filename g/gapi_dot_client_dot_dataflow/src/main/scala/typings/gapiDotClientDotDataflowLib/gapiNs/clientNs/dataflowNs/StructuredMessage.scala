package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructuredMessage extends js.Object {
  /**
    * Idenfier for this message type.  Used by external systems to
    * internationalize or personalize message.
    */
  var messageKey: js.UndefOr[java.lang.String] = js.undefined
  /** Human-readable version of message. */
  var messageText: js.UndefOr[java.lang.String] = js.undefined
  /** The structured data associated with this message. */
  var parameters: js.UndefOr[js.Array[Parameter]] = js.undefined
}

object StructuredMessage {
  @scala.inline
  def apply(
    messageKey: java.lang.String = null,
    messageText: java.lang.String = null,
    parameters: js.Array[Parameter] = null
  ): StructuredMessage = {
    val __obj = js.Dynamic.literal()
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey)
    if (messageText != null) __obj.updateDynamic("messageText")(messageText)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[StructuredMessage]
  }
}

