package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an object that can produce PerceptionFrames. */
trait IPerceptionFrameProvider
  extends winrtDashUwpLib.WindowsNs.FoundationNs.IClosable {
  /** Gets a value indicating whether or not the device is ready to start producing PerceptionFrames. */
  var available: scala.Boolean
  /** Gets the PerceptionFrameProviderInfo describing this device. */
  var frameProviderInfo: PerceptionFrameProviderInfo
  /** The properties describing the device and the frames produced by the device. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  /**
    * The device is requested to update one of its Properties to a new value.
    * @param value Success or failure will be conveyed to the app.
    */
  def setProperty(value: PerceptionPropertyChangeRequest): scala.Unit
  /** Tells the device to start producing frames. If success is returned, PerceptionFrameProviderManagerService::PublishFrameForProvider is expected to be called by this Provider. */
  def start(): scala.Unit
  /** Tells the device to stop producing frames. Called only after Start is called and only if Start returns success. */
  def stop(): scala.Unit
}

object IPerceptionFrameProvider {
  @scala.inline
  def apply(
    available: scala.Boolean,
    close: js.Function0[scala.Unit],
    frameProviderInfo: PerceptionFrameProviderInfo,
    properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet,
    setProperty: js.Function1[PerceptionPropertyChangeRequest, scala.Unit],
    start: js.Function0[scala.Unit],
    stop: js.Function0[scala.Unit]
  ): IPerceptionFrameProvider = {
    val __obj = js.Dynamic.literal(available = available, close = close, frameProviderInfo = frameProviderInfo, properties = properties, setProperty = setProperty, start = start, stop = stop)
  
    __obj.asInstanceOf[IPerceptionFrameProvider]
  }
}

