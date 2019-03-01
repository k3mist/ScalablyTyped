package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalSecondaryIndexDescription extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the index.
    */
  var IndexArn: js.UndefOr[String] = js.undefined
  /**
    * Represents the name of the local secondary index.
    */
  var IndexName: js.UndefOr[IndexName] = js.undefined
  /**
    * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var IndexSizeBytes: js.UndefOr[Long] = js.undefined
  /**
    * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var ItemCount: js.UndefOr[Long] = js.undefined
  /**
    * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
    */
  var KeySchema: js.UndefOr[KeySchema] = js.undefined
  /**
    * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
    */
  var Projection: js.UndefOr[Projection] = js.undefined
}

object LocalSecondaryIndexDescription {
  @scala.inline
  def apply(
    IndexArn: String = null,
    IndexName: IndexName = null,
    IndexSizeBytes: js.UndefOr[Long] = js.undefined,
    ItemCount: js.UndefOr[Long] = js.undefined,
    KeySchema: KeySchema = null,
    Projection: Projection = null
  ): LocalSecondaryIndexDescription = {
    val __obj = js.Dynamic.literal()
    if (IndexArn != null) __obj.updateDynamic("IndexArn")(IndexArn)
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName)
    if (!js.isUndefined(IndexSizeBytes)) __obj.updateDynamic("IndexSizeBytes")(IndexSizeBytes)
    if (!js.isUndefined(ItemCount)) __obj.updateDynamic("ItemCount")(ItemCount)
    if (KeySchema != null) __obj.updateDynamic("KeySchema")(KeySchema)
    if (Projection != null) __obj.updateDynamic("Projection")(Projection)
    __obj.asInstanceOf[LocalSecondaryIndexDescription]
  }
}

