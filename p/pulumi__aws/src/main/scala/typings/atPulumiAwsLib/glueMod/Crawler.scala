package typings
package atPulumiAwsLib.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/glue", "Crawler")
@js.native
class Crawler protected ()
  extends atPulumiAwsLib.glueCrawlerMod.Crawler {
  /**
    * Create a Crawler resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.glueCrawlerMod.CrawlerArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.glueCrawlerMod.CrawlerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/glue", "Crawler")
@js.native
object Crawler extends js.Object {
  /**
    * Get an existing Crawler resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glueCrawlerMod.Crawler = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.glueCrawlerMod.CrawlerState
  ): atPulumiAwsLib.glueCrawlerMod.Crawler = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.glueCrawlerMod.CrawlerState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.glueCrawlerMod.Crawler = js.native
}

