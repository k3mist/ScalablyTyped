package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingStageLocation extends js.Object {
  /**
    * Identifies the particular stream within the streaming Dataflow
    * job.
    */
  var streamId: js.UndefOr[java.lang.String] = js.undefined
}

object StreamingStageLocation {
  @scala.inline
  def apply(streamId: java.lang.String = null): StreamingStageLocation = {
    val __obj = js.Dynamic.literal()
    if (streamId != null) __obj.updateDynamic("streamId")(streamId)
    __obj.asInstanceOf[StreamingStageLocation]
  }
}

