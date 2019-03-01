package typings
package atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RollingUpdateStatefulSetStrategy is used to communicate parameter for
  * RollingUpdateStatefulSetStrategyType.
  */
trait RollingUpdateStatefulSetStrategy extends js.Object {
  /**
    * Partition indicates the ordinal at which the StatefulSet should be partitioned. Default
    * value is 0.
    */
  val partition: scala.Double
}

object RollingUpdateStatefulSetStrategy {
  @scala.inline
  def apply(partition: scala.Double): RollingUpdateStatefulSetStrategy = {
    val __obj = js.Dynamic.literal(partition = partition)
  
    __obj.asInstanceOf[RollingUpdateStatefulSetStrategy]
  }
}

