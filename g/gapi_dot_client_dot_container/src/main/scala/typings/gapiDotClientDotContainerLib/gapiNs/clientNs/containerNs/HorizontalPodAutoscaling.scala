package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HorizontalPodAutoscaling extends js.Object {
  /**
    * Whether the Horizontal Pod Autoscaling feature is enabled in the cluster.
    * When enabled, it ensures that a Heapster pod is running in the cluster,
    * which is also used by the Cloud Monitoring service.
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
}

object HorizontalPodAutoscaling {
  @scala.inline
  def apply(disabled: js.UndefOr[scala.Boolean] = js.undefined): HorizontalPodAutoscaling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[HorizontalPodAutoscaling]
  }
}

