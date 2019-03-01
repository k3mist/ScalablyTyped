package typings
package analyticsDashNodeLib.analyticsDashNodeMod.AnalyticsNodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var batch: js.Array[Message]
  var sentAt: stdLib.Date
  var timestamp: stdLib.Date
}

object Data {
  @scala.inline
  def apply(batch: js.Array[Message], sentAt: stdLib.Date, timestamp: stdLib.Date): Data = {
    val __obj = js.Dynamic.literal(batch = batch, sentAt = sentAt, timestamp = timestamp)
  
    __obj.asInstanceOf[Data]
  }
}

