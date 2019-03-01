package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserInfo extends js.Object {
  var isChrome: js.UndefOr[scala.Boolean] = js.undefined
  /*These are true when the browser is the indicated one, and false otherwise.*/
  var isFirefox: js.UndefOr[scala.Boolean] = js.undefined
  var isKonqueror: js.UndefOr[scala.Boolean] = js.undefined
  var isMSIE: js.UndefOr[scala.Boolean] = js.undefined
  /*These are boolean values that indicate whether the browser is running on a Macintosh computer or a Windows
    * computer. They will both be false for a Linux computer.
    */
  var isMac: js.UndefOr[scala.Boolean] = js.undefined
  /*This is true when MathJax is running a mobile version of a WebKit or Gecko-based browser.*/
  var isMobile: js.UndefOr[scala.Boolean] = js.undefined
  var isOpera: js.UndefOr[scala.Boolean] = js.undefined
  var isPC: js.UndefOr[scala.Boolean] = js.undefined
  var isSafari: js.UndefOr[scala.Boolean] = js.undefined
  /*The browser version number, e.g., "4.0"*/
  var version: java.lang.String
  /* This lets you perform browser-specific functions. Here, choices is an object whose properties are the names of the browsers and whose values are the functions to be performed. Each function is passed one parameter, which is the MathJax.Hub.Browser object. You do not need to include every browser as one of your choices — only those for which you need to do special processing. For example:
    *MathJax.Hub.Browser.Select({
    *    MSIE: function (browser) {
    *    if (browser.versionAtLeast("8.0")) {... do version 8 stuff ... }
    *        ... do general MSIE stuff ...
    *    },
    *    Firefox: function (browser) {
    *    if (browser.isMac) {... do Mac stuff ... }
    *        ... do general Firefox stuff
    *    }
    *});*/
  def Select(choices: js.Any): scala.Unit
  /*This tests whether the browser version is at least that given in the version string. Note that you can not
    * simply do a numeric comparison, as version 4.10 should be considered later than 4.9, for example. Similarly,
    * 4.10 is different from 4.1, for instance.*/
  def versionAtLeast(version: java.lang.String): scala.Unit
}

object BrowserInfo {
  @scala.inline
  def apply(
    Select: js.Function1[js.Any, scala.Unit],
    version: java.lang.String,
    versionAtLeast: js.Function1[java.lang.String, scala.Unit],
    isChrome: js.UndefOr[scala.Boolean] = js.undefined,
    isFirefox: js.UndefOr[scala.Boolean] = js.undefined,
    isKonqueror: js.UndefOr[scala.Boolean] = js.undefined,
    isMSIE: js.UndefOr[scala.Boolean] = js.undefined,
    isMac: js.UndefOr[scala.Boolean] = js.undefined,
    isMobile: js.UndefOr[scala.Boolean] = js.undefined,
    isOpera: js.UndefOr[scala.Boolean] = js.undefined,
    isPC: js.UndefOr[scala.Boolean] = js.undefined,
    isSafari: js.UndefOr[scala.Boolean] = js.undefined
  ): BrowserInfo = {
    val __obj = js.Dynamic.literal(Select = Select, version = version, versionAtLeast = versionAtLeast)
    if (!js.isUndefined(isChrome)) __obj.updateDynamic("isChrome")(isChrome)
    if (!js.isUndefined(isFirefox)) __obj.updateDynamic("isFirefox")(isFirefox)
    if (!js.isUndefined(isKonqueror)) __obj.updateDynamic("isKonqueror")(isKonqueror)
    if (!js.isUndefined(isMSIE)) __obj.updateDynamic("isMSIE")(isMSIE)
    if (!js.isUndefined(isMac)) __obj.updateDynamic("isMac")(isMac)
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile)
    if (!js.isUndefined(isOpera)) __obj.updateDynamic("isOpera")(isOpera)
    if (!js.isUndefined(isPC)) __obj.updateDynamic("isPC")(isPC)
    if (!js.isUndefined(isSafari)) __obj.updateDynamic("isSafari")(isSafari)
    __obj.asInstanceOf[BrowserInfo]
  }
}

