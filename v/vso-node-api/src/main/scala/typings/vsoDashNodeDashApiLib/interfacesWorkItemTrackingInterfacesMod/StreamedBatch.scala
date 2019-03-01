package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamedBatch[T] extends js.Object {
  var continuationToken: java.lang.String
  var isLastBatch: scala.Boolean
  var nextLink: java.lang.String
  var values: js.Array[T]
}

object StreamedBatch {
  @scala.inline
  def apply[T](
    continuationToken: java.lang.String,
    isLastBatch: scala.Boolean,
    nextLink: java.lang.String,
    values: js.Array[T]
  ): StreamedBatch[T] = {
    val __obj = js.Dynamic.literal(continuationToken = continuationToken, isLastBatch = isLastBatch, nextLink = nextLink, values = values)
  
    __obj.asInstanceOf[StreamedBatch[T]]
  }
}

