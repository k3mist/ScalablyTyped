package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectIntentResponse extends js.Object {
  var queryResult: QueryResult
  var responseId: java.lang.String
  var webhookStatus: Status
}

object DetectIntentResponse {
  @scala.inline
  def apply(queryResult: QueryResult, responseId: java.lang.String, webhookStatus: Status): DetectIntentResponse = {
    val __obj = js.Dynamic.literal(queryResult = queryResult, responseId = responseId, webhookStatus = webhookStatus)
  
    __obj.asInstanceOf[DetectIntentResponse]
  }
}

