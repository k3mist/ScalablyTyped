package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayPalError extends js.Object {
  val debug_id: java.lang.String
  val details: js.Array[ErrorDetails]
  val information_link: java.lang.String
  val message: java.lang.String
  val name: java.lang.String
}

object PayPalError {
  @scala.inline
  def apply(
    debug_id: java.lang.String,
    details: js.Array[ErrorDetails],
    information_link: java.lang.String,
    message: java.lang.String,
    name: java.lang.String
  ): PayPalError = {
    val __obj = js.Dynamic.literal(debug_id = debug_id, details = details, information_link = information_link, message = message, name = name)
  
    __obj.asInstanceOf[PayPalError]
  }
}

