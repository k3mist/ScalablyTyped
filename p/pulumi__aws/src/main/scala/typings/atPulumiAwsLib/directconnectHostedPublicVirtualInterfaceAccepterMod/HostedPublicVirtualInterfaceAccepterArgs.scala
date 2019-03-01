package typings
package atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceAccepterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedPublicVirtualInterfaceAccepterArgs extends js.Object {
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * The ID of the Direct Connect virtual interface to accept.
    */
  val virtualInterfaceId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object HostedPublicVirtualInterfaceAccepterArgs {
  @scala.inline
  def apply(
    virtualInterfaceId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): HostedPublicVirtualInterfaceAccepterArgs = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedPublicVirtualInterfaceAccepterArgs]
  }
}

