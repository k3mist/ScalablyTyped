package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpLoadBalancing extends js.Object {
  /**
    * Whether the HTTP Load Balancing controller is enabled in the cluster.
    * When enabled, it runs a small pod in the cluster that manages the load
    * balancers.
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
}

object HttpLoadBalancing {
  @scala.inline
  def apply(disabled: js.UndefOr[scala.Boolean] = js.undefined): HttpLoadBalancing = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[HttpLoadBalancing]
  }
}

