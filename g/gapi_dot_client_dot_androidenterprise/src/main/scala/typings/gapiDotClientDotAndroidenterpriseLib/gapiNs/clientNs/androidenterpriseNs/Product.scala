package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  /** App versions currently available for this product. */
  var appVersion: js.UndefOr[js.Array[AppVersion]] = js.undefined
  /** The name of the author of the product (for example, the app developer). */
  var authorName: js.UndefOr[java.lang.String] = js.undefined
  /** The tracks that are visible to the enterprise. */
  var availableTracks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A link to the (consumer) Google Play details page for the product. */
  var detailsUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How and to whom the package is made available. The value publicGoogleHosted means that the package is available through the Play store and not
    * restricted to a specific enterprise. The value privateGoogleHosted means that the package is a private app (restricted to an enterprise) but hosted by
    * Google. The value privateSelfHosted means that the package is a private app (restricted to an enterprise) and is privately hosted.
    */
  var distributionChannel: js.UndefOr[java.lang.String] = js.undefined
  /** A link to an image that can be used as an icon for the product. This image is suitable for use at up to 512px x 512px. */
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#product". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** A string of the form app:<package name>. For example, app:com.google.android.gm represents the Gmail app. */
  var productId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether this product is free, free with in-app purchases, or paid. If the pricing is unknown, this means the product is not generally available anymore
    * (even though it might still be available to people who own it).
    */
  var productPricing: js.UndefOr[java.lang.String] = js.undefined
  /** Deprecated. */
  var requiresContainerApp: js.UndefOr[scala.Boolean] = js.undefined
  /** The certificate used to sign this product. */
  var signingCertificate: js.UndefOr[ProductSigningCertificate] = js.undefined
  /** A link to a smaller image that can be used as an icon for the product. This image is suitable for use at up to 128px x 128px. */
  var smallIconUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the product. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** A link to the managed Google Play details page for the product, for use by an Enterprise admin. */
  var workDetailsUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Product {
  @scala.inline
  def apply(
    appVersion: js.Array[AppVersion] = null,
    authorName: java.lang.String = null,
    availableTracks: js.Array[java.lang.String] = null,
    detailsUrl: java.lang.String = null,
    distributionChannel: java.lang.String = null,
    iconUrl: java.lang.String = null,
    kind: java.lang.String = null,
    productId: java.lang.String = null,
    productPricing: java.lang.String = null,
    requiresContainerApp: js.UndefOr[scala.Boolean] = js.undefined,
    signingCertificate: ProductSigningCertificate = null,
    smallIconUrl: java.lang.String = null,
    title: java.lang.String = null,
    workDetailsUrl: java.lang.String = null
  ): Product = {
    val __obj = js.Dynamic.literal()
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion)
    if (authorName != null) __obj.updateDynamic("authorName")(authorName)
    if (availableTracks != null) __obj.updateDynamic("availableTracks")(availableTracks)
    if (detailsUrl != null) __obj.updateDynamic("detailsUrl")(detailsUrl)
    if (distributionChannel != null) __obj.updateDynamic("distributionChannel")(distributionChannel)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (productPricing != null) __obj.updateDynamic("productPricing")(productPricing)
    if (!js.isUndefined(requiresContainerApp)) __obj.updateDynamic("requiresContainerApp")(requiresContainerApp)
    if (signingCertificate != null) __obj.updateDynamic("signingCertificate")(signingCertificate)
    if (smallIconUrl != null) __obj.updateDynamic("smallIconUrl")(smallIconUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    if (workDetailsUrl != null) __obj.updateDynamic("workDetailsUrl")(workDetailsUrl)
    __obj.asInstanceOf[Product]
  }
}

