package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventBacklogStatus extends js.Object {
  var maxUnprocessedEventAgeMs: scala.Double
  var publisher: java.lang.String
  var timeSinceLastProcessedEventMs: scala.Double
  var unprocessedEvents: scala.Double
}

object EventBacklogStatus {
  @scala.inline
  def apply(
    maxUnprocessedEventAgeMs: scala.Double,
    publisher: java.lang.String,
    timeSinceLastProcessedEventMs: scala.Double,
    unprocessedEvents: scala.Double
  ): EventBacklogStatus = {
    val __obj = js.Dynamic.literal(maxUnprocessedEventAgeMs = maxUnprocessedEventAgeMs, publisher = publisher, timeSinceLastProcessedEventMs = timeSinceLastProcessedEventMs, unprocessedEvents = unprocessedEvents)
  
    __obj.asInstanceOf[EventBacklogStatus]
  }
}

