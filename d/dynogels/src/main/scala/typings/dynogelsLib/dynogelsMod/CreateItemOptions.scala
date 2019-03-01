package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateItemOptions extends js.Object {
  var ConditionExpression: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ConditionExpression] = js.undefined
  var ConditionalOperator: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ConditionalOperator] = js.undefined
  var Expected: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ExpectedAttributeMap] = js.undefined
  var ExpressionAttributeNames: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ExpressionAttributeNameMap] = js.undefined
  var ExpressionAttributeValues: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ReturnConsumedCapacity] = js.undefined
  var ReturnItemCollectionMetrics: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ReturnItemCollectionMetrics] = js.undefined
  var ReturnValues: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ReturnValue] = js.undefined
  var expected: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateItemOptions {
  @scala.inline
  def apply(
    ConditionExpression: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ConditionExpression = null,
    ConditionalOperator: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ConditionalOperator = null,
    Expected: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ExpectedAttributeMap = null,
    ExpressionAttributeNames: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ExpressionAttributeNameMap = null,
    ExpressionAttributeValues: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    ReturnConsumedCapacity: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ReturnConsumedCapacity = null,
    ReturnItemCollectionMetrics: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ReturnItemCollectionMetrics = null,
    ReturnValues: awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ReturnValue = null,
    expected: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateItemOptions = {
    val __obj = js.Dynamic.literal()
    if (ConditionExpression != null) __obj.updateDynamic("ConditionExpression")(ConditionExpression)
    if (ConditionalOperator != null) __obj.updateDynamic("ConditionalOperator")(ConditionalOperator.asInstanceOf[js.Any])
    if (Expected != null) __obj.updateDynamic("Expected")(Expected)
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames)
    if (ExpressionAttributeValues != null) __obj.updateDynamic("ExpressionAttributeValues")(ExpressionAttributeValues)
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity.asInstanceOf[js.Any])
    if (ReturnItemCollectionMetrics != null) __obj.updateDynamic("ReturnItemCollectionMetrics")(ReturnItemCollectionMetrics.asInstanceOf[js.Any])
    if (ReturnValues != null) __obj.updateDynamic("ReturnValues")(ReturnValues.asInstanceOf[js.Any])
    if (expected != null) __obj.updateDynamic("expected")(expected)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    __obj.asInstanceOf[CreateItemOptions]
  }
}

