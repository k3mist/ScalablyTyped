package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface used to describe a physics joint
  */
trait PhysicsImpostorJoint extends js.Object {
  /** Defines the impostor that is connected to the main impostor using this joint */
  var connectedImpostor: PhysicsImpostor
  /** Defines the joint itself */
  var joint: PhysicsJoint
  /** Defines the main impostor to which the joint is linked */
  var mainImpostor: PhysicsImpostor
}

object PhysicsImpostorJoint {
  @scala.inline
  def apply(connectedImpostor: PhysicsImpostor, joint: PhysicsJoint, mainImpostor: PhysicsImpostor): PhysicsImpostorJoint = {
    val __obj = js.Dynamic.literal(connectedImpostor = connectedImpostor, joint = joint, mainImpostor = mainImpostor)
  
    __obj.asInstanceOf[PhysicsImpostorJoint]
  }
}

