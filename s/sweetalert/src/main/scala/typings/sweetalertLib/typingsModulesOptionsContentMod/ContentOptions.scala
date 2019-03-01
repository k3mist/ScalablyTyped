package typings
package sweetalertLib.typingsModulesOptionsContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentOptions extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.undefined
  var element: java.lang.String | stdLib.Node
}

object ContentOptions {
  @scala.inline
  def apply(element: java.lang.String | stdLib.Node, attributes: js.Object = null): ContentOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[ContentOptions]
  }
}

