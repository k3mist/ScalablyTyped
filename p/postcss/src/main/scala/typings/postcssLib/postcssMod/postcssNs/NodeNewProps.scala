package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeNewProps extends js.Object {
  var raws: js.UndefOr[NodeRaws] = js.undefined
}

object NodeNewProps {
  @scala.inline
  def apply(raws: NodeRaws = null): NodeNewProps = {
    val __obj = js.Dynamic.literal()
    if (raws != null) __obj.updateDynamic("raws")(raws)
    __obj.asInstanceOf[NodeNewProps]
  }
}

