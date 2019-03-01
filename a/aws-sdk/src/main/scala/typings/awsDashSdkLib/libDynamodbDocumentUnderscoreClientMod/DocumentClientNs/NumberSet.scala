package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberSet
  extends awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DocumentClientNs.DynamoDbSet
     with DynamoDbSet {
  var `type`: awsDashSdkLib.awsDashSdkLibStrings.Number
  var values: js.Array[scala.Double]
}

object NumberSet {
  @scala.inline
  def apply(`type`: awsDashSdkLib.awsDashSdkLibStrings.Number, values: js.Array[scala.Double]): NumberSet = {
    val __obj = js.Dynamic.literal(`type` = `type`, values = values)
  
    __obj.asInstanceOf[NumberSet]
  }
}

