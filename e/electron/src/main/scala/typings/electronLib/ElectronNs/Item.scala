package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  /**
    * or files Array The path(s) to the file(s) being dragged.
    */
  var file: java.lang.String
  /**
    * The image must be non-empty on macOS.
    */
  var icon: NativeImage
}

object Item {
  @scala.inline
  def apply(file: java.lang.String, icon: NativeImage): Item = {
    val __obj = js.Dynamic.literal(file = file, icon = icon)
  
    __obj.asInstanceOf[Item]
  }
}

