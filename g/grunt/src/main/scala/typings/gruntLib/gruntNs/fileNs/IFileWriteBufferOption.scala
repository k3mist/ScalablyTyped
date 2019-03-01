package typings
package gruntLib.gruntNs.fileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see IFileWriteOptions
  */
trait IFileWriteBufferOption extends IFileWriteOptions {
  /**
    * The source file contents and file path are passed into this function,
    * whose return value will be used as the destination file's contents. If
    * this function returns `false`, the file copy will be aborted.
    */
  var process: js.UndefOr[js.Function1[/* buffer */ nodeLib.Buffer, scala.Boolean]] = js.undefined
}

object IFileWriteBufferOption {
  @scala.inline
  def apply(noProcess: js.Any = null, process: js.Function1[/* buffer */ nodeLib.Buffer, scala.Boolean] = null): IFileWriteBufferOption = {
    val __obj = js.Dynamic.literal()
    if (noProcess != null) __obj.updateDynamic("noProcess")(noProcess)
    if (process != null) __obj.updateDynamic("process")(process)
    __obj.asInstanceOf[IFileWriteBufferOption]
  }
}

