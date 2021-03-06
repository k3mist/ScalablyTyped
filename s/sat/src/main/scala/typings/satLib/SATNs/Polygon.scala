package typings
package satLib.SATNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SAT.Polygon")
@js.native
class Polygon () extends js.Object {
  def this(pos: Vector) = this()
  def this(pos: Vector, points: js.Array[Vector]) = this()
  var angle: scala.Double = js.native
  var calcPoints: js.Array[Vector] = js.native
  var edges: js.Array[Vector] = js.native
  var normals: js.Array[Vector] = js.native
  var offset: Vector = js.native
  var points: js.Array[Vector] = js.native
  var pos: Vector = js.native
  def getAABB(): Polygon = js.native
  def getCentroid(): Vector = js.native
  def rotate(angle: scala.Double): Polygon = js.native
  def setAngle(angle: scala.Double): Polygon = js.native
  def setOffset(offset: Vector): Polygon = js.native
  def setPoints(points: js.Array[Vector]): Polygon = js.native
  def translate(x: scala.Double, y: scala.Double): Polygon = js.native
}

