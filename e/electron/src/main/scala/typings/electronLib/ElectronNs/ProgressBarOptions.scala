package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarOptions extends js.Object {
  /**
    * Mode for the progress bar. Can be none, normal, indeterminate, error or paused.
    */
  var mode: electronLib.electronLibStrings.none | electronLib.electronLibStrings.normal | electronLib.electronLibStrings.indeterminate | electronLib.electronLibStrings.error | electronLib.electronLibStrings.paused
}

object ProgressBarOptions {
  @scala.inline
  def apply(
    mode: electronLib.electronLibStrings.none | electronLib.electronLibStrings.normal | electronLib.electronLibStrings.indeterminate | electronLib.electronLibStrings.error | electronLib.electronLibStrings.paused
  ): ProgressBarOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProgressBarOptions]
  }
}

