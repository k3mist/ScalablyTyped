package typings
package atPulumiAwsLib.elasticacheSecurityGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroupArgs extends js.Object {
  /**
    * description for the cache security group. Defaults to "Managed by Terraform".
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Name for the cache security group. This value is stored as a lowercase string.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * List of EC2 security group names to be
    * authorized for ingress to the cache security group
    */
  val securityGroupNames: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
}

object SecurityGroupArgs {
  @scala.inline
  def apply(
    securityGroupNames: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): SecurityGroupArgs = {
    val __obj = js.Dynamic.literal(securityGroupNames = securityGroupNames.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupArgs]
  }
}

