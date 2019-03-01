package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventsFilterPrefixFilterSuffixIdLambdaFunctionArn extends js.Object {
  var events: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  var filterPrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var filterSuffix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var id: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var lambdaFunctionArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_EventsFilterPrefixFilterSuffixIdLambdaFunctionArn {
  @scala.inline
  def apply(
    events: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    filterPrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    filterSuffix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    id: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    lambdaFunctionArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_EventsFilterPrefixFilterSuffixIdLambdaFunctionArn = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix.asInstanceOf[js.Any])
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lambdaFunctionArn != null) __obj.updateDynamic("lambdaFunctionArn")(lambdaFunctionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EventsFilterPrefixFilterSuffixIdLambdaFunctionArn]
  }
}

