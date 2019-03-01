package typings
package seamlessLib.SeamlessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If the fallback functionality is enabled.
    * @default false
    */
  var fallback: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Text to add after the fallbackLinkText link.
    * @default 'to open in a separate window.'
    */
  var fallbackLinkAfter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of string styles to add to the fallback link on hover.
    * @default [ 'background-color:#ebebeb', 'border-color:#adadad' ]
    */
  var fallbackLinkHoverStyles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * An array of string styles to add to the fallback link.
    * @default [ 'display: inline-block', 'color: #333', 'border: 1px solid #ccc', 'background-color: #fff', 'padding: 5px 10px', 'text-decoration: none', 'font-size: 12px', 'line-height: 1.5', 'border-radius: 6px', 'font-weight: 400', 'cursor: pointer', '-webkit-user-select: none', '-moz-user-select: none', '-ms-user-select: none', 'user-select: none' ]
    */
  var fallbackLinkStyles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The string to show within the 'Click here' link to open the fallback window.
    * @default 'Click Here'
    */
  var fallbackLinkText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Additional query params to attach to the fallback window when it is opened.
    * @default ''
    */
  var fallbackParams: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of string styles to add to the fallback text when something bad happens.
    * @default [ 'padding: 15px', 'border: 1px solid transparent', 'border-radius: 4px', 'color: #3a87ad', 'background-color: #d9edf7', 'border-color: #bce8f1' ]
    */
  var fallbackStyles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A message to show below the child iframe to offer assistance if they are having problems.
    * @default ''
    */
  var fallbackText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The height of the window that is opened up for the fallback.
    * @default 800
    */
  var fallbackWindowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the window that is opened up for the fallback.
    * @default 960
    */
  var fallbackWindowWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The text to show when the child page is loading.
    * @default 'Loading ...'
    */
  var loading: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Called when a child iframe has finished connecting.
    * @default null
    */
  var onConnect: js.UndefOr[(js.Function1[/* data */ js.Any, scala.Unit]) | scala.Null] = js.undefined
  /**
    * Show or not the loading indicator.
    * @default true
    */
  var showLoadingIndicator: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The url of the spinner GIF that is shown when the child page is loading.
    * @default 'http://www.travistidwell.com/seamless.js/src/loader.gif'
    */
  var spinner: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The styles to inject into the child page.
    * @default []
    */
  var styles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fallback: js.UndefOr[scala.Boolean] = js.undefined,
    fallbackLinkAfter: java.lang.String = null,
    fallbackLinkHoverStyles: js.Array[java.lang.String] = null,
    fallbackLinkStyles: js.Array[java.lang.String] = null,
    fallbackLinkText: java.lang.String = null,
    fallbackParams: java.lang.String = null,
    fallbackStyles: js.Array[java.lang.String] = null,
    fallbackText: java.lang.String = null,
    fallbackWindowHeight: scala.Int | scala.Double = null,
    fallbackWindowWidth: scala.Int | scala.Double = null,
    loading: java.lang.String = null,
    onConnect: js.Function1[/* data */ js.Any, scala.Unit] = null,
    showLoadingIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    spinner: java.lang.String = null,
    styles: js.Array[java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fallback)) __obj.updateDynamic("fallback")(fallback)
    if (fallbackLinkAfter != null) __obj.updateDynamic("fallbackLinkAfter")(fallbackLinkAfter)
    if (fallbackLinkHoverStyles != null) __obj.updateDynamic("fallbackLinkHoverStyles")(fallbackLinkHoverStyles)
    if (fallbackLinkStyles != null) __obj.updateDynamic("fallbackLinkStyles")(fallbackLinkStyles)
    if (fallbackLinkText != null) __obj.updateDynamic("fallbackLinkText")(fallbackLinkText)
    if (fallbackParams != null) __obj.updateDynamic("fallbackParams")(fallbackParams)
    if (fallbackStyles != null) __obj.updateDynamic("fallbackStyles")(fallbackStyles)
    if (fallbackText != null) __obj.updateDynamic("fallbackText")(fallbackText)
    if (fallbackWindowHeight != null) __obj.updateDynamic("fallbackWindowHeight")(fallbackWindowHeight.asInstanceOf[js.Any])
    if (fallbackWindowWidth != null) __obj.updateDynamic("fallbackWindowWidth")(fallbackWindowWidth.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (onConnect != null) __obj.updateDynamic("onConnect")(onConnect)
    if (!js.isUndefined(showLoadingIndicator)) __obj.updateDynamic("showLoadingIndicator")(showLoadingIndicator)
    if (spinner != null) __obj.updateDynamic("spinner")(spinner)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[Options]
  }
}

