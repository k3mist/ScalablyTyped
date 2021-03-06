package typings
package atPulumiAwsLib.resourcegroupsGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupArgs extends js.Object {
  /**
    * A description of the resource group.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The resource group's name. A resource group name can have a maximum of 127 characters, including letters, numbers, hyphens, dots, and underscores. The name cannot start with `AWS` or `aws`.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A `resource_query` block. Resource queries are documented below.
    */
  val resourceQuery: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_QueryType]
}

object GroupArgs {
  @scala.inline
  def apply(
    resourceQuery: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_QueryType],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): GroupArgs = {
    val __obj = js.Dynamic.literal(resourceQuery = resourceQuery.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupArgs]
  }
}

