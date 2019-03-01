package typings
package roslibLib.roslibMod.ROSLIBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var rotation: Quaternion
  // getters
  var translation: Vector3
}

object Transform {
  @scala.inline
  def apply(clone: js.Function0[Transform], rotation: Quaternion, translation: Vector3): Transform = {
    val __obj = js.Dynamic.literal(clone = clone, rotation = rotation, translation = translation)
  
    __obj.asInstanceOf[Transform]
  }
}

