package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterError extends js.Object {
  // constructor(summary: string, detail: string);
  def getMessage(): atOracleOraclejetLib.ojmessagingMod.namespaced
}

object ConverterError {
  @scala.inline
  def apply(getMessage: js.Function0[atOracleOraclejetLib.ojmessagingMod.namespaced]): ConverterError = {
    val __obj = js.Dynamic.literal(getMessage = getMessage)
  
    __obj.asInstanceOf[ConverterError]
  }
}

