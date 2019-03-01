package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for updraft event data
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
trait PhysicsUpdraftEventData extends js.Object {
  /**
    * A cylinder used for the updraft event
    */
  var cylinder: Mesh
}

object PhysicsUpdraftEventData {
  @scala.inline
  def apply(cylinder: Mesh): PhysicsUpdraftEventData = {
    val __obj = js.Dynamic.literal(cylinder = cylinder)
  
    __obj.asInstanceOf[PhysicsUpdraftEventData]
  }
}

