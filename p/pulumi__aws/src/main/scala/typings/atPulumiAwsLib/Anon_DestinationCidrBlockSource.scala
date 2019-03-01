package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationCidrBlockSource extends js.Object {
  var destinationCidrBlock: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var source: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var state: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_DestinationCidrBlockSource {
  @scala.inline
  def apply(
    destinationCidrBlock: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    source: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    state: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_DestinationCidrBlockSource = {
    val __obj = js.Dynamic.literal()
    if (destinationCidrBlock != null) __obj.updateDynamic("destinationCidrBlock")(destinationCidrBlock.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DestinationCidrBlockSource]
  }
}

