package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamEventMap extends js.Object {
  var active: Event
  var addtrack: MediaStreamTrackEvent
  var inactive: Event
  var removetrack: MediaStreamTrackEvent
}

object MediaStreamEventMap {
  @scala.inline
  def apply(
    active: Event,
    addtrack: MediaStreamTrackEvent,
    inactive: Event,
    removetrack: MediaStreamTrackEvent
  ): MediaStreamEventMap = {
    val __obj = js.Dynamic.literal(active = active, addtrack = addtrack, inactive = inactive, removetrack = removetrack)
  
    __obj.asInstanceOf[MediaStreamEventMap]
  }
}

