package typings
package atPulumiAwsLib.dynamodbTableItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableItemArgs extends js.Object {
  /**
    * Hash key to use for lookups and identification of the item
    */
  val hashKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * JSON representation of a map of attribute name/value pairs, one for each attribute.
    * Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
    */
  val item: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
    */
  val rangeKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the table to contain the item.
    */
  val tableName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object TableItemArgs {
  @scala.inline
  def apply(
    hashKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    item: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    tableName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    rangeKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): TableItemArgs = {
    val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableItemArgs]
  }
}

