package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingComputationRanges extends js.Object {
  /** The ID of the computation. */
  var computationId: js.UndefOr[java.lang.String] = js.undefined
  /** Data disk assignments for ranges from this computation. */
  var rangeAssignments: js.UndefOr[js.Array[KeyRangeDataDiskAssignment]] = js.undefined
}

object StreamingComputationRanges {
  @scala.inline
  def apply(
    computationId: java.lang.String = null,
    rangeAssignments: js.Array[KeyRangeDataDiskAssignment] = null
  ): StreamingComputationRanges = {
    val __obj = js.Dynamic.literal()
    if (computationId != null) __obj.updateDynamic("computationId")(computationId)
    if (rangeAssignments != null) __obj.updateDynamic("rangeAssignments")(rangeAssignments)
    __obj.asInstanceOf[StreamingComputationRanges]
  }
}

