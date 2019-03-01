package typings
package chromeLib.chromeNs.notificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemOptions extends js.Object {
  /** Additional details about this item. */
  var message: java.lang.String
  /** Title of one item of a list notification. */
  var title: java.lang.String
}

object ItemOptions {
  @scala.inline
  def apply(message: java.lang.String, title: java.lang.String): ItemOptions = {
    val __obj = js.Dynamic.literal(message = message, title = title)
  
    __obj.asInstanceOf[ItemOptions]
  }
}

