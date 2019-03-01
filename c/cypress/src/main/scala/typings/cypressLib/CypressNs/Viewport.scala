package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var viewportHeight: scala.Double
  var viewportWidth: scala.Double
}

object Viewport {
  @scala.inline
  def apply(viewportHeight: scala.Double, viewportWidth: scala.Double): Viewport = {
    val __obj = js.Dynamic.literal(viewportHeight = viewportHeight, viewportWidth = viewportWidth)
  
    __obj.asInstanceOf[Viewport]
  }
}

