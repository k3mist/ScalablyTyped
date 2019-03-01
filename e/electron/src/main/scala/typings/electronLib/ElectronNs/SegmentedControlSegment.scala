package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentedControlSegment extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/segmented-control-segment
  /**
    * Whether this segment is selectable. Default: true.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The image to appear in this segment.
    */
  var icon: js.UndefOr[NativeImage] = js.undefined
  /**
    * The text to appear in this segment.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
}

object SegmentedControlSegment {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    icon: NativeImage = null,
    label: java.lang.String = null
  ): SegmentedControlSegment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[SegmentedControlSegment]
  }
}

