package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the current state of the mobile broadband network device for the account. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation")
@js.native
abstract class MobileBroadbandDeviceInformation () extends js.Object {
  /** Gets the cellular technology used by the mobile broadband network device. */
  var cellularClass: winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.CellularClass = js.native
  /** Gets a value indicating the radio state of the device. */
  var currentRadioState: MobileBroadbandRadioState = js.native
  /** Gets the name of the data class when the DataClasses property returns Custom. */
  var customDataClass: java.lang.String = js.native
  /** Gets the cellular data services supported by the mobile broadband network device. */
  var dataClasses: DataClasses = js.native
  /** Gets the DeviceInformation Id of the mobile broadband device. */
  var deviceId: java.lang.String = js.native
  /** Gets a value indicating the type of Mobile Broadband device. */
  var deviceType: MobileBroadbandDeviceType = js.native
  /** Gets the device-specific firmware information for the mobile broadband network device. */
  var firmwareInformation: java.lang.String = js.native
  /** Gets the name of the manufacturer of the mobile broadband network device. */
  var manufacturer: java.lang.String = js.native
  /** Gets the value that uniquely identifies the mobile broadband device to the network provider. */
  var mobileEquipmentId: java.lang.String = js.native
  /** Gets the name of the model of the mobile broadband network device. */
  var model: java.lang.String = js.native
  /** Gets the readiness status of the mobile broadband network device. */
  var networkDeviceStatus: NetworkDeviceStatus = js.native
  /** Gets a MobileBroadbandPinManager object for the mobile broadband device. */
  var pinManager: MobileBroadbandPinManager = js.native
  /** Gets the revision of the mobile broadband device. */
  var revision: java.lang.String = js.native
  /** Gets the serial number of the mobile broadband device. */
  var serialNumber: java.lang.String = js.native
  /** Gets the SIM integrated circuit card identifier (ICCID) for the mobile broadband network device. */
  var simIccId: java.lang.String = js.native
  /** Gets the subscriber identifier for the mobile broadband network device. */
  var subscriberId: java.lang.String = js.native
  /** Gets the telephone numbers for the mobile broadband device. */
  var telephoneNumbers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
}

