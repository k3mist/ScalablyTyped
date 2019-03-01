package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedDriveFile extends js.Object {
  /** Drive file details. */
  var driveFile: js.UndefOr[DriveFile] = js.undefined
  /** Mechanism by which students access the Drive item. */
  var shareMode: js.UndefOr[java.lang.String] = js.undefined
}

object SharedDriveFile {
  @scala.inline
  def apply(driveFile: DriveFile = null, shareMode: java.lang.String = null): SharedDriveFile = {
    val __obj = js.Dynamic.literal()
    if (driveFile != null) __obj.updateDynamic("driveFile")(driveFile)
    if (shareMode != null) __obj.updateDynamic("shareMode")(shareMode)
    __obj.asInstanceOf[SharedDriveFile]
  }
}

