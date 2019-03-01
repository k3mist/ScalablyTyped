package typings
package atPulumiAwsLib.cognitoResourceServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceServerArgs extends js.Object {
  /**
    * An identifier for the resource server.
    */
  val identifier: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A name for the resource server.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of Authorization Scope.
    */
  val scopes: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ScopeDescriptionScopeName]
      ]
    ]
  ] = js.undefined
  val userPoolId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object ResourceServerArgs {
  @scala.inline
  def apply(
    identifier: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    userPoolId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    scopes: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ScopeDescriptionScopeName]
      ]
    ] = null
  ): ResourceServerArgs = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerArgs]
  }
}

