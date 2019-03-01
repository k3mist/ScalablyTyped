package typings
package filewriterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface lets users write, truncate, and append to files using simple synchronous calls.
  * This interface is specified to be used only within Web Workers (WorkerUtils [WEBWORKERS]).
  */
trait FileWriterSync extends js.Object {
  /**
    * The length of the file. If the user does not have read access to the file, this must be the highest byte offset at which the user has written.
    */
  var length: scala.Double
  /**
    * The byte offset at which the next write to the file will occur. This must be no greater than length.
    */
  var position: scala.Double
  /**
    * Seek sets the file position at which the next write will occur.
    * @param offset An absolute byte offset into the file. If offset is greater than length, length is used instead. If offset is less than zero, length is added to it, so that it is treated as an offset back from the end of the file. If it is still less than zero, zero is used.
    */
  def seek(offset: scala.Double): scala.Unit
  /**
    * Changes the length of the file to that specified. If shortening the file, data beyond the new length must be discarded. If extending the file, the existing data must be zero-padded up to the new length.
    * Upon successful completion:
    * <ul>
    *     <li>length must be equal to size.</li>
    *     <li>position must be the lesser of
    *          <ul>
    *              <li>its pre-truncate value,</li>
    *              <li>size.</li>
    *          </ul>
    *      </li>
    *  </ul>
    * @param size The size to which the length of the file is to be adjusted, measured in bytes.
    */
  def truncate(size: scala.Double): scala.Unit
  /**
    * Write the supplied data to the file at position. Upon completion, position will increase by data.size.
    * @param data The blob to write.
    */
  def write(data: stdLib.Blob): scala.Unit
}

object FileWriterSync {
  @scala.inline
  def apply(
    length: scala.Double,
    position: scala.Double,
    seek: js.Function1[scala.Double, scala.Unit],
    truncate: js.Function1[scala.Double, scala.Unit],
    write: js.Function1[stdLib.Blob, scala.Unit]
  ): FileWriterSync = {
    val __obj = js.Dynamic.literal(length = length, position = position, seek = seek, truncate = truncate, write = write)
  
    __obj.asInstanceOf[FileWriterSync]
  }
}

