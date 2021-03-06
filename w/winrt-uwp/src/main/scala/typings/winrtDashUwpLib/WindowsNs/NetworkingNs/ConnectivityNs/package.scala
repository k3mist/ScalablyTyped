package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ConnectivityNs {
  /** Represents the method that handles network status change notifications. This method is called when any properties exposed by the NetworkInformation object changes while the app is active. */
  type NetworkStatusChangedEventHandler = js.Function1[/* ev */ winrtDashUwpLib.WindowsNs.WinRTEvent[js.Any], scala.Unit]
}
