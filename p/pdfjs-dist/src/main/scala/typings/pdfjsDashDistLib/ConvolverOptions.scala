package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvolverOptions extends AudioNodeOptions {
  var buffer: js.UndefOr[AudioBuffer | scala.Null] = js.undefined
  var disableNormalization: js.UndefOr[scala.Boolean] = js.undefined
}

object ConvolverOptions {
  @scala.inline
  def apply(
    buffer: AudioBuffer = null,
    channelCount: scala.Int | scala.Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    disableNormalization: js.UndefOr[scala.Boolean] = js.undefined
  ): ConvolverOptions = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(buffer)
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode)
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation)
    if (!js.isUndefined(disableNormalization)) __obj.updateDynamic("disableNormalization")(disableNormalization)
    __obj.asInstanceOf[ConvolverOptions]
  }
}

