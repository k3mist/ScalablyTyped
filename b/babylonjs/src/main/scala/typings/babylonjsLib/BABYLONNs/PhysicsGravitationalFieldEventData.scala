package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for gravitational field event data
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
trait PhysicsGravitationalFieldEventData extends js.Object {
  /**
    * A sphere mesh used for the gravitational field event
    */
  var sphere: Mesh
}

object PhysicsGravitationalFieldEventData {
  @scala.inline
  def apply(sphere: Mesh): PhysicsGravitationalFieldEventData = {
    val __obj = js.Dynamic.literal(sphere = sphere)
  
    __obj.asInstanceOf[PhysicsGravitationalFieldEventData]
  }
}

