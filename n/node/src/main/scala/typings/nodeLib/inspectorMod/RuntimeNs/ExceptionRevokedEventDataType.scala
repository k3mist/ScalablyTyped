package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionRevokedEventDataType extends js.Object {
  /**
    * The id of revoked exception, as reported in `exceptionThrown`.
    */
  var exceptionId: scala.Double
  /**
    * Reason describing why exception was revoked.
    */
  var reason: java.lang.String
}

object ExceptionRevokedEventDataType {
  @scala.inline
  def apply(exceptionId: scala.Double, reason: java.lang.String): ExceptionRevokedEventDataType = {
    val __obj = js.Dynamic.literal(exceptionId = exceptionId, reason = reason)
  
    __obj.asInstanceOf[ExceptionRevokedEventDataType]
  }
}

