package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ocrBankCardResponse extends js.Object {
  var log_id: java.lang.String
   // 请求标识码，随机数，唯一。
  var result: baiduDashAppLib.Anon_Bankcardnumber
}

object ocrBankCardResponse {
  @scala.inline
  def apply(log_id: java.lang.String, result: baiduDashAppLib.Anon_Bankcardnumber): ocrBankCardResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id, result = result)
  
    __obj.asInstanceOf[ocrBankCardResponse]
  }
}

