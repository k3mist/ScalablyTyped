package typings
package skywayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallOptions extends js.Object {
  var audioBandwidth: js.UndefOr[scala.Double] = js.undefined
  var audioCodec: js.UndefOr[java.lang.String] = js.undefined
  var audioReceiveEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var videoBandWidth: js.UndefOr[scala.Double] = js.undefined
  var videoCodec: js.UndefOr[java.lang.String] = js.undefined
  var videoReceiveEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object CallOptions {
  @scala.inline
  def apply(
    audioBandwidth: scala.Int | scala.Double = null,
    audioCodec: java.lang.String = null,
    audioReceiveEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    metadata: js.Any = null,
    videoBandWidth: scala.Int | scala.Double = null,
    videoCodec: java.lang.String = null,
    videoReceiveEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): CallOptions = {
    val __obj = js.Dynamic.literal()
    if (audioBandwidth != null) __obj.updateDynamic("audioBandwidth")(audioBandwidth.asInstanceOf[js.Any])
    if (audioCodec != null) __obj.updateDynamic("audioCodec")(audioCodec)
    if (!js.isUndefined(audioReceiveEnabled)) __obj.updateDynamic("audioReceiveEnabled")(audioReceiveEnabled)
    if (label != null) __obj.updateDynamic("label")(label)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (videoBandWidth != null) __obj.updateDynamic("videoBandWidth")(videoBandWidth.asInstanceOf[js.Any])
    if (videoCodec != null) __obj.updateDynamic("videoCodec")(videoCodec)
    if (!js.isUndefined(videoReceiveEnabled)) __obj.updateDynamic("videoReceiveEnabled")(videoReceiveEnabled)
    __obj.asInstanceOf[CallOptions]
  }
}

