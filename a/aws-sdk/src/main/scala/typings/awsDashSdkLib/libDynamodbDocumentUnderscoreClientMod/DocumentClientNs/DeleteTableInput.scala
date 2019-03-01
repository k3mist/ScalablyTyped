package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTableInput extends js.Object {
  /**
    * The name of the table to delete.
    */
  var TableName: TableName
}

object DeleteTableInput {
  @scala.inline
  def apply(TableName: TableName): DeleteTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName)
  
    __obj.asInstanceOf[DeleteTableInput]
  }
}

