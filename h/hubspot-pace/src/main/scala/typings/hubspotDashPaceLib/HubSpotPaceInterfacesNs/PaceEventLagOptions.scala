package typings
package hubspotDashPaceLib.HubSpotPaceInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaceEventLagOptions extends js.Object {
  /**
    * Above how many ms of lag is the CPU considered busy?
    */
  var lagThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * When we first start measuring event lag, not much is going on in the browser yet, so it's not uncommon for the numbers to be abnormally low for the first few samples. This configures how many samples we need before we consider a low number to mean completion.
    */
  var minSamples: js.UndefOr[scala.Double] = js.undefined
  /**
    * How many samples should we average to decide what the current lag is?
    */
  var sampleCount: js.UndefOr[scala.Double] = js.undefined
}

object PaceEventLagOptions {
  @scala.inline
  def apply(
    lagThreshold: scala.Int | scala.Double = null,
    minSamples: scala.Int | scala.Double = null,
    sampleCount: scala.Int | scala.Double = null
  ): PaceEventLagOptions = {
    val __obj = js.Dynamic.literal()
    if (lagThreshold != null) __obj.updateDynamic("lagThreshold")(lagThreshold.asInstanceOf[js.Any])
    if (minSamples != null) __obj.updateDynamic("minSamples")(minSamples.asInstanceOf[js.Any])
    if (sampleCount != null) __obj.updateDynamic("sampleCount")(sampleCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaceEventLagOptions]
  }
}

