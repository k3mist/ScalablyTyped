package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeInput extends js.Object {
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var variantId: js.UndefOr[java.lang.String] = js.undefined
}

object AttributeInput {
  @scala.inline
  def apply(
    id: java.lang.String | scala.Double = null,
    key: java.lang.String = null,
    quantity: scala.Int | scala.Double = null,
    value: java.lang.String = null,
    variantId: java.lang.String = null
  ): AttributeInput = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (variantId != null) __obj.updateDynamic("variantId")(variantId)
    __obj.asInstanceOf[AttributeInput]
  }
}

