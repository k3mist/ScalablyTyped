package typings
package antdLib.libMenuSubMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleEventEntity extends js.Object {
  var domEvent: reactLib.Event
  var key: java.lang.String
}

object TitleEventEntity {
  @scala.inline
  def apply(domEvent: reactLib.Event, key: java.lang.String): TitleEventEntity = {
    val __obj = js.Dynamic.literal(domEvent = domEvent, key = key)
  
    __obj.asInstanceOf[TitleEventEntity]
  }
}

