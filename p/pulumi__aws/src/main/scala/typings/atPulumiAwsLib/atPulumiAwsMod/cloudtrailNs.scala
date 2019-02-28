package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudtrail")
@js.native
object cloudtrailNs extends js.Object {
  @js.native
  class Trail protected ()
    extends atPulumiAwsLib.cloudtrailMod.Trail {
    /**
      * Create a Trail resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudtrailTrailMod.TrailArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudtrailTrailMod.TrailArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getServiceAccount(): js.Promise[atPulumiAwsLib.cloudtrailGetServiceAccountMod.GetServiceAccountResult] = js.native
  def getServiceAccount(args: atPulumiAwsLib.cloudtrailGetServiceAccountMod.GetServiceAccountArgs): js.Promise[atPulumiAwsLib.cloudtrailGetServiceAccountMod.GetServiceAccountResult] = js.native
  def getServiceAccount(
    args: atPulumiAwsLib.cloudtrailGetServiceAccountMod.GetServiceAccountArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.cloudtrailGetServiceAccountMod.GetServiceAccountResult] = js.native
  /* static members */
  @js.native
  object Trail extends js.Object {
    /**
      * Get an existing Trail resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudtrailTrailMod.Trail = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudtrailTrailMod.TrailState
    ): atPulumiAwsLib.cloudtrailTrailMod.Trail = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudtrailTrailMod.TrailState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cloudtrailTrailMod.Trail = js.native
  }
  
}

