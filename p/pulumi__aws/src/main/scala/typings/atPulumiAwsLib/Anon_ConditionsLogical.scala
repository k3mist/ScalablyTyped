package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConditionsLogical extends js.Object {
  var conditions: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_JobNameLogicalOperator]]]
  var logical: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_ConditionsLogical {
  @scala.inline
  def apply(
    conditions: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_JobNameLogicalOperator]]],
    logical: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_ConditionsLogical = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    if (logical != null) __obj.updateDynamic("logical")(logical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConditionsLogical]
  }
}

