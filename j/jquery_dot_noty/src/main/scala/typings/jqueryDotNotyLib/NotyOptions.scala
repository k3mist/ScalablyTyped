package typings
package jqueryDotNotyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotyOptions extends js.Object {
  var animation: js.UndefOr[NotyAnimationOptions] = js.undefined
  /** an array of buttons, for creating confirmation dialogs. */
  var buttons: js.UndefOr[js.Any] = js.undefined
  var callback: js.UndefOr[NotyCallbackOptions] = js.undefined
  /** backdrop click will close all notifications */
  var closeWith: js.UndefOr[
    js.Array[
      jqueryDotNotyLib.jqueryDotNotyLibStrings.click | jqueryDotNotyLib.jqueryDotNotyLibStrings.button | jqueryDotNotyLib.jqueryDotNotyLibStrings.hover | jqueryDotNotyLib.jqueryDotNotyLibStrings.backdrop
    ]
  ] = js.undefined
  /** If you want to use queue feature set this true. */
  var dismissQueue: js.UndefOr[scala.Boolean] = js.undefined
  /** adds notification to the beginning of queue when set to true */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /** if true closes all notifications and shows itself */
  var killer: js.UndefOr[scala.Boolean] = js.undefined
  var layout: js.UndefOr[java.lang.String] = js.undefined
  /** You can set max visible notification for dismissQueue true option */
  var maxVisible: js.UndefOr[scala.Double] = js.undefined
  /** if true adds an overlay */
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  /** displays a progress bar */
  var progressBar: js.UndefOr[scala.Boolean] = js.undefined
  /** The note`s optional template like '<div class="noty_message"><span class="noty_text"></span><div class="noty_close"></div></div>' */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** Text to show. Can be html or string. */
  var text: js.UndefOr[java.lang.String] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /** Delay for closing event. Set false for sticky notifications */
  var timeout: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object NotyOptions {
  @scala.inline
  def apply(
    animation: NotyAnimationOptions = null,
    buttons: js.Any = null,
    callback: NotyCallbackOptions = null,
    closeWith: js.Array[
      jqueryDotNotyLib.jqueryDotNotyLibStrings.click | jqueryDotNotyLib.jqueryDotNotyLibStrings.button | jqueryDotNotyLib.jqueryDotNotyLibStrings.hover | jqueryDotNotyLib.jqueryDotNotyLibStrings.backdrop
    ] = null,
    dismissQueue: js.UndefOr[scala.Boolean] = js.undefined,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    killer: js.UndefOr[scala.Boolean] = js.undefined,
    layout: java.lang.String = null,
    maxVisible: scala.Int | scala.Double = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    progressBar: js.UndefOr[scala.Boolean] = js.undefined,
    template: java.lang.String = null,
    text: java.lang.String = null,
    theme: java.lang.String = null,
    timeout: js.Any = null,
    `type`: java.lang.String = null
  ): NotyOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (closeWith != null) __obj.updateDynamic("closeWith")(closeWith)
    if (!js.isUndefined(dismissQueue)) __obj.updateDynamic("dismissQueue")(dismissQueue)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(killer)) __obj.updateDynamic("killer")(killer)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (maxVisible != null) __obj.updateDynamic("maxVisible")(maxVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar)
    if (template != null) __obj.updateDynamic("template")(template)
    if (text != null) __obj.updateDynamic("text")(text)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NotyOptions]
  }
}

