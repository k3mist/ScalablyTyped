package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for
  * example, hits-per-second on an Ingress object).
  */
trait ObjectMetricSource extends js.Object {
  /**
    * averageValue is the target value of the average of the metric across all relevant pods (as
    * a quantity)
    */
  val averageValue: java.lang.String
  /**
    * metricName is the name of the metric in question.
    */
  val metricName: java.lang.String
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given
    * metric When set, it is passed as an additional parameter to the metrics server for more
    * specific metrics scoping When unset, just the metricName will be used to gather metrics.
    */
  val selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
  /**
    * target is the described Kubernetes object.
    */
  val target: CrossVersionObjectReference
  /**
    * targetValue is the target value of the metric (as a quantity).
    */
  val targetValue: java.lang.String
}

object ObjectMetricSource {
  @scala.inline
  def apply(
    averageValue: java.lang.String,
    metricName: java.lang.String,
    selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector,
    target: CrossVersionObjectReference,
    targetValue: java.lang.String
  ): ObjectMetricSource = {
    val __obj = js.Dynamic.literal(averageValue = averageValue, metricName = metricName, selector = selector, target = target, targetValue = targetValue)
  
    __obj.asInstanceOf[ObjectMetricSource]
  }
}

