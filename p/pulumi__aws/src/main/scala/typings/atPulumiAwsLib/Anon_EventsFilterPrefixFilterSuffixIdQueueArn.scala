package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventsFilterPrefixFilterSuffixIdQueueArn extends js.Object {
  var events: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  var filterPrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var filterSuffix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var id: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var queueArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_EventsFilterPrefixFilterSuffixIdQueueArn {
  @scala.inline
  def apply(
    events: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    queueArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    filterPrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    filterSuffix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    id: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_EventsFilterPrefixFilterSuffixIdQueueArn = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], queueArn = queueArn.asInstanceOf[js.Any])
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix.asInstanceOf[js.Any])
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EventsFilterPrefixFilterSuffixIdQueueArn]
  }
}

