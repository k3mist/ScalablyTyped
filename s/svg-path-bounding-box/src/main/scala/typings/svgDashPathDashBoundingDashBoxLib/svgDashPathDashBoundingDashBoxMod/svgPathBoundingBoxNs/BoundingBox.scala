package typings
package svgDashPathDashBoundingDashBoxLib.svgDashPathDashBoundingDashBoxMod.svgPathBoundingBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * pass in initial points if you want
  * @see https://github.com/gabelerner/canvg/blob/860e418aca67b9a41e858a223d74d375793ec364/canvg.js#L449
  */
trait BoundingBox extends js.Object {
  var x1: scala.Double
  var x2: scala.Double
  var y1: scala.Double
  var y2: scala.Double
  /** @see http://blog.hackers-cafe.net/2009/06/how-to-calculate-bezier-curves-bounding.html */
  def addBezierCurve(
    p0x: scala.Double,
    p0y: scala.Double,
    p1x: scala.Double,
    p1y: scala.Double,
    p2x: scala.Double,
    p2y: scala.Double,
    p3x: scala.Double,
    p3y: scala.Double
  ): scala.Unit
  def addPoint(x: scala.Double, y: scala.Double): scala.Unit
  def addQuadraticCurve(
    p0x: scala.Double,
    p0y: scala.Double,
    p1x: scala.Double,
    p1y: scala.Double,
    p2x: scala.Double,
    p2y: scala.Double
  ): scala.Unit
  def addX(x: scala.Double): scala.Unit
  def addY(y: scala.Double): scala.Unit
  def height(): scala.Double
  def width(): scala.Double
}

object BoundingBox {
  @scala.inline
  def apply(
    addBezierCurve: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    addPoint: (scala.Double, scala.Double) => scala.Unit,
    addQuadraticCurve: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    addX: scala.Double => scala.Unit,
    addY: scala.Double => scala.Unit,
    height: () => scala.Double,
    width: () => scala.Double,
    x1: scala.Double,
    x2: scala.Double,
    y1: scala.Double,
    y2: scala.Double
  ): BoundingBox = {
    val __obj = js.Dynamic.literal(addBezierCurve = js.Any.fromFunction8(addBezierCurve), addPoint = js.Any.fromFunction2(addPoint), addQuadraticCurve = js.Any.fromFunction6(addQuadraticCurve), addX = js.Any.fromFunction1(addX), addY = js.Any.fromFunction1(addY), height = js.Any.fromFunction0(height), width = js.Any.fromFunction0(width), x1 = x1, x2 = x2, y1 = y1, y2 = y2)
  
    __obj.asInstanceOf[BoundingBox]
  }
}

