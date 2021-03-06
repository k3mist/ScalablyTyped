package typings
package roslibLib.roslibMod.ROSLIBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vector3 extends js.Object {
  // getters
  var x: scala.Double
  var y: scala.Double
  var z: scala.Double
  /**
    * Set the values of this vector to the sum of itself and the given vector.
    *
    * @param v - the vector to add with
    */
  def add(v: Vector3): scala.Unit
  /**
    * Multiply the given Quaternion with this vector.
    * @param q - the quaternion to multiply with
    */
  def multiplyQuaternion(q: Quaternion): scala.Unit
  /**
    * Set the values of this vector to the difference of itself and the given vector.
    *
    * @param v - the vector to subtract with
    */
  def subtract(v: Vector3): scala.Unit
}

object Vector3 {
  @scala.inline
  def apply(
    add: Vector3 => scala.Unit,
    clone: () => Vector3,
    multiplyQuaternion: Quaternion => scala.Unit,
    subtract: Vector3 => scala.Unit,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double
  ): Vector3 = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clone = js.Any.fromFunction0(clone), multiplyQuaternion = js.Any.fromFunction1(multiplyQuaternion), subtract = js.Any.fromFunction1(subtract), x = x, y = y, z = z)
  
    __obj.asInstanceOf[Vector3]
  }
}

