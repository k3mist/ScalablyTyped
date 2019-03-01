package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodReadinessGate contains the reference to a pod condition
  */
trait PodReadinessGate extends js.Object {
  /**
    * ConditionType refers to a condition in the pod's condition list with matching type.
    */
  val conditionType: java.lang.String
}

object PodReadinessGate {
  @scala.inline
  def apply(conditionType: java.lang.String): PodReadinessGate = {
    val __obj = js.Dynamic.literal(conditionType = conditionType)
  
    __obj.asInstanceOf[PodReadinessGate]
  }
}

