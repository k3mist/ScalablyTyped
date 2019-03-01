package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PositionScopeTopicArn extends js.Object {
  var position: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var scope: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var topicArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_PositionScopeTopicArn {
  @scala.inline
  def apply(
    position: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    scope: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    topicArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_PositionScopeTopicArn = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PositionScopeTopicArn]
  }
}

