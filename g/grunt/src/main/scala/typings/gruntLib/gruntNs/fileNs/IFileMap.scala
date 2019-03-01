package typings
package gruntLib.gruntNs.fileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link http://gruntjs.com/configuring-tasks#files-array-format}
  */
trait IFileMap extends js.Object {
  /**
    * destination filename.
    */
  var dest: java.lang.String
  /**
    * source filenames.
    */
  var src: js.Array[java.lang.String]
}

object IFileMap {
  @scala.inline
  def apply(dest: java.lang.String, src: js.Array[java.lang.String]): IFileMap = {
    val __obj = js.Dynamic.literal(dest = dest, src = src)
  
    __obj.asInstanceOf[IFileMap]
  }
}

