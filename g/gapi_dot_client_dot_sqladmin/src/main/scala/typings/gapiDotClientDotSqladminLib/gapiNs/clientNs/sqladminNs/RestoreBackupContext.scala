package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreBackupContext extends js.Object {
  /** The ID of the backup run to restore from. */
  var backupRunId: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the instance that the backup was taken from. */
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#restoreBackupContext. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object RestoreBackupContext {
  @scala.inline
  def apply(
    backupRunId: java.lang.String = null,
    instanceId: java.lang.String = null,
    kind: java.lang.String = null
  ): RestoreBackupContext = {
    val __obj = js.Dynamic.literal()
    if (backupRunId != null) __obj.updateDynamic("backupRunId")(backupRunId)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[RestoreBackupContext]
  }
}

