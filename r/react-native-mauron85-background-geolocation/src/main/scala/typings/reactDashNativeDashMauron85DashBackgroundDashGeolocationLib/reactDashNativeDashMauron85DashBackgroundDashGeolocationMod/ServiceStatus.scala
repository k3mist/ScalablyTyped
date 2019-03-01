package typings
package reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceStatus extends js.Object {
  var authorization: scala.Double
  var hasPermissions: scala.Boolean
  var isRunning: scala.Boolean
  var locationServicesEnabled: scala.Boolean
}

object ServiceStatus {
  @scala.inline
  def apply(
    authorization: scala.Double,
    hasPermissions: scala.Boolean,
    isRunning: scala.Boolean,
    locationServicesEnabled: scala.Boolean
  ): ServiceStatus = {
    val __obj = js.Dynamic.literal(authorization = authorization, hasPermissions = hasPermissions, isRunning = isRunning, locationServicesEnabled = locationServicesEnabled)
  
    __obj.asInstanceOf[ServiceStatus]
  }
}

