package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpectrumSchedule extends js.Object {
  /** The event time expresses when the spectrum profile is valid. It will always be present. */
  var eventTime: js.UndefOr[EventTime] = js.undefined
  /** A list of spectrum messages representing the usable profile. It will always be present, but may be empty when there is no available spectrum. */
  var spectra: js.UndefOr[js.Array[SpectrumMessage]] = js.undefined
}

object SpectrumSchedule {
  @scala.inline
  def apply(eventTime: EventTime = null, spectra: js.Array[SpectrumMessage] = null): SpectrumSchedule = {
    val __obj = js.Dynamic.literal()
    if (eventTime != null) __obj.updateDynamic("eventTime")(eventTime)
    if (spectra != null) __obj.updateDynamic("spectra")(spectra)
    __obj.asInstanceOf[SpectrumSchedule]
  }
}

