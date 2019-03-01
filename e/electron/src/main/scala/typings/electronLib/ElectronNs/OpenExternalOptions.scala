package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenExternalOptions extends js.Object {
  /**
    * true to bring the opened application to the foreground. The default is true.
    */
  var activate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The working directory.
    */
  var workingDirectory: js.UndefOr[java.lang.String] = js.undefined
}

object OpenExternalOptions {
  @scala.inline
  def apply(activate: js.UndefOr[scala.Boolean] = js.undefined, workingDirectory: java.lang.String = null): OpenExternalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activate)) __obj.updateDynamic("activate")(activate)
    if (workingDirectory != null) __obj.updateDynamic("workingDirectory")(workingDirectory)
    __obj.asInstanceOf[OpenExternalOptions]
  }
}

