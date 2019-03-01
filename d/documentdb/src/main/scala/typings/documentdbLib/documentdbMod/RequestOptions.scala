package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /** Conditions Associated with the request. */
  var accessCondition: js.UndefOr[documentdbLib.Anon_Condition] = js.undefined
  /** Consistency level required by the client. */
  var consistencyLevel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allow execution across multiple partitions
    *
    * If the collection is partitioned, this must be set to True unless the query filters against a single partition key
    * or if the collection has only a single partition.
    */
  var enableCrossPartitionQuery: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies indexing directives (index, do not index ..etc). */
  var indexingDirective: js.UndefOr[java.lang.String] = js.undefined
  /** If true, parallelize cross-partition queries */
  var maxDegreeOfParallelism: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The user-specified throughput when creating document collections.
    *
    * Expressed in units of 100 request units per second. This can be between 400 and 250,000 (or higher by requesting a limit increase).
    *
    * If the x-ms-offer-throughput is over 10,000, then the collection must include a partitionKey definition.
    * If the x-ms-offer-throughput is equal to or under 10,000, then the collection must not include a partitionKey definition.
    *
    * One of x-ms-offer-throughput or x-ms-offer-type must be specified. Both headers cannot be specified together.
    */
  var offerThroughput: js.UndefOr[scala.Double] = js.undefined
  /** Offer type when creating document collections. */
  var offerType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The partition key value for the requested document or attachment operation.
    *
    * Required for operations against documents and attachments when the collection definition includes a partition key definition.
    */
  var partitionKey: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** If true, populate quota in response */
  var populateQuotaInfo: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates what is the post trigger to be invoked after the operation. */
  var postTriggerInclude: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates what is the pre trigger to be invoked before the operation. */
  var preTriggerInclude: js.UndefOr[java.lang.String] = js.undefined
  /** Expiry time (in seconds) for resource token associated with permission (applicable only for requests on permissions). */
  var resourceTokenExpirySeconds: js.UndefOr[scala.Double] = js.undefined
  /** Token for use with Session consistency. */
  var sessionToken: js.UndefOr[java.lang.String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    accessCondition: documentdbLib.Anon_Condition = null,
    consistencyLevel: java.lang.String = null,
    enableCrossPartitionQuery: js.UndefOr[scala.Boolean] = js.undefined,
    indexingDirective: java.lang.String = null,
    maxDegreeOfParallelism: js.UndefOr[scala.Boolean] = js.undefined,
    offerThroughput: scala.Int | scala.Double = null,
    offerType: java.lang.String = null,
    partitionKey: java.lang.String | js.Array[java.lang.String] = null,
    populateQuotaInfo: js.UndefOr[scala.Boolean] = js.undefined,
    postTriggerInclude: java.lang.String = null,
    preTriggerInclude: java.lang.String = null,
    resourceTokenExpirySeconds: scala.Int | scala.Double = null,
    sessionToken: java.lang.String = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (accessCondition != null) __obj.updateDynamic("accessCondition")(accessCondition)
    if (consistencyLevel != null) __obj.updateDynamic("consistencyLevel")(consistencyLevel)
    if (!js.isUndefined(enableCrossPartitionQuery)) __obj.updateDynamic("enableCrossPartitionQuery")(enableCrossPartitionQuery)
    if (indexingDirective != null) __obj.updateDynamic("indexingDirective")(indexingDirective)
    if (!js.isUndefined(maxDegreeOfParallelism)) __obj.updateDynamic("maxDegreeOfParallelism")(maxDegreeOfParallelism)
    if (offerThroughput != null) __obj.updateDynamic("offerThroughput")(offerThroughput.asInstanceOf[js.Any])
    if (offerType != null) __obj.updateDynamic("offerType")(offerType)
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey.asInstanceOf[js.Any])
    if (!js.isUndefined(populateQuotaInfo)) __obj.updateDynamic("populateQuotaInfo")(populateQuotaInfo)
    if (postTriggerInclude != null) __obj.updateDynamic("postTriggerInclude")(postTriggerInclude)
    if (preTriggerInclude != null) __obj.updateDynamic("preTriggerInclude")(preTriggerInclude)
    if (resourceTokenExpirySeconds != null) __obj.updateDynamic("resourceTokenExpirySeconds")(resourceTokenExpirySeconds.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    __obj.asInstanceOf[RequestOptions]
  }
}

