package typings
package officeDashJsLib.OfficeNs.AddinCommandsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates source data for add-in events.
  */
trait Source extends js.Object {
  /**
    * The id of the control that triggered calling this function. The id comes from the manifest and is the unique ID of your Office Add-in 
    * as a GUID.
    */
  var id: java.lang.String
}

object Source {
  @scala.inline
  def apply(id: java.lang.String): Source = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[Source]
  }
}

