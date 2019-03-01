package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselOption extends js.Object {
  /**
    * The amount of time to delay between automatically cycling an item. If false, carousel will not automatically cycle.
    *
    * @default 5000
    */
  var interval: js.UndefOr[bootstrapLib.bootstrapLibNumbers.`false` | scala.Double] = js.undefined
  /**
    * Whether the carousel should react to keyboard events.
    *
    * @default true
    */
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to "hover", pauses the cycling of the carousel on `mouseenter` and resumes the cycling of the carousel on `mouseleave`.
    * If set to false, hovering over the carousel won't pause it.
    *
    * On touch-enabled devices, when set to "hover", cycling will pause on `touchend` (once the user finished interacting with the carousel)
    * for two intervals, before automatically resuming. Note that this is in addition to the above mouse behavior.
    *
    * @default "hover"
    */
  var pause: js.UndefOr[
    bootstrapLib.bootstrapLibStrings.hover | bootstrapLib.bootstrapLibNumbers.`false`
  ] = js.undefined
  /**
    * Use to easily control the position of the carousel. It accepts the keywords prev or next, which alters the slide position
    * relative to its current position. Alternatively, use `data-slide-to` to pass a raw slide index to the carousel.
    *
    * @default false
    */
  var slide: js.UndefOr[
    bootstrapLib.bootstrapLibStrings.next | bootstrapLib.bootstrapLibStrings.prev | bootstrapLib.bootstrapLibNumbers.`false`
  ] = js.undefined
  /**
    * Whether the carousel should support left/right swipe interactions on touchscreen devices.
    *
    * @default true
    */
  var touch: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the carousel should cycle continuously or have hard stops.
    *
    * @default true
    */
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
}

object CarouselOption {
  @scala.inline
  def apply(
    interval: bootstrapLib.bootstrapLibNumbers.`false` | scala.Double = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    pause: bootstrapLib.bootstrapLibStrings.hover | bootstrapLib.bootstrapLibNumbers.`false` = null,
    slide: bootstrapLib.bootstrapLibStrings.next | bootstrapLib.bootstrapLibStrings.prev | bootstrapLib.bootstrapLibNumbers.`false` = null,
    touch: js.UndefOr[scala.Boolean] = js.undefined,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): CarouselOption = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (pause != null) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(slide.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[CarouselOption]
  }
}

