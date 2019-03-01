package typings
package atUifabricUtilitiesLib.libCustomizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomizerContext extends js.Object {
  var customizations: atUifabricUtilitiesLib.libCustomizationsMod.ICustomizations
}

object ICustomizerContext {
  @scala.inline
  def apply(customizations: atUifabricUtilitiesLib.libCustomizationsMod.ICustomizations): ICustomizerContext = {
    val __obj = js.Dynamic.literal(customizations = customizations)
  
    __obj.asInstanceOf[ICustomizerContext]
  }
}

