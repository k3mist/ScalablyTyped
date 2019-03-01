package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
  * Deprecated: use SELinuxStrategyOptions from policy API Group instead.
  */
trait SELinuxStrategyOptions extends js.Object {
  /**
    * rule is the strategy that will dictate the allowable labels that may be set.
    */
  val rule: java.lang.String
  /**
    * seLinuxOptions required to run as; required for MustRunAs More info:
    * https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  val seLinuxOptions: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.SELinuxOptions
}

object SELinuxStrategyOptions {
  @scala.inline
  def apply(
    rule: java.lang.String,
    seLinuxOptions: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.SELinuxOptions
  ): SELinuxStrategyOptions = {
    val __obj = js.Dynamic.literal(rule = rule, seLinuxOptions = seLinuxOptions)
  
    __obj.asInstanceOf[SELinuxStrategyOptions]
  }
}

