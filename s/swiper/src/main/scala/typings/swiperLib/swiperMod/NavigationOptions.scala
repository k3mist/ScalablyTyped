package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationOptions extends js.Object {
  /**
    * CSS class name added to navigation button when it becomes disabled
    *
    * @default 'swiper-button-disabled'
    */
  var disabledClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSS class name added to navigation button when it becomes hidden
    *
    * @default 'swiper-button-hidden'
    */
  var hiddenClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * buttons visibility after click on Slider's container
    *
    * @default false Toggle navigation
    */
  var hideOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * String with CSS selector or HTML element of the element that will work
    * like "next" button after click on it
    *
    * @default null
    */
  var nextEl: js.UndefOr[SelectableElement] = js.undefined
  /**
    * String with CSS selector or HTML element of the element that will work
    * like "prev" button after click on it
    *
    * @default null
    */
  var prevEl: js.UndefOr[SelectableElement] = js.undefined
}

object NavigationOptions {
  @scala.inline
  def apply(
    disabledClass: java.lang.String = null,
    hiddenClass: java.lang.String = null,
    hideOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    nextEl: SelectableElement = null,
    prevEl: SelectableElement = null
  ): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (disabledClass != null) __obj.updateDynamic("disabledClass")(disabledClass)
    if (hiddenClass != null) __obj.updateDynamic("hiddenClass")(hiddenClass)
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick)
    if (nextEl != null) __obj.updateDynamic("nextEl")(nextEl.asInstanceOf[js.Any])
    if (prevEl != null) __obj.updateDynamic("prevEl")(prevEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOptions]
  }
}

