package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for radial explosion event data
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
trait PhysicsRadialExplosionEventData extends js.Object {
  /**
    * An array of rays for the radial explosion event
    */
  var rays: js.Array[Ray]
  /**
    * A sphere used for the radial explosion event
    */
  var sphere: Mesh
}

object PhysicsRadialExplosionEventData {
  @scala.inline
  def apply(rays: js.Array[Ray], sphere: Mesh): PhysicsRadialExplosionEventData = {
    val __obj = js.Dynamic.literal(rays = rays, sphere = sphere)
  
    __obj.asInstanceOf[PhysicsRadialExplosionEventData]
  }
}

