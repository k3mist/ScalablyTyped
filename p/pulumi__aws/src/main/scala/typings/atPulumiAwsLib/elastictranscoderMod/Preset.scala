package typings
package atPulumiAwsLib.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elastictranscoder", "Preset")
@js.native
class Preset protected ()
  extends atPulumiAwsLib.elastictranscoderPresetMod.Preset {
  /**
    * Create a Preset resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.elastictranscoderPresetMod.PresetArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.elastictranscoderPresetMod.PresetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/elastictranscoder", "Preset")
@js.native
object Preset extends js.Object {
  /**
    * Get an existing Preset resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elastictranscoderPresetMod.Preset = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elastictranscoderPresetMod.PresetState
  ): atPulumiAwsLib.elastictranscoderPresetMod.Preset = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elastictranscoderPresetMod.PresetState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elastictranscoderPresetMod.Preset = js.native
}

