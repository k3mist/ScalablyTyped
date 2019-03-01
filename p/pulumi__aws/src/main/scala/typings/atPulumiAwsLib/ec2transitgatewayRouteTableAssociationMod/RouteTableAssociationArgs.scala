package typings
package atPulumiAwsLib.ec2transitgatewayRouteTableAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTableAssociationArgs extends js.Object {
  /**
    * Identifier of EC2 Transit Gateway Attachment.
    */
  val transitGatewayAttachmentId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object RouteTableAssociationArgs {
  @scala.inline
  def apply(
    transitGatewayAttachmentId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    transitGatewayRouteTableId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): RouteTableAssociationArgs = {
    val __obj = js.Dynamic.literal(transitGatewayAttachmentId = transitGatewayAttachmentId.asInstanceOf[js.Any], transitGatewayRouteTableId = transitGatewayRouteTableId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteTableAssociationArgs]
  }
}

