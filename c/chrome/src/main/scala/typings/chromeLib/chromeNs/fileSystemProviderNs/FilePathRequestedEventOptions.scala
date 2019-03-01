package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePathRequestedEventOptions extends RequestedEventOptions {
  /** The path of the entry for the operation */
  var filePath: java.lang.String
}

object FilePathRequestedEventOptions {
  @scala.inline
  def apply(filePath: java.lang.String, fileSystemId: java.lang.String, requestId: scala.Double): FilePathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath, fileSystemId = fileSystemId, requestId = requestId)
  
    __obj.asInstanceOf[FilePathRequestedEventOptions]
  }
}

