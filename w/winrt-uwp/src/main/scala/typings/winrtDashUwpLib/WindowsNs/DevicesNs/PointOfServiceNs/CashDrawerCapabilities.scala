package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the cash drawer capabilities. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerCapabilities")
@js.native
abstract class CashDrawerCapabilities () extends js.Object {
  /** Indicated whether cash drawer open sensor is available. */
  var isDrawerOpenSensorAvailable: scala.Boolean = js.native
  /** Whether statistics reporting is supported by the cash drawer. */
  var isStatisticsReportingSupported: scala.Boolean = js.native
  /** Whether statistics updating is supported by the cash drawer. */
  var isStatisticsUpdatingSupported: scala.Boolean = js.native
  /** Whether the status from multiple drawers is supported. */
  var isStatusMultiDrawerDetectSupported: scala.Boolean = js.native
  /** Whether status reporting is supported by the cash drawer. */
  var isStatusReportingSupported: scala.Boolean = js.native
  /** Whether the cash drawer has standard or advanced power reporting. */
  var powerReportingType: UnifiedPosPowerReportingType = js.native
}

