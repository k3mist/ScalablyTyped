package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var x: scala.Double
  var y: scala.Double
  def add(p: Point): Point
  def angle(): scala.Double
  def angleTo(p: Point): scala.Double
  def angleWidth(p: Point): scala.Double
  def angleWithSep(x: scala.Double, y: scala.Double): scala.Double
  def dist(p: Point): scala.Double
  def distSqr(p: Point): scala.Double
  def div(k: scala.Double): Point
  def equals(p: Point): scala.Boolean
  def mag(): scala.Double
  def matMult(m: scala.Double): Point
  def mult(k: scala.Double): Point
  def perp(): Point
  def rotate(a: scala.Double): Point
  def round(): Point
  def sub(p: Point): Point
  def unit(): Point
}

object Point {
  @scala.inline
  def apply(
    add: js.Function1[Point, Point],
    angle: js.Function0[scala.Double],
    angleTo: js.Function1[Point, scala.Double],
    angleWidth: js.Function1[Point, scala.Double],
    angleWithSep: js.Function2[scala.Double, scala.Double, scala.Double],
    clone: js.Function0[Point],
    dist: js.Function1[Point, scala.Double],
    distSqr: js.Function1[Point, scala.Double],
    div: js.Function1[scala.Double, Point],
    equals: js.Function1[Point, scala.Boolean],
    mag: js.Function0[scala.Double],
    matMult: js.Function1[scala.Double, Point],
    mult: js.Function1[scala.Double, Point],
    perp: js.Function0[Point],
    rotate: js.Function1[scala.Double, Point],
    round: js.Function0[Point],
    sub: js.Function1[Point, Point],
    unit: js.Function0[Point],
    x: scala.Double,
    y: scala.Double
  ): Point = {
    val __obj = js.Dynamic.literal(add = add, angle = angle, angleTo = angleTo, angleWidth = angleWidth, angleWithSep = angleWithSep, clone = clone, dist = dist, distSqr = distSqr, div = div, equals = equals, mag = mag, matMult = matMult, mult = mult, perp = perp, rotate = rotate, round = round, sub = sub, unit = unit, x = x, y = y)
  
    __obj.asInstanceOf[Point]
  }
}

