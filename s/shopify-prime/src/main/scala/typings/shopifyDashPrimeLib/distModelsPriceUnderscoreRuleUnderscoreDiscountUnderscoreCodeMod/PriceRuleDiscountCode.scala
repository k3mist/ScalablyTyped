package typings
package shopifyDashPrimeLib.distModelsPriceUnderscoreRuleUnderscoreDiscountUnderscoreCodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriceRuleDiscountCode
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The case-insensitive discount code that customers use at checkout. Required
    * when creating a discount. Maximum length of 255 characters.
    */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /**
    * By default, this auto-generated property is the date and time when the price rule was
    * created in Shopify, in ISO 8601 format.
    */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The unique identifier for the price rule associated to the discount code.
    */
  var price_rule_id: js.UndefOr[scala.Double] = js.undefined
  /**
    * The date and time the discount code was updated.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The discount code usage count. Note that the usage limit is set on the price rule.
    */
  var usage_count: js.UndefOr[scala.Double] = js.undefined
}

object PriceRuleDiscountCode {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    code: java.lang.String = null,
    created_at: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    price_rule_id: scala.Int | scala.Double = null,
    updated_at: java.lang.String = null,
    usage_count: scala.Int | scala.Double = null
  ): PriceRuleDiscountCode = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (code != null) __obj.updateDynamic("code")(code)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (price_rule_id != null) __obj.updateDynamic("price_rule_id")(price_rule_id.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    if (usage_count != null) __obj.updateDynamic("usage_count")(usage_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriceRuleDiscountCode]
  }
}

