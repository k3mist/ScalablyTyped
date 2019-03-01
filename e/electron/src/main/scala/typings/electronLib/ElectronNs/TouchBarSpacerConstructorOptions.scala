package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarSpacerConstructorOptions extends js.Object {
  /**
    * Size of spacer, possible values are:
    */
  var size: js.UndefOr[
    electronLib.electronLibStrings.small | electronLib.electronLibStrings.large | electronLib.electronLibStrings.flexible
  ] = js.undefined
}

object TouchBarSpacerConstructorOptions {
  @scala.inline
  def apply(
    size: electronLib.electronLibStrings.small | electronLib.electronLibStrings.large | electronLib.electronLibStrings.flexible = null
  ): TouchBarSpacerConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarSpacerConstructorOptions]
  }
}

