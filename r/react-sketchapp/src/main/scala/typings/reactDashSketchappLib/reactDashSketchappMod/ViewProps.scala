package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[Style | StyleReference] = js.undefined
}

object ViewProps {
  @scala.inline
  def apply(children: js.Any = null, name: java.lang.String = null, style: Style | StyleReference = null): ViewProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (name != null) __obj.updateDynamic("name")(name)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewProps]
  }
}

