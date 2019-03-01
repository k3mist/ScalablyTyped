package typings
package atPulumiAwsLib.ec2RouteTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTableArgs extends js.Object {
  /**
    * A list of virtual gateways for propagation.
    */
  val propagatingVgws: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A list of route objects. Their keys are documented below.
    */
  val routes: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CidrBlockEgressOnlyGatewayId]
      ]
    ]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * The VPC ID.
    */
  val vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object RouteTableArgs {
  @scala.inline
  def apply(
    vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    propagatingVgws: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    routes: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CidrBlockEgressOnlyGatewayId]
      ]
    ] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): RouteTableArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    if (propagatingVgws != null) __obj.updateDynamic("propagatingVgws")(propagatingVgws.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTableArgs]
  }
}

