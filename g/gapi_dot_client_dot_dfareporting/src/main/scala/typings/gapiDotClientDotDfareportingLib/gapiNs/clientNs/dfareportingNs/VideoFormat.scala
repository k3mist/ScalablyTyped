package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormat extends js.Object {
  /** File type of the video format. */
  var fileType: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the video format. */
  var id: js.UndefOr[scala.Double] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoFormat". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The resolution of this video format. */
  var resolution: js.UndefOr[Size] = js.undefined
  /** The target bit rate of this video format. */
  var targetBitRate: js.UndefOr[scala.Double] = js.undefined
}

object VideoFormat {
  @scala.inline
  def apply(
    fileType: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    resolution: Size = null,
    targetBitRate: scala.Int | scala.Double = null
  ): VideoFormat = {
    val __obj = js.Dynamic.literal()
    if (fileType != null) __obj.updateDynamic("fileType")(fileType)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution)
    if (targetBitRate != null) __obj.updateDynamic("targetBitRate")(targetBitRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFormat]
  }
}

