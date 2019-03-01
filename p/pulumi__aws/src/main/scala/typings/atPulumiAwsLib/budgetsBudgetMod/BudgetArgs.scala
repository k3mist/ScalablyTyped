package typings
package atPulumiAwsLib.budgetsBudgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BudgetArgs extends js.Object {
  /**
    * The ID of the target account for budget. Will use current user's account_id by default if omitted.
    */
  val accountId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether this budget tracks monetary cost or usage.
    */
  val budgetType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Map of CostFilters key/value pairs to apply to the budget.
    */
  val costFilters: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions..
    */
  val costTypes: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_IncludeCreditIncludeDiscount]
  ] = js.undefined
  /**
    * The amount of cost or usage being measured for a budget.
    */
  val limitAmount: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
    */
  val limitUnit: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name of a budget. Unique within accounts.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The prefix of the name of a budget. Unique within accounts.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The end of the time period covered by the budget. There are no restrictions on the end date. Format: `2017-01-01_12:00`.
    */
  val timePeriodEnd: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The start of the time period covered by the budget. The start date must come before the end date. Format: `2017-01-01_12:00`.
    */
  val timePeriodStart: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The length of time until a budget resets the actual and forecasted spend. Valid values: `MONTHLY`, `QUARTERLY`, `ANNUALLY`.
    */
  val timeUnit: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object BudgetArgs {
  @scala.inline
  def apply(
    budgetType: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    limitAmount: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    limitUnit: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    timePeriodStart: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    timeUnit: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    accountId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    costFilters: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    costTypes: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_IncludeCreditIncludeDiscount] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    timePeriodEnd: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): BudgetArgs = {
    val __obj = js.Dynamic.literal(budgetType = budgetType.asInstanceOf[js.Any], limitAmount = limitAmount.asInstanceOf[js.Any], limitUnit = limitUnit.asInstanceOf[js.Any], timePeriodStart = timePeriodStart.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (costFilters != null) __obj.updateDynamic("costFilters")(costFilters.asInstanceOf[js.Any])
    if (costTypes != null) __obj.updateDynamic("costTypes")(costTypes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (timePeriodEnd != null) __obj.updateDynamic("timePeriodEnd")(timePeriodEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[BudgetArgs]
  }
}

