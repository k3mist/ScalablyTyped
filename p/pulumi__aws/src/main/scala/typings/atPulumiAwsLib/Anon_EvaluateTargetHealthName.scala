package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EvaluateTargetHealthName extends js.Object {
  var evaluateTargetHealth: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
  var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var zoneId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_EvaluateTargetHealthName {
  @scala.inline
  def apply(
    evaluateTargetHealth: atPulumiPulumiLib.resourceMod.Input[scala.Boolean],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    zoneId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_EvaluateTargetHealthName = {
    val __obj = js.Dynamic.literal(evaluateTargetHealth = evaluateTargetHealth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EvaluateTargetHealthName]
  }
}

