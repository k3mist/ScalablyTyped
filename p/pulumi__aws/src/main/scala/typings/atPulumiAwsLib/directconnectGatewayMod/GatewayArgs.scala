package typings
package atPulumiAwsLib.directconnectGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayArgs extends js.Object {
  /**
    * The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
    */
  val amazonSideAsn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name of the connection.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object GatewayArgs {
  @scala.inline
  def apply(
    amazonSideAsn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): GatewayArgs = {
    val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayArgs]
  }
}

