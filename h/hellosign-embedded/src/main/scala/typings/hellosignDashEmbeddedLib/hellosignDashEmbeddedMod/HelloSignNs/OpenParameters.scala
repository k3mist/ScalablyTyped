package typings
package hellosignDashEmbeddedLib.hellosignDashEmbeddedMod.HelloSignNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenParameters extends js.Object {
  /**
    * Whether a cancel button should be displayed
    *
    * @default true
    */
  var allowCancel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * DOM element that will contain the iframe on the page (defaults to document.body)
    */
  var container: js.UndefOr[stdLib.Element] = js.undefined
  /**
    * When true, debugging statements will be written to the console
    *
    * @default false
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Height of the iFrame (only applicable when a container is specified)
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * When true, the header will be hidden.
    * This is only functional for customers with embedded branding enabled.
    *
    * @default false
    */
  var hideHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A listener for X-window messages coming from the child frame
    */
  var messageListener: js.UndefOr[js.Function1[/* eventData */ MessageEvent, scala.Unit]] = js.undefined
  /**
    * Where to go after the signature is completed
    */
  var redirectUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The email of the person issuing a signature request.
    * Required for allowing 'Me + Others' requests
    */
  var requester: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When true, domain verification step will be skipped if and only if the Signature Request was created with test_mode=1
    *
    * @default false
    */
  var skipDomainVerification: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The url to open in the child frame
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * One of the HelloSign.CULTURES.supportedCultures
    *
    * @default HelloSign.CULTURES.EN_US
    */
  var userCulture: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The version of the embedded user experience to display to signers (1 = legacy, 2 = responsive).
    * This option is only honored if your account has accessed the API prior to Nov 14, 2015.
    */
  var uxVersion: js.UndefOr[scala.Double] = js.undefined
  /**
    * An associative array to be used to customize the app's signer page
    */
  var whiteLabelingOptions: js.UndefOr[js.Object] = js.undefined
}

object OpenParameters {
  @scala.inline
  def apply(
    allowCancel: js.UndefOr[scala.Boolean] = js.undefined,
    container: stdLib.Element = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    hideHeader: js.UndefOr[scala.Boolean] = js.undefined,
    messageListener: js.Function1[/* eventData */ MessageEvent, scala.Unit] = null,
    redirectUrl: java.lang.String = null,
    requester: java.lang.String = null,
    skipDomainVerification: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null,
    userCulture: java.lang.String = null,
    uxVersion: scala.Int | scala.Double = null,
    whiteLabelingOptions: js.Object = null
  ): OpenParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCancel)) __obj.updateDynamic("allowCancel")(allowCancel)
    if (container != null) __obj.updateDynamic("container")(container)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideHeader)) __obj.updateDynamic("hideHeader")(hideHeader)
    if (messageListener != null) __obj.updateDynamic("messageListener")(messageListener)
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl)
    if (requester != null) __obj.updateDynamic("requester")(requester)
    if (!js.isUndefined(skipDomainVerification)) __obj.updateDynamic("skipDomainVerification")(skipDomainVerification)
    if (url != null) __obj.updateDynamic("url")(url)
    if (userCulture != null) __obj.updateDynamic("userCulture")(userCulture)
    if (uxVersion != null) __obj.updateDynamic("uxVersion")(uxVersion.asInstanceOf[js.Any])
    if (whiteLabelingOptions != null) __obj.updateDynamic("whiteLabelingOptions")(whiteLabelingOptions)
    __obj.asInstanceOf[OpenParameters]
  }
}

