package typings
package toastrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastrOptions extends js.Object {
  /**
  	 * Should a close button be shown?
  	 * @default undefined
  	 */
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * CSS class the close button will be given.
  	 * @default toast-close-button
  	 */
  var closeClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Time in milliseconds the toast should take to hide, when the close button is clicked.
  	 * Falls back to hide configuration.
  	 * @default false
  	 */
  var closeDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The animation easing while hiding the toast, when the close button is clicked.
  	 * Falls back to hide configuration.
  	 * swing and linear are built into jQuery.
  	 * @default false
  	 */
  var closeEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Html for the close button.
  	 */
  var closeHtml: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Use the jQuery show/hide method of your choice, when the close button is clicked.
  	 * Falls back to hide configuration.
  	 * The methods fadeIn/fadeOut, slideDown/slideUp, and show/hide are built into jQuery.
  	 * @default false
  	 */
  var closeMethod: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set to false so that the toast hides event if hovered.
  	 * @default true
  	 */
  var closeOnHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Id toast container will be given.
  	 * @default toast-container
  	 */
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Should debug details be outputted to the console?
  	 * @default false
  	 */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Should the title and message text be escaped?
  	 * @default false
  	 */
  var escapeHtml: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Time in milliseconds the toast should be displayed after leaving mouse over.
  	 * Set timeOut and extendedTimeOut to 0 to make it sticky.
  	 * @default 1000
  	 */
  var extendedTimeOut: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Time in milliseconds the toast should take to hide.
  	 * @default 1000
  	 */
  var hideDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Optionally override the animation easing to show or hide the toasts.
  	 * swing and linear are built into jQuery.
  	 * @default swing
  	 */
  var hideEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Use the jQuery hide method of your choice.
  	 * The methods fadeIn/fadeOut, slideDown/slideUp, and show/hide are built into jQuery.
  	 * @default fadeOut
  	 */
  var hideMethod: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Icon to use for toast.
  	 * @default toast-info
  	 */
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * If specified, you must provide all classes.
  	 */
  var iconClasses: js.UndefOr[Anon_Error] = js.undefined
  /**
  	 * CSS class the message element will be given.
  	 * @default toast-message
  	 */
  var messageClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set newest toast to appear on top.
  	 * @default true
  	 */
  var newestOnTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * onCloseClick function callback, fired when the close button is clicked.
  	 * Closing cannot be prevented by ev.stopPropagation() etc.
  	 * @default undefined
  	 */
  var onCloseClick: js.UndefOr[js.Function1[/* ev */ jqueryLib.JQueryMouseEventObject, scala.Unit]] = js.undefined
  /**
  	 * onHidden function callback.
  	 * @default undefined
  	 */
  var onHidden: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  	 * onShown function callback.
  	 * @default undefined
  	 */
  var onShown: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  	 * Function to execute on toast click. Closing cannot be prevented by ev.stopPropagation() etc.
  	 * @default undefined
  	 */
  var onclick: js.UndefOr[js.Function1[/* ev */ jqueryLib.JQueryMouseEventObject, scala.Unit]] = js.undefined
  /**
  	 * Where toast should be displayed.
  	 * The default stylesheet covers:
  	 * toast-top-left, toast-top-center, toast-top-right, toast-top-full-width,
  	 * toast-bottom-left, toast-bottom-center, toast-bottom-right, toast-bottom-full-width
  	 * @default toast-top-right
  	 */
  var positionClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Rather than having identical toasts stack, set the preventDuplicates property to true.
  	 * Duplicates are matched to the previous toast based on their message content.
  	 * @default false
  	 */
  var preventDuplicates: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Visually indicates how long before a toast expires.
  	 * @default false
  	 */
  var progressBar: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * CSS class the progressbar element will be given.
  	 * @default toast-progress
  	 */
  var progressClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Flip the toastr to be displayed properly for right-to-left languages.
  	 * @default false
  	 */
  var rtl: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Time in milliseconds the toast should take to show.
  	 * @default 300
  	 */
  var showDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Optionally override the animation easing to show or hide the toasts.
  	 * swing and linear are built into jQuery.
  	 * @default swing
  	 */
  var showEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Use the jQuery show method of your choice.
  	 * The methods fadeIn/fadeOut, slideDown/slideUp, and show/hide are built into jQuery.
  	 * @default fadeIn
  	 */
  var showMethod: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Should clicking on toast dismiss it?
  	 * @default true
  	 */
  var tapToDismiss: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The element to put the toastr container
  	 * @default body
  	 */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Time in milliseconds that the toast should be displayed.
  	 * Set timeOut and extendedTimeOut to 0 to make it sticky.
  	 * @default 5000
  	 */
  var timeOut: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * CSS class the title element will be given.
  	 * @default toast-title
  	 */
  var titleClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * CSS class the toast element will be given.
  	 * @default toast
  	 */
  var toastClass: js.UndefOr[java.lang.String] = js.undefined
}

object ToastrOptions {
  @scala.inline
  def apply(
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    closeClass: java.lang.String = null,
    closeDuration: scala.Int | scala.Double = null,
    closeEasing: java.lang.String = null,
    closeHtml: java.lang.String = null,
    closeMethod: java.lang.String = null,
    closeOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    containerId: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    escapeHtml: js.UndefOr[scala.Boolean] = js.undefined,
    extendedTimeOut: scala.Int | scala.Double = null,
    hideDuration: scala.Int | scala.Double = null,
    hideEasing: java.lang.String = null,
    hideMethod: java.lang.String = null,
    iconClass: java.lang.String = null,
    iconClasses: Anon_Error = null,
    messageClass: java.lang.String = null,
    newestOnTop: js.UndefOr[scala.Boolean] = js.undefined,
    onCloseClick: js.Function1[/* ev */ jqueryLib.JQueryMouseEventObject, scala.Unit] = null,
    onHidden: js.Function0[scala.Unit] = null,
    onShown: js.Function0[scala.Unit] = null,
    onclick: js.Function1[/* ev */ jqueryLib.JQueryMouseEventObject, scala.Unit] = null,
    positionClass: java.lang.String = null,
    preventDuplicates: js.UndefOr[scala.Boolean] = js.undefined,
    progressBar: js.UndefOr[scala.Boolean] = js.undefined,
    progressClass: java.lang.String = null,
    rtl: js.UndefOr[scala.Boolean] = js.undefined,
    showDuration: scala.Int | scala.Double = null,
    showEasing: java.lang.String = null,
    showMethod: java.lang.String = null,
    tapToDismiss: js.UndefOr[scala.Boolean] = js.undefined,
    target: java.lang.String = null,
    timeOut: scala.Int | scala.Double = null,
    titleClass: java.lang.String = null,
    toastClass: java.lang.String = null
  ): ToastrOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (closeClass != null) __obj.updateDynamic("closeClass")(closeClass)
    if (closeDuration != null) __obj.updateDynamic("closeDuration")(closeDuration.asInstanceOf[js.Any])
    if (closeEasing != null) __obj.updateDynamic("closeEasing")(closeEasing)
    if (closeHtml != null) __obj.updateDynamic("closeHtml")(closeHtml)
    if (closeMethod != null) __obj.updateDynamic("closeMethod")(closeMethod)
    if (!js.isUndefined(closeOnHover)) __obj.updateDynamic("closeOnHover")(closeOnHover)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(escapeHtml)) __obj.updateDynamic("escapeHtml")(escapeHtml)
    if (extendedTimeOut != null) __obj.updateDynamic("extendedTimeOut")(extendedTimeOut.asInstanceOf[js.Any])
    if (hideDuration != null) __obj.updateDynamic("hideDuration")(hideDuration.asInstanceOf[js.Any])
    if (hideEasing != null) __obj.updateDynamic("hideEasing")(hideEasing)
    if (hideMethod != null) __obj.updateDynamic("hideMethod")(hideMethod)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (iconClasses != null) __obj.updateDynamic("iconClasses")(iconClasses)
    if (messageClass != null) __obj.updateDynamic("messageClass")(messageClass)
    if (!js.isUndefined(newestOnTop)) __obj.updateDynamic("newestOnTop")(newestOnTop)
    if (onCloseClick != null) __obj.updateDynamic("onCloseClick")(onCloseClick)
    if (onHidden != null) __obj.updateDynamic("onHidden")(onHidden)
    if (onShown != null) __obj.updateDynamic("onShown")(onShown)
    if (onclick != null) __obj.updateDynamic("onclick")(onclick)
    if (positionClass != null) __obj.updateDynamic("positionClass")(positionClass)
    if (!js.isUndefined(preventDuplicates)) __obj.updateDynamic("preventDuplicates")(preventDuplicates)
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar)
    if (progressClass != null) __obj.updateDynamic("progressClass")(progressClass)
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (showDuration != null) __obj.updateDynamic("showDuration")(showDuration.asInstanceOf[js.Any])
    if (showEasing != null) __obj.updateDynamic("showEasing")(showEasing)
    if (showMethod != null) __obj.updateDynamic("showMethod")(showMethod)
    if (!js.isUndefined(tapToDismiss)) __obj.updateDynamic("tapToDismiss")(tapToDismiss)
    if (target != null) __obj.updateDynamic("target")(target)
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (titleClass != null) __obj.updateDynamic("titleClass")(titleClass)
    if (toastClass != null) __obj.updateDynamic("toastClass")(toastClass)
    __obj.asInstanceOf[ToastrOptions]
  }
}

