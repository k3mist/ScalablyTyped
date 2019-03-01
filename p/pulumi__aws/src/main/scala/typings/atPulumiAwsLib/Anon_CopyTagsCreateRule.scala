package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CopyTagsCreateRule extends js.Object {
  var copyTags: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var createRule: atPulumiPulumiLib.resourceMod.Input[Anon_IntervalIntervalUnitTimes]
  var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var retainRule: atPulumiPulumiLib.resourceMod.Input[Anon_CountInput]
  var tagsToAdd: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
}

object Anon_CopyTagsCreateRule {
  @scala.inline
  def apply(
    createRule: atPulumiPulumiLib.resourceMod.Input[Anon_IntervalIntervalUnitTimes],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    retainRule: atPulumiPulumiLib.resourceMod.Input[Anon_CountInput],
    copyTags: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    tagsToAdd: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): Anon_CopyTagsCreateRule = {
    val __obj = js.Dynamic.literal(createRule = createRule.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retainRule = retainRule.asInstanceOf[js.Any])
    if (copyTags != null) __obj.updateDynamic("copyTags")(copyTags.asInstanceOf[js.Any])
    if (tagsToAdd != null) __obj.updateDynamic("tagsToAdd")(tagsToAdd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CopyTagsCreateRule]
  }
}

