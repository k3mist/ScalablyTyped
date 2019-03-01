package typings
package atPulumiAwsLib.ec2EgressOnlyInternetGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EgressOnlyInternetGatewayArgs extends js.Object {
  /**
    * The VPC ID to create in.
    */
  val vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object EgressOnlyInternetGatewayArgs {
  @scala.inline
  def apply(vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]): EgressOnlyInternetGatewayArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EgressOnlyInternetGatewayArgs]
  }
}

