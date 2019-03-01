package typings
package lobiboxLib.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyDefault extends js.Object {
                    // Image source string
  var closable: js.UndefOr[scala.Boolean] = js.undefined
         // Show timer indicator
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
    // Set this to true if you want notification not to be shown until previous notification is closed. This is useful for notification queues
  var continueDelayOnInactiveTab: js.UndefOr[scala.Boolean] = js.undefined
               // Make notifications closable
  var delay: js.UndefOr[scala.Double] = js.undefined
                  // Hide notification after this time (in miliseconds)
  var delayIndicator: js.UndefOr[scala.Boolean] = js.undefined
          // Show animation class.
  var hideClass: js.UndefOr[java.lang.String] = js.undefined
         // Hide animation class.
  var icon: js.UndefOr[scala.Boolean] = js.undefined
                      // Message of notification
  var img: js.UndefOr[java.lang.String] = js.undefined
                   // Icon of notification. Leave as is for default icon or set custom string
  var msg: js.UndefOr[java.lang.String] = js.undefined
   // Continue delay when browser tab is inactive
  // Events
  var onClick: js.UndefOr[js.Function] = js.undefined
      // Place to show notification. Available options: "top left", "top right", "bottom left", "bottom right"
  var onClickUrl: js.UndefOr[java.lang.String] = js.undefined
                  // Sound of notification. Set this false to disable sound. Leave as is for default sound or set custom soud path
  var position: js.UndefOr[java.lang.String] = js.undefined
            // The url which will be opened when notification is clicked
  var showAfterPrevious: js.UndefOr[scala.Boolean] = js.undefined
             // Default extension for all sounds
  var showClass: js.UndefOr[java.lang.String] = js.undefined
                  // Title of notification. If you do not include the title in options it will automatically takes its value
  //from Lobibox.notify.OPTIONS object depending of the type of the notifications or set custom string. Set this false to disable title
  var size: js.UndefOr[java.lang.String] = js.undefined
                   // Width of notification box
  var sound: js.UndefOr[scala.Boolean] = js.undefined
     // The folder path where sounds are located
  var soundExt: js.UndefOr[java.lang.String] = js.undefined
               // normal, mini, large
  var soundPath: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
           // Close notifications by clicking on them
  var width: js.UndefOr[scala.Double] = js.undefined
}

object NotifyDefault {
  @scala.inline
  def apply(
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    continueDelayOnInactiveTab: js.UndefOr[scala.Boolean] = js.undefined,
    delay: scala.Int | scala.Double = null,
    delayIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    hideClass: java.lang.String = null,
    icon: js.UndefOr[scala.Boolean] = js.undefined,
    img: java.lang.String = null,
    msg: java.lang.String = null,
    onClick: js.Function = null,
    onClickUrl: java.lang.String = null,
    position: java.lang.String = null,
    showAfterPrevious: js.UndefOr[scala.Boolean] = js.undefined,
    showClass: java.lang.String = null,
    size: java.lang.String = null,
    sound: js.UndefOr[scala.Boolean] = js.undefined,
    soundExt: java.lang.String = null,
    soundPath: java.lang.String = null,
    title: java.lang.String | scala.Boolean = null,
    width: scala.Int | scala.Double = null
  ): NotifyDefault = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (!js.isUndefined(continueDelayOnInactiveTab)) __obj.updateDynamic("continueDelayOnInactiveTab")(continueDelayOnInactiveTab)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(delayIndicator)) __obj.updateDynamic("delayIndicator")(delayIndicator)
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass)
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon)
    if (img != null) __obj.updateDynamic("img")(img)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onClickUrl != null) __obj.updateDynamic("onClickUrl")(onClickUrl)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(showAfterPrevious)) __obj.updateDynamic("showAfterPrevious")(showAfterPrevious)
    if (showClass != null) __obj.updateDynamic("showClass")(showClass)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound)
    if (soundExt != null) __obj.updateDynamic("soundExt")(soundExt)
    if (soundPath != null) __obj.updateDynamic("soundPath")(soundPath)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyDefault]
  }
}

