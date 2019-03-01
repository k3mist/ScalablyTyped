package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface specifies base functionality for all SMS message types. */
trait ISmsMessageBase extends js.Object {
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass
  /** Gets the unique device identifier associated with this message. */
  var deviceId: java.lang.String
  /** Gets the message class of this message. */
  var messageClass: SmsMessageClass
  /** Gets the message type of this message. */
  var messageType: SmsMessageType
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: java.lang.String
}

object ISmsMessageBase {
  @scala.inline
  def apply(
    cellularClass: CellularClass,
    deviceId: java.lang.String,
    messageClass: SmsMessageClass,
    messageType: SmsMessageType,
    simIccId: java.lang.String
  ): ISmsMessageBase = {
    val __obj = js.Dynamic.literal(cellularClass = cellularClass, deviceId = deviceId, messageClass = messageClass, messageType = messageType, simIccId = simIccId)
  
    __obj.asInstanceOf[ISmsMessageBase]
  }
}

