package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vector extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object Vector {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Vector = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Vector]
  }
}

