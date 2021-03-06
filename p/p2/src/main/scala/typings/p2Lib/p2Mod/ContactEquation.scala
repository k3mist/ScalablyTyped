package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "ContactEquation")
@js.native
class ContactEquation protected ()
  extends p2Lib.p2Mod.p2Ns.ContactEquation {
  def this(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body) = this()
  /* CompleteClass */
  override var G: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var bodyA: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var bodyB: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var contactPointA: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var contactPointB: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var enabled: scala.Boolean = js.native
  /* CompleteClass */
  override var epsilon: scala.Double = js.native
  /* CompleteClass */
  override var firstImpact: scala.Boolean = js.native
  /* CompleteClass */
  override var maxForce: scala.Double = js.native
  /* CompleteClass */
  override var minForce: scala.Double = js.native
  /* CompleteClass */
  override var multiplier: scala.Double = js.native
  /* CompleteClass */
  override var needsUpdate: scala.Boolean = js.native
  /* CompleteClass */
  override var normalA: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var penetrationVec: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var relativeVelocity: scala.Double = js.native
  /* CompleteClass */
  override var relaxation: scala.Double = js.native
  /* CompleteClass */
  override var restitution: scala.Double = js.native
  /* CompleteClass */
  override var shapeA: p2Lib.p2Mod.p2Ns.Shape = js.native
  /* CompleteClass */
  override var shapeB: p2Lib.p2Mod.p2Ns.Shape = js.native
  /* CompleteClass */
  override var stiffness: scala.Double = js.native
  /* CompleteClass */
  override var timeStep: scala.Double = js.native
  /* CompleteClass */
  override def addToWlambda(deltalambda: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def computeB(a: scala.Double, b: scala.Double, h: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def computeGW(): scala.Double = js.native
  /* CompleteClass */
  override def computeGWlambda(): scala.Double = js.native
  /* CompleteClass */
  override def computeGiMGt(): scala.Double = js.native
  /* CompleteClass */
  override def computeGiMf(): scala.Double = js.native
  /* CompleteClass */
  override def computeGq(): scala.Double = js.native
  /* CompleteClass */
  override def computeInvC(eps: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def getVelocityAlongNormal(): scala.Double = js.native
  /* CompleteClass */
  override def gmult(
    G: js.Tuple2[scala.Double, scala.Double],
    vi: js.Tuple2[scala.Double, scala.Double],
    wi: js.Tuple2[scala.Double, scala.Double],
    vj: js.Tuple2[scala.Double, scala.Double],
    wj: js.Tuple2[scala.Double, scala.Double]
  ): scala.Double = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}

