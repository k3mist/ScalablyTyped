package typings
package jqueryDotPnotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNotifyOptions extends js.Object {
  /**
    * Additional classes to be added to the notice. (For custom styling.)
    */
  var addclass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Speed at which the notice animates in and out. "slow", "def" or "normal", "fast" or number of milliseconds.
    */
  var animate_speed: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The animation to use when displaying and hiding the notice. "none" and "fade" are supported through CSS. 
    * Others are supported through the Animate module and Animate.css.
    */ 
  var animation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Display the notice when it is created. Turn this off to add notifications to the history without displaying them.
    */
  var auto_display: js.UndefOr[scala.Boolean] = js.undefined
  var buttons: js.UndefOr[Anon_CloserCloserhover] = js.undefined
  /**
    * Support for PNotifyconfirm options
    */
  var confirm: js.UndefOr[PNotifyconfirm] = js.undefined
  /**
    * Class to be added to the notice for corner styling.
    */
  var cornerclass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Delay in milliseconds before the notice is removed.
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * After a delay, remove the notice, set to false for sticky note.
    */
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Display a pull down menu to redisplay previous notices, and place the notice in the history.
    */
  var history: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set icon to true to use the default icon for the selected style/type, false for no icon, or a string for your own icon class.
    */
  var icon: js.UndefOr[js.Any] = js.undefined
  /**
    * Change new lines to br tags.
    */
  var insert_brs: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The various displayed text, helps facilitating internationalization.
    */
  var labels: js.UndefOr[PNotifyLabel] = js.undefined
  /**
    * Maximum number of notifications to have onscreen.
    */
  var maxonscreen: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum height of the notice. It will expand to fit content.
    */
  var min_height: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Reset the hide timer if the mouse moves over the notice.
    */
  var mouse_reset: js.UndefOr[scala.Boolean] = js.undefined
  var nonblock: js.UndefOr[Anon_Nonblock] = js.undefined
  /**
    * Opacity of the notice.
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify a specific duration of position animation
    */
  var position_animate_speed: js.UndefOr[scala.Double] = js.undefined
  /**
    * Remove the notice's elements from the DOM after it is removed.
    */
  var remove: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Display a drop shadow.
    */
  var shadow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The stack on which the notices will be placed. Also controls the direction the notices stack.
    */
  var stack: js.UndefOr[PNotifyStack] = js.undefined
  /**
    * What styling classes to use. (Can be either "brighttheme", "jqueryui", "bootstrap2", "bootstrap3", "fontawesome" or a custom style object)
    */
  var styling: js.UndefOr[StylingOptions] = js.undefined
  /**
    * The notice's text. Either boolean false or string
    */
  var text: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * Whether to escape the content of the text. (Not allow HTML.)
    */
  var text_escape: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The notice's title. Either boolean false or string
    */
  var title: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * Whether to escape the content of the title. (Not allow HTML.)
    */
  var title_escape: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Type of the notice. "notice", "info", "success", or "error".
    */
  var `type`: js.UndefOr[NoticeTypeOptions] = js.undefined
  /**
    * Width of the notice.
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object PNotifyOptions {
  @scala.inline
  def apply(
    addclass: java.lang.String = null,
    animate_speed: java.lang.String = null,
    animation: java.lang.String = null,
    auto_display: js.UndefOr[scala.Boolean] = js.undefined,
    buttons: Anon_CloserCloserhover = null,
    confirm: PNotifyconfirm = null,
    cornerclass: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    hide: js.UndefOr[scala.Boolean] = js.undefined,
    history: js.UndefOr[scala.Boolean] = js.undefined,
    icon: js.Any = null,
    insert_brs: js.UndefOr[scala.Boolean] = js.undefined,
    labels: PNotifyLabel = null,
    maxonscreen: scala.Int | scala.Double = null,
    min_height: java.lang.String = null,
    mouse_reset: js.UndefOr[scala.Boolean] = js.undefined,
    nonblock: Anon_Nonblock = null,
    opacity: scala.Int | scala.Double = null,
    position_animate_speed: scala.Int | scala.Double = null,
    remove: js.UndefOr[scala.Boolean] = js.undefined,
    shadow: js.UndefOr[scala.Boolean] = js.undefined,
    stack: PNotifyStack = null,
    styling: StylingOptions = null,
    text: java.lang.String | scala.Boolean = null,
    text_escape: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String | scala.Boolean = null,
    title_escape: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: NoticeTypeOptions = null,
    width: java.lang.String = null
  ): PNotifyOptions = {
    val __obj = js.Dynamic.literal()
    if (addclass != null) __obj.updateDynamic("addclass")(addclass)
    if (animate_speed != null) __obj.updateDynamic("animate_speed")(animate_speed)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(auto_display)) __obj.updateDynamic("auto_display")(auto_display)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (confirm != null) __obj.updateDynamic("confirm")(confirm)
    if (cornerclass != null) __obj.updateDynamic("cornerclass")(cornerclass)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide)
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(insert_brs)) __obj.updateDynamic("insert_brs")(insert_brs)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (maxonscreen != null) __obj.updateDynamic("maxonscreen")(maxonscreen.asInstanceOf[js.Any])
    if (min_height != null) __obj.updateDynamic("min_height")(min_height)
    if (!js.isUndefined(mouse_reset)) __obj.updateDynamic("mouse_reset")(mouse_reset)
    if (nonblock != null) __obj.updateDynamic("nonblock")(nonblock)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (position_animate_speed != null) __obj.updateDynamic("position_animate_speed")(position_animate_speed.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (styling != null) __obj.updateDynamic("styling")(styling)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(text_escape)) __obj.updateDynamic("text_escape")(text_escape)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(title_escape)) __obj.updateDynamic("title_escape")(title_escape)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PNotifyOptions]
  }
}

