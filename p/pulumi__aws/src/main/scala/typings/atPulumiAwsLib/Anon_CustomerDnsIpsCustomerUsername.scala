package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomerDnsIpsCustomerUsername extends js.Object {
  var customerDnsIps: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  var customerUsername: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var subnetIds: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  var vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_CustomerDnsIpsCustomerUsername {
  @scala.inline
  def apply(
    customerDnsIps: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    customerUsername: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    subnetIds: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_CustomerDnsIpsCustomerUsername = {
    val __obj = js.Dynamic.literal(customerDnsIps = customerDnsIps.asInstanceOf[js.Any], customerUsername = customerUsername.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CustomerDnsIpsCustomerUsername]
  }
}

