package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferProgress extends js.Object {
  var bytesRetrieved: scala.Double
  var bytesSent: scala.Double
  var totalBytesToRetrieve: scala.Double
  var totalBytesToSend: scala.Double
}

object TransferProgress {
  @scala.inline
  def apply(
    bytesRetrieved: scala.Double,
    bytesSent: scala.Double,
    totalBytesToRetrieve: scala.Double,
    totalBytesToSend: scala.Double
  ): TransferProgress = {
    val __obj = js.Dynamic.literal(bytesRetrieved = bytesRetrieved, bytesSent = bytesSent, totalBytesToRetrieve = totalBytesToRetrieve, totalBytesToSend = totalBytesToSend)
  
    __obj.asInstanceOf[TransferProgress]
  }
}

