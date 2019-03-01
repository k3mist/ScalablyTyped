package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranscodeSetting extends js.Object {
  /** Whitelist of video formats to be served to this placement. Set this list to null or empty to serve all video formats. */
  var enabledVideoFormats: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#transcodeSetting". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object TranscodeSetting {
  @scala.inline
  def apply(enabledVideoFormats: js.Array[scala.Double] = null, kind: java.lang.String = null): TranscodeSetting = {
    val __obj = js.Dynamic.literal()
    if (enabledVideoFormats != null) __obj.updateDynamic("enabledVideoFormats")(enabledVideoFormats)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[TranscodeSetting]
  }
}

