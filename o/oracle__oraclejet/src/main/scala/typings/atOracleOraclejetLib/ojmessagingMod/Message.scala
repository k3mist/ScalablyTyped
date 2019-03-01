package typings
package atOracleOraclejetLib.ojmessagingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var detail: java.lang.String
  var severity: atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_TYPE | atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_LEVEL
  var summary: java.lang.String
}

object Message {
  @scala.inline
  def apply(
    detail: java.lang.String,
    severity: atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_TYPE | atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_LEVEL,
    summary: java.lang.String
  ): Message = {
    val __obj = js.Dynamic.literal(detail = detail, severity = severity.asInstanceOf[js.Any], summary = summary)
  
    __obj.asInstanceOf[Message]
  }
}

