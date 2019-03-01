package typings
package atPulumiAwsLib.ec2DefaultVpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultVpcArgs extends js.Object {
  /**
    * A boolean flag to enable/disable ClassicLink
    * for the VPC. Only valid in regions and accounts that support EC2 Classic.
    * See the [ClassicLink documentation][1] for more information. Defaults false.
    */
  val enableClassiclink: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  val enableClassiclinkDnsSupport: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
    */
  val enableDnsHostnames: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
    */
  val enableDnsSupport: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
}

object DefaultVpcArgs {
  @scala.inline
  def apply(
    enableClassiclink: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    enableClassiclinkDnsSupport: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    enableDnsHostnames: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    enableDnsSupport: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): DefaultVpcArgs = {
    val __obj = js.Dynamic.literal()
    if (enableClassiclink != null) __obj.updateDynamic("enableClassiclink")(enableClassiclink.asInstanceOf[js.Any])
    if (enableClassiclinkDnsSupport != null) __obj.updateDynamic("enableClassiclinkDnsSupport")(enableClassiclinkDnsSupport.asInstanceOf[js.Any])
    if (enableDnsHostnames != null) __obj.updateDynamic("enableDnsHostnames")(enableDnsHostnames.asInstanceOf[js.Any])
    if (enableDnsSupport != null) __obj.updateDynamic("enableDnsSupport")(enableDnsSupport.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultVpcArgs]
  }
}

