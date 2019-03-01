package typings
package atPulumiAwsLib.sesReceiptFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptFilterArgs extends js.Object {
  /**
    * The IP address or address range to filter, in CIDR notation
    */
  val cidr: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name of the filter
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Block or Allow
    */
  val policy: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object ReceiptFilterArgs {
  @scala.inline
  def apply(
    cidr: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    policy: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): ReceiptFilterArgs = {
    val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptFilterArgs]
  }
}

