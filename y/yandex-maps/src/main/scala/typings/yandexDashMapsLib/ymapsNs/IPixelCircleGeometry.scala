package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPixelCircleGeometry extends IPixelGeometry {
  def getCoordinates(): js.Array[scala.Double]
  def getRadius(): scala.Double
}

object IPixelCircleGeometry {
  @scala.inline
  def apply(
    equals: js.Function1[IPixelGeometry, scala.Boolean],
    events: IEventManager,
    getBounds: js.Function0[js.Array[js.Array[scala.Double]] | scala.Null],
    getCoordinates: js.Function0[js.Array[scala.Double]],
    getMetaData: js.Function0[js.Object],
    getRadius: js.Function0[scala.Double],
    getType: js.Function0[java.lang.String],
    scale: js.Function1[scala.Double, IPixelGeometry],
    shift: js.Function1[js.Array[scala.Double], IPixelGeometry]
  ): IPixelCircleGeometry = {
    val __obj = js.Dynamic.literal(equals = equals, events = events, getBounds = getBounds, getCoordinates = getCoordinates, getMetaData = getMetaData, getRadius = getRadius, getType = getType, scale = scale, shift = shift)
  
    __obj.asInstanceOf[IPixelCircleGeometry]
  }
}

