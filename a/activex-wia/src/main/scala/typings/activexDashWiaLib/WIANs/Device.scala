package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Device object represents an active connection to an imaging device. */
@JSGlobal("WIA.Device")
@js.native
class Device protected () extends js.Object {
  /** A collection of all commands for this imaging device */
  @JSName("Commands")
  val Commands_Original: DeviceCommands = js.native
  /** Returns the DeviceID for this Device */
  val DeviceID: java.lang.String = js.native
  /** A collection of all events for this imaging device */
  @JSName("Events")
  val Events_Original: DeviceEvents = js.native
  /** A collection of all items for this imaging device */
  @JSName("Items")
  val Items_Original: Items = js.native
  /** A collection of all properties for this imaging device */
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  /** Returns the Type of Device */
  val Type: WiaDeviceType = js.native
  var `WIA.Device_typekey`: Device = js.native
  /** Returns the specified item in the collection by position */
  /** A collection of all commands for this imaging device */
  def Commands(Index: scala.Double): DeviceCommand = js.native
  /** Returns the specified item in the collection by position */
  /** A collection of all events for this imaging device */
  def Events(Index: scala.Double): DeviceEvent = js.native
  /**
    * Issues the command specified by CommandID to the imaging device. CommandIDs are device dependent. Valid CommandIDs for this Device are contained in
    * the Commands collection.
    */
  def ExecuteCommand(CommandID: java.lang.String): Item = js.native
  /** Returns the Item object specified by ItemID if it exists */
  def GetItem(ItemID: java.lang.String): Item = js.native
  /** Returns the specified item in the collection by position */
  /** A collection of all items for this imaging device */
  def Items(Index: scala.Double): Item = js.native
  def Properties(Index: java.lang.String): Property = js.native
  /** Returns the specified item in the collection either by position or name. */
  /** A collection of all properties for this imaging device */
  def Properties(Index: scala.Double): Property = js.native
}

