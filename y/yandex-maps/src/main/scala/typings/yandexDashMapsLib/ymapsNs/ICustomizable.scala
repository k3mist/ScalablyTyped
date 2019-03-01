package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomizable extends IEventEmitter {
  var options: IOptionManager
}

object ICustomizable {
  @scala.inline
  def apply(events: IEventManager, options: IOptionManager): ICustomizable = {
    val __obj = js.Dynamic.literal(events = events, options = options)
  
    __obj.asInstanceOf[ICustomizable]
  }
}

