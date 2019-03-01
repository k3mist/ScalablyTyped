package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This permission represents access to a file or directory. A {@link FilePermission} consists of a file url and a set of actions valid for that url.
  *
  * The path of the file url that ends in `"/ *"` indicates all the files and directories contained in that directory. A path that ends with `"/-"`
  * indicates (recursively) all files and subdirectories contained in that directory. A file url string consisting of the special token `"<<ALL FILES>>"`
  * matches any file. ;  Note: A file url string consisting of a single `"*"` indicates all the files in the current directory, while a string consisting
  * of a single `"-"` indicates all the files in the current directory and (recursively) all files and subdirectories contained in the current directory.
  * ;  The actions to be granted is a list of one or more comma-separated keywords. The possible keywords are `"read"` , `"write"` , `"execute"` , and
  * `"delete"` . Their meaning is defined as follows: `read` -  read permission`write` -  write permission`execute` -  execute permission`delete` -
  * delete permission;  The actions string is processed case-insensitive.
  * @since OOo 1.1.2
  */
trait FilePermission extends js.Object {
  /** comma separated actions list */
  var Actions: java.lang.String
  /** target file url */
  var URL: java.lang.String
}

object FilePermission {
  @scala.inline
  def apply(Actions: java.lang.String, URL: java.lang.String): FilePermission = {
    val __obj = js.Dynamic.literal(Actions = Actions, URL = URL)
  
    __obj.asInstanceOf[FilePermission]
  }
}

