package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies the channel pressure. */
@JSGlobal("Windows.Devices.Midi.MidiChannelPressureMessage")
@js.native
class MidiChannelPressureMessage protected () extends js.Object {
  /**
    * Creates a new MidiChannelPressureMessage object.
    * @param channel The channel from 0-15 that this message applies to.
    * @param pressure The pressure from 0-127.
    */
  def this(channel: scala.Double, pressure: scala.Double) = this()
  /** Gets the channel from 0-15 that this message applies to. */
  var channel: scala.Double = js.native
  /** Gets the pressure from 0-127. */
  var pressure: scala.Double = js.native
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: scala.Double = js.native
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType = js.native
}

