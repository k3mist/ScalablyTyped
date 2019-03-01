package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the current status of a scale subresource.
  */
trait ScaleStatus extends js.Object {
  /**
    * actual number of observed instances of the scaled object.
    */
  val replicas: scala.Double
  /**
    * label query over pods that should match the replicas count. More info:
    * http://kubernetes.io/docs/user-guide/labels#label-selectors
    */
  val selector: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * label selector for pods that should match the replicas count. This is a serializated
    * version of both map-based and more expressive set-based selectors. This is done to avoid
    * introspection in the clients. The string will be in the same format as the query-param
    * syntax. If the target type only supports map-based selectors, both this field and map-based
    * selector field are populated. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  val targetSelector: java.lang.String
}

object ScaleStatus {
  @scala.inline
  def apply(
    replicas: scala.Double,
    selector: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    targetSelector: java.lang.String
  ): ScaleStatus = {
    val __obj = js.Dynamic.literal(replicas = replicas, selector = selector, targetSelector = targetSelector)
  
    __obj.asInstanceOf[ScaleStatus]
  }
}

