package typings
package gapiDotClientDotManufacturersLib.gapiNs.clientNs.manufacturersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  /**
    * The content language of the product as a two-letter ISO 639-1 language code
    * (for example, en).
    * @OutputOnly
    */
  var contentLanguage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Final attributes of the product. The final attributes are obtained by
    * overriding the uploaded attributes with the manually provided and deleted
    * attributes. Google systems only process, evaluate, review, and/or use final
    * attributes.
    * @OutputOnly
    */
  var finalAttributes: js.UndefOr[Attributes] = js.undefined
  /**
    * A server-generated list of issues associated with the product.
    * @OutputOnly
    */
  var issues: js.UndefOr[js.Array[Issue]] = js.undefined
  /**
    * Names of the attributes of the product deleted manually via the
    * Manufacturer Center UI.
    * @OutputOnly
    */
  var manuallyDeletedAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Attributes of the product provided manually via the Manufacturer Center UI.
    * @OutputOnly
    */
  var manuallyProvidedAttributes: js.UndefOr[Attributes] = js.undefined
  /**
    * Name in the format `{target_country}:{content_language}:{product_id}`.
    *
    * `target_country`   - The target country of the product as a CLDR territory
    * code (for example, US).
    *
    * `content_language` - The content language of the product as a two-letter
    * ISO 639-1 language code (for example, en).
    *
    * `product_id`     -   The ID of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    * @OutputOnly
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Parent ID in the format `accounts/{account_id}`.
    *
    * `account_id` - The ID of the Manufacturer Center account.
    * @OutputOnly
    */
  var parent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    * @OutputOnly
    */
  var productId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The target country of the product as a CLDR territory code (for example,
    * US).
    * @OutputOnly
    */
  var targetCountry: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Attributes of the product uploaded via the Manufacturer Center API or via
    * feeds.
    */
  var uploadedAttributes: js.UndefOr[Attributes] = js.undefined
}

object Product {
  @scala.inline
  def apply(
    contentLanguage: java.lang.String = null,
    finalAttributes: Attributes = null,
    issues: js.Array[Issue] = null,
    manuallyDeletedAttributes: js.Array[java.lang.String] = null,
    manuallyProvidedAttributes: Attributes = null,
    name: java.lang.String = null,
    parent: java.lang.String = null,
    productId: java.lang.String = null,
    targetCountry: java.lang.String = null,
    uploadedAttributes: Attributes = null
  ): Product = {
    val __obj = js.Dynamic.literal()
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (finalAttributes != null) __obj.updateDynamic("finalAttributes")(finalAttributes)
    if (issues != null) __obj.updateDynamic("issues")(issues)
    if (manuallyDeletedAttributes != null) __obj.updateDynamic("manuallyDeletedAttributes")(manuallyDeletedAttributes)
    if (manuallyProvidedAttributes != null) __obj.updateDynamic("manuallyProvidedAttributes")(manuallyProvidedAttributes)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (targetCountry != null) __obj.updateDynamic("targetCountry")(targetCountry)
    if (uploadedAttributes != null) __obj.updateDynamic("uploadedAttributes")(uploadedAttributes)
    __obj.asInstanceOf[Product]
  }
}

