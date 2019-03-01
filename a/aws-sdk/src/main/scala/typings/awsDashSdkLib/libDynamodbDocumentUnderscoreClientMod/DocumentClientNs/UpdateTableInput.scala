package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTableInput extends js.Object {
  /**
    * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global secondary index to the table, AttributeDefinitions must include the key element(s) of the new index.
    */
  var AttributeDefinitions: js.UndefOr[AttributeDefinitions] = js.undefined
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. When switching from pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The initial provisioned capacity values are estimated based on the consumed read and write capacity of your table and global secondary indexes over the past 30 minutes.    PROVISIONED - Sets the billing mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the billing mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
    */
  var BillingMode: js.UndefOr[BillingMode] = js.undefined
  /**
    * An array of one or more global secondary indexes for the table. For each index in the array, you can request one action:    Create - add a new global secondary index to the table.    Update - modify the provisioned throughput settings of an existing global secondary index.    Delete - remove a global secondary index from the table.   For more information, see Managing Global Secondary Indexes in the Amazon DynamoDB Developer Guide. 
    */
  var GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexUpdateList] = js.undefined
  /**
    * The new provisioned throughput settings for the specified table or index.
    */
  var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined
  /**
    * The new server-side encryption settings for the specified table.
    */
  var SSESpecification: js.UndefOr[SSESpecification] = js.undefined
  /**
    * Represents the DynamoDB Streams configuration for the table.  You will receive a ResourceInUseException if you attempt to enable a stream on a table that already has a stream, or if you attempt to disable a stream on a table which does not have a stream. 
    */
  var StreamSpecification: js.UndefOr[StreamSpecification] = js.undefined
  /**
    * The name of the table to be updated.
    */
  var TableName: TableName
}

object UpdateTableInput {
  @scala.inline
  def apply(
    TableName: TableName,
    AttributeDefinitions: AttributeDefinitions = null,
    BillingMode: BillingMode = null,
    GlobalSecondaryIndexUpdates: GlobalSecondaryIndexUpdateList = null,
    ProvisionedThroughput: ProvisionedThroughput = null,
    SSESpecification: SSESpecification = null,
    StreamSpecification: StreamSpecification = null
  ): UpdateTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName)
    if (AttributeDefinitions != null) __obj.updateDynamic("AttributeDefinitions")(AttributeDefinitions)
    if (BillingMode != null) __obj.updateDynamic("BillingMode")(BillingMode.asInstanceOf[js.Any])
    if (GlobalSecondaryIndexUpdates != null) __obj.updateDynamic("GlobalSecondaryIndexUpdates")(GlobalSecondaryIndexUpdates)
    if (ProvisionedThroughput != null) __obj.updateDynamic("ProvisionedThroughput")(ProvisionedThroughput)
    if (SSESpecification != null) __obj.updateDynamic("SSESpecification")(SSESpecification)
    if (StreamSpecification != null) __obj.updateDynamic("StreamSpecification")(StreamSpecification)
    __obj.asInstanceOf[UpdateTableInput]
  }
}

