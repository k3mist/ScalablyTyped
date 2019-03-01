package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseRecordMetadata extends js.Object {
  var approximateArrivalTimestamp: java.lang.String
  var partitionKey: java.lang.String
  var sequenceNumber: java.lang.String
  var shardId: java.lang.String
  var subsequenceNumber: java.lang.String
}

object FirehoseRecordMetadata {
  @scala.inline
  def apply(
    approximateArrivalTimestamp: java.lang.String,
    partitionKey: java.lang.String,
    sequenceNumber: java.lang.String,
    shardId: java.lang.String,
    subsequenceNumber: java.lang.String
  ): FirehoseRecordMetadata = {
    val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp, partitionKey = partitionKey, sequenceNumber = sequenceNumber, shardId = shardId, subsequenceNumber = subsequenceNumber)
  
    __obj.asInstanceOf[FirehoseRecordMetadata]
  }
}

