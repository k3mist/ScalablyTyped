package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutboundRoutingRule Class */
@JSGlobal("FAXCOMEXLib.FaxOutboundRoutingRule")
@js.native
class FaxOutboundRoutingRule protected () extends js.Object {
  /** Area code */
  val AreaCode: scala.Double = js.native
  /** Country code */
  val CountryCode: scala.Double = js.native
  /** Destination device */
  var DeviceId: scala.Double = js.native
  var `FAXCOMEXLib.FaxOutboundRoutingRule_typekey`: FaxOutboundRoutingRule = js.native
  /** Group name */
  var GroupName: java.lang.String = js.native
  /** Status */
  val Status: FAX_RULE_STATUS_ENUM = js.native
  /** Uses single device or group */
  var UseDevice: scala.Boolean = js.native
  /** Refresh the object */
  def Refresh(): scala.Unit = js.native
  /** Save the object */
  def Save(): scala.Unit = js.native
}

