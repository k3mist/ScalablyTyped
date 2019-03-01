package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailureThresholdResourcePath extends js.Object {
  var failureThreshold: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var resourcePath: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_FailureThresholdResourcePath {
  @scala.inline
  def apply(
    failureThreshold: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    resourcePath: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_FailureThresholdResourcePath = {
    val __obj = js.Dynamic.literal()
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (resourcePath != null) __obj.updateDynamic("resourcePath")(resourcePath.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FailureThresholdResourcePath]
  }
}

