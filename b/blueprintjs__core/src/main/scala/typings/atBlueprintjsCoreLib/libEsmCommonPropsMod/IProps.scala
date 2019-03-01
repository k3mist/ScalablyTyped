package typings
package atBlueprintjsCoreLib.libEsmCommonPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps extends js.Object {
  /** A space-delimited list of class names to pass along to a child element. */
  var className: js.UndefOr[java.lang.String] = js.undefined
}

object IProps {
  @scala.inline
  def apply(className: java.lang.String = null): IProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[IProps]
  }
}

