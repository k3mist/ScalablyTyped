package typings
package nodeLib.inspectorMod.ConsoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageAddedEventDataType extends js.Object {
  /**
    * Console message that has been added.
    */
  var message: ConsoleMessage
}

object MessageAddedEventDataType {
  @scala.inline
  def apply(message: ConsoleMessage): MessageAddedEventDataType = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[MessageAddedEventDataType]
  }
}

