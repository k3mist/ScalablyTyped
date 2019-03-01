package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisStreamRecordPayload extends js.Object {
  var approximateArrivalTimestamp: scala.Double
  var data: java.lang.String
  var kinesisSchemaVersion: java.lang.String
  var partitionKey: java.lang.String
  var sequenceNumber: java.lang.String
}

object KinesisStreamRecordPayload {
  @scala.inline
  def apply(
    approximateArrivalTimestamp: scala.Double,
    data: java.lang.String,
    kinesisSchemaVersion: java.lang.String,
    partitionKey: java.lang.String,
    sequenceNumber: java.lang.String
  ): KinesisStreamRecordPayload = {
    val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp, data = data, kinesisSchemaVersion = kinesisSchemaVersion, partitionKey = partitionKey, sequenceNumber = sequenceNumber)
  
    __obj.asInstanceOf[KinesisStreamRecordPayload]
  }
}

