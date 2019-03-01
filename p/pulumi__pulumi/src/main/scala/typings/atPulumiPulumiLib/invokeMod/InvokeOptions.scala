package typings
package atPulumiPulumiLib.invokeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokeOptions extends js.Object {
  /**
    * An optional parent to use for default options for this invoke (e.g. the default provider to use).
    */
  var parent: js.UndefOr[atPulumiPulumiLib.resourceMod.Resource] = js.undefined
  /**
    * An optional provider to use for this invocation. If no provider is supplied, the default provider for the
    * invoked function's package will be used.
    */
  var provider: js.UndefOr[atPulumiPulumiLib.resourceMod.ProviderResource] = js.undefined
}

object InvokeOptions {
  @scala.inline
  def apply(
    parent: atPulumiPulumiLib.resourceMod.Resource = null,
    provider: atPulumiPulumiLib.resourceMod.ProviderResource = null
  ): InvokeOptions = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    __obj.asInstanceOf[InvokeOptions]
  }
}

