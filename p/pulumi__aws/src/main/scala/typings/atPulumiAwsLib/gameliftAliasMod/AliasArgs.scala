package typings
package atPulumiAwsLib.gameliftAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasArgs extends js.Object {
  /**
    * Description of the alias.
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the alias.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the fleet and/or routing type to use for the alias.
    */
  val routingStrategy: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_FleetIdMessage]
}

object AliasArgs {
  @scala.inline
  def apply(
    routingStrategy: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_FleetIdMessage],
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): AliasArgs = {
    val __obj = js.Dynamic.literal(routingStrategy = routingStrategy.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasArgs]
  }
}

