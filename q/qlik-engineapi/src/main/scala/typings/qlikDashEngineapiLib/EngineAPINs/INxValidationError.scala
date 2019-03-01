package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxValidationError...
  */
trait INxValidationError extends js.Object {
  /**
    * Context related to the error, from the user app domain.
    * It can be the identifier of an object, a field name, a table name.
    * This parameter is optional.
    * String
    */
  var qContext: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Error code.
    * This parameter is always displayed in case of error.
    * Integer
    */
  var qErrorCode: scala.Double
  /**
    * Internal information from the server.
    * This parameter is optional.
    * String
    */
  var qExtendedMessage: js.UndefOr[java.lang.String] = js.undefined
}

object INxValidationError {
  @scala.inline
  def apply(
    qErrorCode: scala.Double,
    qContext: java.lang.String = null,
    qExtendedMessage: java.lang.String = null
  ): INxValidationError = {
    val __obj = js.Dynamic.literal(qErrorCode = qErrorCode)
    if (qContext != null) __obj.updateDynamic("qContext")(qContext)
    if (qExtendedMessage != null) __obj.updateDynamic("qExtendedMessage")(qExtendedMessage)
    __obj.asInstanceOf[INxValidationError]
  }
}

