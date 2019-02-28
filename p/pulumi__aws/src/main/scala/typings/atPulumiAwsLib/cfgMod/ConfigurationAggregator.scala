package typings
package atPulumiAwsLib.cfgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cfg", "ConfigurationAggregator")
@js.native
class ConfigurationAggregator protected ()
  extends atPulumiAwsLib.cfgConfigurationAggregatorMod.ConfigurationAggregator {
  /**
    * Create a ConfigurationAggregator resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.cfgConfigurationAggregatorMod.ConfigurationAggregatorArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.cfgConfigurationAggregatorMod.ConfigurationAggregatorArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cfg", "ConfigurationAggregator")
@js.native
object ConfigurationAggregator extends js.Object {
  /**
    * Get an existing ConfigurationAggregator resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cfgConfigurationAggregatorMod.ConfigurationAggregator = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cfgConfigurationAggregatorMod.ConfigurationAggregatorState
  ): atPulumiAwsLib.cfgConfigurationAggregatorMod.ConfigurationAggregator = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cfgConfigurationAggregatorMod.ConfigurationAggregatorState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cfgConfigurationAggregatorMod.ConfigurationAggregator = js.native
}

