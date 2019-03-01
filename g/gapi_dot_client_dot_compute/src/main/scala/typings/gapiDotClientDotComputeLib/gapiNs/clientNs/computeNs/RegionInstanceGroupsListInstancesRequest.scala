package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionInstanceGroupsListInstancesRequest extends js.Object {
  /** Instances in which state should be returned. Valid options are: 'ALL', 'RUNNING'. By default, it lists all instances. */
  var instanceState: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of port user is interested in. It is optional. If it is set, only information about this ports will be returned. If it is not set, all the named
    * ports will be returned. Always lists all instances.
    */
  var portName: js.UndefOr[java.lang.String] = js.undefined
}

object RegionInstanceGroupsListInstancesRequest {
  @scala.inline
  def apply(instanceState: java.lang.String = null, portName: java.lang.String = null): RegionInstanceGroupsListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instanceState != null) __obj.updateDynamic("instanceState")(instanceState)
    if (portName != null) __obj.updateDynamic("portName")(portName)
    __obj.asInstanceOf[RegionInstanceGroupsListInstancesRequest]
  }
}

