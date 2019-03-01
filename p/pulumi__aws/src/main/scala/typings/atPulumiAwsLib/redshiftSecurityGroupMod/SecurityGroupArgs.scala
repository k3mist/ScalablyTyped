package typings
package atPulumiAwsLib.redshiftSecurityGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroupArgs extends js.Object {
  /**
    * The description of the Redshift security group. Defaults to "Managed by Terraform".
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of ingress rules.
    */
  val ingress: atPulumiPulumiLib.resourceMod.Input[
    js.Array[
      atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CidrSecurityGroupNameSecurityGroupOwnerId]
    ]
  ]
  /**
    * The name of the Redshift security group.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object SecurityGroupArgs {
  @scala.inline
  def apply(
    ingress: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CidrSecurityGroupNameSecurityGroupOwnerId]
      ]
    ],
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): SecurityGroupArgs = {
    val __obj = js.Dynamic.literal(ingress = ingress.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupArgs]
  }
}

