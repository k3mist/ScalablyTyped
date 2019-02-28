package typings
package atPulumiAwsLib.dynamodbTableItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableItemState extends js.Object {
  /**
    * Hash key to use for lookups and identification of the item
    */
  val hashKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * JSON representation of a map of attribute name/value pairs, one for each attribute.
    * Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
    */
  val item: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
    */
  val rangeKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the table to contain the item.
    */
  val tableName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

