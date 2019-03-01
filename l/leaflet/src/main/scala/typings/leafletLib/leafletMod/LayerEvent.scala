package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerEvent extends LeafletEvent {
  var layer: Layer
}

object LayerEvent {
  @scala.inline
  def apply(layer: Layer, target: js.Any, `type`: java.lang.String): LayerEvent = {
    val __obj = js.Dynamic.literal(layer = layer, target = target, `type` = `type`)
  
    __obj.asInstanceOf[LayerEvent]
  }
}

