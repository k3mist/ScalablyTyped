package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementEventMap extends js.Object {
  var fullscreenchange: Event
  var fullscreenerror: Event
}

object ElementEventMap {
  @scala.inline
  def apply(fullscreenchange: Event, fullscreenerror: Event): ElementEventMap = {
    val __obj = js.Dynamic.literal(fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror)
  
    __obj.asInstanceOf[ElementEventMap]
  }
}

