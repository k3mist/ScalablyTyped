package typings
package reactDashTooltipLib.reactDashTooltipMod.ReactTooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Available data-* attributes to be used by a tooltip, this interface isn't used by ReactTooltip itself as any
  * data-* attribute can exist on a JSX element without type checking, but it at least be useful for developers
  * to ensure they're using attributes which ReactTooltip support
  */
trait DataProps extends js.Object {
  var `data-border`: js.UndefOr[scala.Boolean] = js.undefined
  var `data-class`: js.UndefOr[java.lang.String] = js.undefined
  var `data-delay-hide`: js.UndefOr[scala.Double] = js.undefined
  var `data-delay-show`: js.UndefOr[scala.Double] = js.undefined
  var `data-effect`: js.UndefOr[Effect] = js.undefined
  var `data-event`: js.UndefOr[ElementEvents] = js.undefined
  var `data-event-off`: js.UndefOr[ElementEvents] = js.undefined
  var `data-html`: js.UndefOr[scala.Boolean] = js.undefined
  var `data-iscapture`: js.UndefOr[scala.Boolean] = js.undefined
  var `data-multiline`: js.UndefOr[scala.Boolean] = js.undefined
  var `data-offset`: js.UndefOr[Offset] = js.undefined
  var `data-place`: js.UndefOr[Place] = js.undefined
  var `data-scroll-hide`: js.UndefOr[scala.Boolean] = js.undefined
  var `data-tip-disable`: js.UndefOr[scala.Boolean] = js.undefined
  var `data-type`: js.UndefOr[Type] = js.undefined
}

object DataProps {
  @scala.inline
  def apply(
    `data-border`: js.UndefOr[scala.Boolean] = js.undefined,
    `data-class`: java.lang.String = null,
    `data-delay-hide`: scala.Int | scala.Double = null,
    `data-delay-show`: scala.Int | scala.Double = null,
    `data-effect`: Effect = null,
    `data-event`: ElementEvents = null,
    `data-event-off`: ElementEvents = null,
    `data-html`: js.UndefOr[scala.Boolean] = js.undefined,
    `data-iscapture`: js.UndefOr[scala.Boolean] = js.undefined,
    `data-multiline`: js.UndefOr[scala.Boolean] = js.undefined,
    `data-offset`: Offset = null,
    `data-place`: Place = null,
    `data-scroll-hide`: js.UndefOr[scala.Boolean] = js.undefined,
    `data-tip-disable`: js.UndefOr[scala.Boolean] = js.undefined,
    `data-type`: Type = null
  ): DataProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`data-border`)) __obj.updateDynamic("data-border")(`data-border`)
    if (`data-class` != null) __obj.updateDynamic("data-class")(`data-class`)
    if (`data-delay-hide` != null) __obj.updateDynamic("data-delay-hide")(`data-delay-hide`.asInstanceOf[js.Any])
    if (`data-delay-show` != null) __obj.updateDynamic("data-delay-show")(`data-delay-show`.asInstanceOf[js.Any])
    if (`data-effect` != null) __obj.updateDynamic("data-effect")(`data-effect`)
    if (`data-event` != null) __obj.updateDynamic("data-event")(`data-event`)
    if (`data-event-off` != null) __obj.updateDynamic("data-event-off")(`data-event-off`)
    if (!js.isUndefined(`data-html`)) __obj.updateDynamic("data-html")(`data-html`)
    if (!js.isUndefined(`data-iscapture`)) __obj.updateDynamic("data-iscapture")(`data-iscapture`)
    if (!js.isUndefined(`data-multiline`)) __obj.updateDynamic("data-multiline")(`data-multiline`)
    if (`data-offset` != null) __obj.updateDynamic("data-offset")(`data-offset`)
    if (`data-place` != null) __obj.updateDynamic("data-place")(`data-place`)
    if (!js.isUndefined(`data-scroll-hide`)) __obj.updateDynamic("data-scroll-hide")(`data-scroll-hide`)
    if (!js.isUndefined(`data-tip-disable`)) __obj.updateDynamic("data-tip-disable")(`data-tip-disable`)
    if (`data-type` != null) __obj.updateDynamic("data-type")(`data-type`)
    __obj.asInstanceOf[DataProps]
  }
}

