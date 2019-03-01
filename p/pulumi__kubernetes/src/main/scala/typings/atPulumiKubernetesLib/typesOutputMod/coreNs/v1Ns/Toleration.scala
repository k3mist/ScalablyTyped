package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The pod this Toleration is attached to tolerates any taint that matches the triple
  * <key,value,effect> using the matching operator <operator>.
  */
trait Toleration extends js.Object {
  /**
    * Effect indicates the taint effect to match. Empty means match all taint effects. When
    * specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
    */
  val effect: java.lang.String
  /**
    * Key is the taint key that the toleration applies to. Empty means match all taint keys. If
    * the key is empty, operator must be Exists; this combination means to match all values and
    * all keys.
    */
  val key: java.lang.String
  /**
    * Operator represents a key's relationship to the value. Valid operators are Exists and
    * Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can
    * tolerate all taints of a particular category.
    */
  val operator: java.lang.String
  /**
    * TolerationSeconds represents the period of time the toleration (which must be of effect
    * NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set,
    * which means tolerate the taint forever (do not evict). Zero and negative values will be
    * treated as 0 (evict immediately) by the system.
    */
  val tolerationSeconds: scala.Double
  /**
    * Value is the taint value the toleration matches to. If the operator is Exists, the value
    * should be empty, otherwise just a regular string.
    */
  val value: java.lang.String
}

object Toleration {
  @scala.inline
  def apply(
    effect: java.lang.String,
    key: java.lang.String,
    operator: java.lang.String,
    tolerationSeconds: scala.Double,
    value: java.lang.String
  ): Toleration = {
    val __obj = js.Dynamic.literal(effect = effect, key = key, operator = operator, tolerationSeconds = tolerationSeconds, value = value)
  
    __obj.asInstanceOf[Toleration]
  }
}

