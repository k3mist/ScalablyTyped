package typings
package winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains progress information for a data retrieval operation. */
trait RetrievalProgress extends js.Object {
  /** The number of bytes that have been received in this data retrieval operation. */
  var bytesRetrieved: scala.Double
  /** The total number of bytes to be received during this data retrieval operation. */
  var totalBytesToRetrieve: scala.Double
}

object RetrievalProgress {
  @scala.inline
  def apply(bytesRetrieved: scala.Double, totalBytesToRetrieve: scala.Double): RetrievalProgress = {
    val __obj = js.Dynamic.literal(bytesRetrieved = bytesRetrieved, totalBytesToRetrieve = totalBytesToRetrieve)
  
    __obj.asInstanceOf[RetrievalProgress]
  }
}

