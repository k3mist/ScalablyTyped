package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgNotifier
  extends /**
	 * Option for igNotifier
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Allows setting the respective state CSS on the target element (used to apply border color by default)
  	 *
  	 */
  var allowCSSOnTarget: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets the time in milliseconds the notification fades in and out when showing/hiding
  	 *
  	 */
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets the distance in pixels a notification popover slides outwards as it's shown.
  	 *
  	 */
  var animationSlideDistance: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Controls where the popover DOM should be attached to (only applies to popovers).
  	 *
  	 *
  	 * Valid values:
  	 * "string" A valid jQuery selector for the element
  	 * "object" A reference to the parent jQuery object
  	 */
  var appendTo: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Controls whether the popover will close on blur or not. This option has effect only when the corresponding [showOn](ui.ignotifier#options:showOn) is set (manual by default)
  	 *
  	 */
  var closeOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets the containment for the popover. Accepts a jQuery object
  	 *
  	 */
  var containment: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets the content for the popover container. Templated with parameters by default: {0} - icon container class, {1} - the icon class and {2} - message text.
  	 *
  	 *
  	 * Valid values:
  	 * "string" String content of the popover container
  	 * "function" Function which is a callback that should return the content. Use the 'this' value to access the target DOM element and passed argument for state value. Result can also include the same template parametes.
  	 */
  var contentTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  /**
  	 * controls the direction in which the control shows relative to the target element
  	 *
  	 *
  	 * Valid values:
  	 * "auto" lets the control show on the side where enough space is available with the priority specified by the [directionPriority](ui.%%WidgetNameLowered%%#options:directionPriority) property
  	 * "left" shows popover on the left side of the target element
  	 * "right" shows popover on the right side of the target element
  	 * "top" shows popover on the top of the target element
  	 * "bottom" shows popover on the bottom of the target element
  	 */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Controls the priority in which the control searches for space to show relative to the target element.
  	 * This property has effect only if the [direction](ui.%%WidgetNameLowered%%#options:direction) property value is "auto" or unset.
  	 *
  	 */
  var directionPriority: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Sets the content for the popover header
  	 *
  	 */
  var headerTemplate: js.UndefOr[IgNotifierHeaderTemplate] = js.undefined
  /**
  	 * defines height for the popover. leave null for auto
  	 *
  	 */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * Event fired after popover is hidden.
  	 */
  var hidden: js.UndefOr[HiddenEvent] = js.undefined
  /**
  	 * Event fired before popover is hidden.
  	 */
  var hiding: js.UndefOr[HidingEvent] = js.undefined
  /**
  	 * defines height the popover won't exceed even if no specific one is set.
  	 *
  	 */
  var maxHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * defines width the popover won't exceed even if no specific one is set.
  	 *
  	 */
  var maxWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * defines width the popover won't go under the value even if no specific one is set.
  	 *
  	 */
  var minWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * Controls the positioning mode of messages. Setting a mode will override the default behavior which is auto.Note: Inline element uses a block container as is always placed after the target.
  	 *
  	 *
  	 * Valid values:
  	 * "auto" Uses popover for info and warning messages and inline for errors and success.
  	 * "popover" Displays messages in a configurable popover.
  	 * "inline" Displays messages in a simplified notification text under the target.
  	 */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Controls the level of notifications shown by automatic and manual messages using the [notify](ui.ignotifier#methods:notify) method. Use [show](ui.ignotifier#methods:show) to ignore the level.
  	 *
  	 *
  	 * Valid values:
  	 * "success" Show all types of messages
  	 * "info" Show everything from info level messages up
  	 * "warning" Show everything from warning level messages up
  	 * "error" Show only error messages
  	 */
  var notifyLevel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * controls the position of the popover according to the target element in case the popover is larger than the target on the side we want to position, if the popover is smaller it should always be in the middle of the visible area
  	 *
  	 *
  	 * Valid values:
  	 * "auto" lets the control choose a position depending on available space with the following priority balanced > end > start
  	 * "balanced" the popover is positioned at the middle of the target element
  	 * "start" the popover is positioned at the beginning of the target element
  	 * "end" the popover is positioned at the end of the target element
  	 */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Selectors indicating which items should show popovers.
  	 */
  var selectors: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Allows rendering a span with the respective state CSS to display jQuery UI framework icons
  	 *
  	 */
  var showIcon: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets the event on which the notification will be shown. Predefined values are "mouseenter", "click" and "focus"
  	 *
  	 *
  	 * Valid values:
  	 * "mouseenter" The popover is shown on mouse enter in the target element
  	 * "click" The popover is shown on click on the target element
  	 * "focus" The popover is shown on focusing the target element
  	 * "manual" The popover is shown manually
  	 */
  var showOn: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event fired before popover is shown.
  	 */
  var showing: js.UndefOr[ShowingEvent] = js.undefined
  /**
  	 * Event fired after popover is shown.
  	 */
  var shown: js.UndefOr[ShownEvent] = js.undefined
  /**
  	 * Gets/Sets the current state of the igNotifier messages. State controls what CSS classes are applied to the messages and target and has interactions with other options as well.
  	 *
  	 *
  	 * Valid values:
  	 * "success" Messages and target CSS have success styles applied.
  	 * "info" Messages have info applied. Target is unaffected.
  	 * "warning" Messages and target CSS have warning styles applied.
  	 * "error" Messages and target CSS have error styles applied.
  	 */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * defines width for the popover. leave null for auto.
  	 *
  	 */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object IgNotifier {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igNotifier
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    allowCSSOnTarget: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    animationSlideDistance: scala.Int | scala.Double = null,
    appendTo: java.lang.String | js.Object = null,
    closeOnBlur: js.UndefOr[scala.Boolean] = js.undefined,
    containment: js.Any = null,
    contentTemplate: java.lang.String | js.Function = null,
    direction: java.lang.String = null,
    directionPriority: js.Array[_] = null,
    headerTemplate: IgNotifierHeaderTemplate = null,
    height: scala.Double | java.lang.String = null,
    hidden: HiddenEvent = null,
    hiding: HidingEvent = null,
    maxHeight: scala.Double | java.lang.String = null,
    maxWidth: scala.Double | java.lang.String = null,
    minWidth: scala.Double | java.lang.String = null,
    mode: java.lang.String = null,
    notifyLevel: java.lang.String = null,
    position: java.lang.String = null,
    selectors: java.lang.String = null,
    showIcon: js.UndefOr[scala.Boolean] = js.undefined,
    showOn: java.lang.String = null,
    showing: ShowingEvent = null,
    shown: ShownEvent = null,
    state: java.lang.String = null,
    width: scala.Double | java.lang.String = null
  ): IgNotifier = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowCSSOnTarget)) __obj.updateDynamic("allowCSSOnTarget")(allowCSSOnTarget)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationSlideDistance != null) __obj.updateDynamic("animationSlideDistance")(animationSlideDistance.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnBlur)) __obj.updateDynamic("closeOnBlur")(closeOnBlur)
    if (containment != null) __obj.updateDynamic("containment")(containment)
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (directionPriority != null) __obj.updateDynamic("directionPriority")(directionPriority)
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (hiding != null) __obj.updateDynamic("hiding")(hiding)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (notifyLevel != null) __obj.updateDynamic("notifyLevel")(notifyLevel)
    if (position != null) __obj.updateDynamic("position")(position)
    if (selectors != null) __obj.updateDynamic("selectors")(selectors)
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon)
    if (showOn != null) __obj.updateDynamic("showOn")(showOn)
    if (showing != null) __obj.updateDynamic("showing")(showing)
    if (shown != null) __obj.updateDynamic("shown")(shown)
    if (state != null) __obj.updateDynamic("state")(state)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgNotifier]
  }
}

