package typings
package cordovaDashPluginDashIbeaconLib.cordovaDashPluginDashIbeaconMod.Global.BeaconPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delegate extends js.Object {
  def didChangeAuthorizationStatus(authorizationStatus: java.lang.String): scala.Unit
  def didDetermineStateForRegion(pluginResult: PluginResult): scala.Unit
  def didEnterRegion(pluginResult: PluginResult): scala.Unit
  def didExitRegion(pluginResult: PluginResult): scala.Unit
  def didRangeBeaconsInRegion(pluginResult: PluginResult): scala.Unit
  def didStartMonitoringForRegion(pluginResult: PluginResult): scala.Unit
  def monitoringDidFailForRegionWithError(pluginResult: PluginResult): scala.Unit
  def peripheralManagerDidStartAdvertising(pluginResult: PluginResult): scala.Unit
  def peripheralManagerDidUpdateState(pluginResult: PluginResult): scala.Unit
}

object Delegate {
  @scala.inline
  def apply(
    didChangeAuthorizationStatus: js.Function1[java.lang.String, scala.Unit],
    didDetermineStateForRegion: js.Function1[PluginResult, scala.Unit],
    didEnterRegion: js.Function1[PluginResult, scala.Unit],
    didExitRegion: js.Function1[PluginResult, scala.Unit],
    didRangeBeaconsInRegion: js.Function1[PluginResult, scala.Unit],
    didStartMonitoringForRegion: js.Function1[PluginResult, scala.Unit],
    monitoringDidFailForRegionWithError: js.Function1[PluginResult, scala.Unit],
    peripheralManagerDidStartAdvertising: js.Function1[PluginResult, scala.Unit],
    peripheralManagerDidUpdateState: js.Function1[PluginResult, scala.Unit]
  ): Delegate = {
    val __obj = js.Dynamic.literal(didChangeAuthorizationStatus = didChangeAuthorizationStatus, didDetermineStateForRegion = didDetermineStateForRegion, didEnterRegion = didEnterRegion, didExitRegion = didExitRegion, didRangeBeaconsInRegion = didRangeBeaconsInRegion, didStartMonitoringForRegion = didStartMonitoringForRegion, monitoringDidFailForRegionWithError = monitoringDidFailForRegionWithError, peripheralManagerDidStartAdvertising = peripheralManagerDidStartAdvertising, peripheralManagerDidUpdateState = peripheralManagerDidUpdateState)
  
    __obj.asInstanceOf[Delegate]
  }
}

