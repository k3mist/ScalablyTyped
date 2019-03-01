package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs.underscoreInternalUnderscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkConfigBase[M /* <: chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedObject */, IF /* <: chromeDashAppsLib.chromeNs.networkingNs.oncNs.InterfaceType */, OF /* <: ObjectFunction */] extends js.Object {
  /** For cellular networks, cellular network properties. */
  var Cellular: js.UndefOr[
    chromeDashAppsLib.chromeNs.networkingNs.oncNs.CellularProperties[M] | chromeDashAppsLib.chromeNs.networkingNs.oncNs.CellularBase
  ] = js.undefined
  /** For Ethernet networks, the Ethernet network properties. */
  var Ethernet: js.UndefOr[
    chromeDashAppsLib.chromeNs.networkingNs.oncNs.EthernetProperties[M] | chromeDashAppsLib.Anon_Authentication
  ] = js.undefined
  /** The network GUID. */
  var GUID: js.UndefOr[java.lang.String] = js.undefined
  /** The network's IP address configuration type. */
  var IPAddressConfigType: js.UndefOr[
    chromeDashAppsLib.chromeNs.networkingNs.oncNs.IPConfigType | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedIPConfigType
  ] = js.undefined
  /** A user friendly network name. */
  var Name: js.UndefOr[
    java.lang.String | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedDOMString
  ] = js.undefined
  /** The IP configuration type for the name servers used by the network. */
  var NameServersConfigType: js.UndefOr[
    chromeDashAppsLib.chromeNs.networkingNs.oncNs.IPConfigType | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedIPConfigType
  ] = js.undefined
  /** The network priority. */
  var Priority: js.UndefOr[
    chromeDashAppsLib.chromeNs.integer | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedLong
  ] = js.undefined
  /** The network type. */
  var Type: js.UndefOr[chromeDashAppsLib.chromeNs.networkingNs.oncNs.NetworkType] = js.undefined
  /** For VPN networks, the network VPN properties. */
  var VPN: js.UndefOr[
    (chromeDashAppsLib.chromeNs.networkingNs.oncNs.VPNProperties[
      M, 
      scala.Boolean | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedBoolean, 
      java.lang.String | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedDOMString
    ]) | chromeDashAppsLib.Anon_Type
  ] = js.undefined
  /** For WiFi networks, the network WiFi properties. */
  var WiFi: js.UndefOr[
    (chromeDashAppsLib.chromeNs.networkingNs.oncNs.WiFiProperties[
      M, 
      OF, 
      scala.Boolean | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedBoolean, 
      java.lang.String | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedDOMString, 
      chromeDashAppsLib.chromeNs.integer | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedLong
    ]) | (chromeDashAppsLib.chromeNs.networkingNs.oncNs.WiFiPropertiesBase[
      chromeDashAppsLib.chromeDashAppsLibStrings.unmanaged, 
      java.lang.String | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedDOMString
    ])
  ] = js.undefined
  /** For WiMAX networks, the network WiMAX properties. */
  var WiMAX: js.UndefOr[
    (chromeDashAppsLib.chromeNs.networkingNs.oncNs.WiMAXProperties[M, scala.Boolean | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedBoolean]) | chromeDashAppsLib.Anon_SignalStrength
  ] = js.undefined
}

object NetworkConfigBase {
  @scala.inline
  def apply[M /* <: chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedObject */, IF /* <: chromeDashAppsLib.chromeNs.networkingNs.oncNs.InterfaceType */, OF /* <: ObjectFunction */](
    Cellular: chromeDashAppsLib.chromeNs.networkingNs.oncNs.CellularProperties[M] | chromeDashAppsLib.chromeNs.networkingNs.oncNs.CellularBase = null,
    Ethernet: chromeDashAppsLib.chromeNs.networkingNs.oncNs.EthernetProperties[M] | chromeDashAppsLib.Anon_Authentication = null,
    GUID: java.lang.String = null,
    IPAddressConfigType: chromeDashAppsLib.chromeNs.networkingNs.oncNs.IPConfigType | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedIPConfigType = null,
    Name: java.lang.String | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedDOMString = null,
    NameServersConfigType: chromeDashAppsLib.chromeNs.networkingNs.oncNs.IPConfigType | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedIPConfigType = null,
    Priority: chromeDashAppsLib.chromeNs.integer | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedLong = null,
    Type: chromeDashAppsLib.chromeNs.networkingNs.oncNs.NetworkType = null,
    VPN: (chromeDashAppsLib.chromeNs.networkingNs.oncNs.VPNProperties[
      M, 
      scala.Boolean | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedBoolean, 
      java.lang.String | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedDOMString
    ]) | chromeDashAppsLib.Anon_Type = null,
    WiFi: (chromeDashAppsLib.chromeNs.networkingNs.oncNs.WiFiProperties[
      M, 
      OF, 
      scala.Boolean | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedBoolean, 
      java.lang.String | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedDOMString, 
      chromeDashAppsLib.chromeNs.integer | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedLong
    ]) | (chromeDashAppsLib.chromeNs.networkingNs.oncNs.WiFiPropertiesBase[
      chromeDashAppsLib.chromeDashAppsLibStrings.unmanaged, 
      java.lang.String | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedDOMString
    ]) = null,
    WiMAX: (chromeDashAppsLib.chromeNs.networkingNs.oncNs.WiMAXProperties[M, scala.Boolean | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedBoolean]) | chromeDashAppsLib.Anon_SignalStrength = null
  ): NetworkConfigBase[M, IF, OF] = {
    val __obj = js.Dynamic.literal()
    if (Cellular != null) __obj.updateDynamic("Cellular")(Cellular.asInstanceOf[js.Any])
    if (Ethernet != null) __obj.updateDynamic("Ethernet")(Ethernet.asInstanceOf[js.Any])
    if (GUID != null) __obj.updateDynamic("GUID")(GUID)
    if (IPAddressConfigType != null) __obj.updateDynamic("IPAddressConfigType")(IPAddressConfigType.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NameServersConfigType != null) __obj.updateDynamic("NameServersConfigType")(NameServersConfigType.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type)
    if (VPN != null) __obj.updateDynamic("VPN")(VPN.asInstanceOf[js.Any])
    if (WiFi != null) __obj.updateDynamic("WiFi")(WiFi.asInstanceOf[js.Any])
    if (WiMAX != null) __obj.updateDynamic("WiMAX")(WiMAX.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkConfigBase[M, IF, OF]]
  }
}

