package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Whether the Box is enabled.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether there is extra space between the children in the Box.
    */
  var padded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the Box arranges its children vertically or horizontally.
    */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the Box and its children can be seen.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object BoxProps {
  @scala.inline
  def apply(
    align: protonDashNativeLib.Anon_H = null,
    column: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    expand: protonDashNativeLib.Anon_H = null,
    label: java.lang.String = null,
    padded: js.UndefOr[scala.Boolean] = js.undefined,
    row: scala.Int | scala.Double = null,
    span: protonDashNativeLib.Anon_X = null,
    stretchy: js.UndefOr[scala.Boolean] = js.undefined,
    vertical: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): BoxProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(padded)) __obj.updateDynamic("padded")(padded)
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span)
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[BoxProps]
  }
}

