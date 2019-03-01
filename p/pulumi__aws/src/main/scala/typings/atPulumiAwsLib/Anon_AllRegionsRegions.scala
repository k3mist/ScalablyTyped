package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllRegionsRegions extends js.Object {
  var allRegions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var regions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_AllRegionsRegions {
  @scala.inline
  def apply(
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    allRegions: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    regions: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): Anon_AllRegionsRegions = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    if (allRegions != null) __obj.updateDynamic("allRegions")(allRegions.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllRegionsRegions]
  }
}

