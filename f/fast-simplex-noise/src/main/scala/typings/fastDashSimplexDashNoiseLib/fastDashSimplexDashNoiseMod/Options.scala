package typings
package fastDashSimplexDashNoiseLib.fastDashSimplexDashNoiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var amplitude: js.UndefOr[scala.Double] = js.undefined
  var frequency: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var octaves: js.UndefOr[scala.Double] = js.undefined
  var persistence: js.UndefOr[scala.Double] = js.undefined
  var random: js.UndefOr[js.Function0[scala.Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    amplitude: scala.Int | scala.Double = null,
    frequency: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    octaves: scala.Int | scala.Double = null,
    persistence: scala.Int | scala.Double = null,
    random: js.Function0[scala.Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (amplitude != null) __obj.updateDynamic("amplitude")(amplitude.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (octaves != null) __obj.updateDynamic("octaves")(octaves.asInstanceOf[js.Any])
    if (persistence != null) __obj.updateDynamic("persistence")(persistence.asInstanceOf[js.Any])
    if (random != null) __obj.updateDynamic("random")(random)
    __obj.asInstanceOf[Options]
  }
}

