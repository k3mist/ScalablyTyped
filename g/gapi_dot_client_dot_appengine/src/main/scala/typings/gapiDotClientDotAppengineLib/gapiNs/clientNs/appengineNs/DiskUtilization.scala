package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskUtilization extends js.Object {
  /** Target bytes read per second. */
  var targetReadBytesPerSecond: js.UndefOr[scala.Double] = js.undefined
  /** Target ops read per seconds. */
  var targetReadOpsPerSecond: js.UndefOr[scala.Double] = js.undefined
  /** Target bytes written per second. */
  var targetWriteBytesPerSecond: js.UndefOr[scala.Double] = js.undefined
  /** Target ops written per second. */
  var targetWriteOpsPerSecond: js.UndefOr[scala.Double] = js.undefined
}

object DiskUtilization {
  @scala.inline
  def apply(
    targetReadBytesPerSecond: scala.Int | scala.Double = null,
    targetReadOpsPerSecond: scala.Int | scala.Double = null,
    targetWriteBytesPerSecond: scala.Int | scala.Double = null,
    targetWriteOpsPerSecond: scala.Int | scala.Double = null
  ): DiskUtilization = {
    val __obj = js.Dynamic.literal()
    if (targetReadBytesPerSecond != null) __obj.updateDynamic("targetReadBytesPerSecond")(targetReadBytesPerSecond.asInstanceOf[js.Any])
    if (targetReadOpsPerSecond != null) __obj.updateDynamic("targetReadOpsPerSecond")(targetReadOpsPerSecond.asInstanceOf[js.Any])
    if (targetWriteBytesPerSecond != null) __obj.updateDynamic("targetWriteBytesPerSecond")(targetWriteBytesPerSecond.asInstanceOf[js.Any])
    if (targetWriteOpsPerSecond != null) __obj.updateDynamic("targetWriteOpsPerSecond")(targetWriteOpsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskUtilization]
  }
}

