package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomerDnsIpsCustomerUsername extends js.Object {
  var customerDnsIps: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var customerUsername: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_CustomerDnsIpsCustomerUsername {
  @scala.inline
  def apply(
    customerDnsIps: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    customerUsername: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_CustomerDnsIpsCustomerUsername = {
    val __obj = js.Dynamic.literal(customerDnsIps = customerDnsIps.asInstanceOf[js.Any], customerUsername = customerUsername.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CustomerDnsIpsCustomerUsername]
  }
}

