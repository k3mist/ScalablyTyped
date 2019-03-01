package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupArnsSubnetArn extends js.Object {
  var securityGroupArns: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  var subnetArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_SecurityGroupArnsSubnetArn {
  @scala.inline
  def apply(
    securityGroupArns: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    subnetArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_SecurityGroupArnsSubnetArn = {
    val __obj = js.Dynamic.literal(securityGroupArns = securityGroupArns.asInstanceOf[js.Any], subnetArn = subnetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SecurityGroupArnsSubnetArn]
  }
}

