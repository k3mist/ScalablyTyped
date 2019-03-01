package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Envelope3DBounds extends EnvelopeBounds {
  var maxZ: scala.Double
  var minZ: scala.Double
}

object Envelope3DBounds {
  @scala.inline
  def apply(
    maxX: scala.Double,
    maxY: scala.Double,
    maxZ: scala.Double,
    minX: scala.Double,
    minY: scala.Double,
    minZ: scala.Double
  ): Envelope3DBounds = {
    val __obj = js.Dynamic.literal(maxX = maxX, maxY = maxY, maxZ = maxZ, minX = minX, minY = minY, minZ = minZ)
  
    __obj.asInstanceOf[Envelope3DBounds]
  }
}

