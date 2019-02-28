package typings
package atPulumiAwsLib.cognitoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito", "IdentityProvider")
@js.native
class IdentityProvider protected ()
  extends atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProvider {
  /**
    * Create a IdentityProvider resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProviderArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProviderArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cognito", "IdentityProvider")
@js.native
object IdentityProvider extends js.Object {
  /**
    * Get an existing IdentityProvider resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProvider = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProviderState
  ): atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProvider = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProviderState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProvider = js.native
}

