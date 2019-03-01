package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntennaCharacteristics extends js.Object {
  /**
    * The antenna height in meters. Whether the antenna height is required depends on the device type and the regulatory domain. Note that the height may be
    * negative.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** If the height is required, then the height type (AGL for above ground level or AMSL for above mean sea level) is also required. The default is AGL. */
  var heightType: js.UndefOr[java.lang.String] = js.undefined
  /** The height uncertainty in meters. Whether this is required depends on the regulatory domain. */
  var heightUncertainty: js.UndefOr[scala.Double] = js.undefined
}

object AntennaCharacteristics {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    heightType: java.lang.String = null,
    heightUncertainty: scala.Int | scala.Double = null
  ): AntennaCharacteristics = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightType != null) __obj.updateDynamic("heightType")(heightType)
    if (heightUncertainty != null) __obj.updateDynamic("heightUncertainty")(heightUncertainty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntennaCharacteristics]
  }
}

