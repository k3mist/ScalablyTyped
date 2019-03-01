package typings
package atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionCondition contains details for the current condition of this pod.
  */
trait CustomResourceDefinitionCondition extends js.Object {
  /**
    * Last time the condition transitioned from one status to another.
    */
  val lastTransitionTime: java.lang.String
  /**
    * Human-readable message indicating details about last transition.
    */
  val message: java.lang.String
  /**
    * Unique, one-word, CamelCase reason for the condition's last transition.
    */
  val reason: java.lang.String
  /**
    * Status is the status of the condition. Can be True, False, Unknown.
    */
  val status: java.lang.String
  /**
    * Type is the type of the condition.
    */
  val `type`: java.lang.String
}

object CustomResourceDefinitionCondition {
  @scala.inline
  def apply(
    lastTransitionTime: java.lang.String,
    message: java.lang.String,
    reason: java.lang.String,
    status: java.lang.String,
    `type`: java.lang.String
  ): CustomResourceDefinitionCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime, message = message, reason = reason, status = status, `type` = `type`)
  
    __obj.asInstanceOf[CustomResourceDefinitionCondition]
  }
}

