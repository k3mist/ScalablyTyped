package typings
package reactDashTagsinputLib.reactDashTagsinputMod.TagsInputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderTagProps extends TagProps {
  val disabled: scala.Boolean
  val tag: reactDashTagsinputLib.Tag
  def getTagDisplayValue(tag: reactDashTagsinputLib.Tag): java.lang.String
  def onRemove(tagIndex: scala.Double): scala.Unit
}

object RenderTagProps {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    getTagDisplayValue: js.Function1[reactDashTagsinputLib.Tag, java.lang.String],
    onRemove: js.Function1[scala.Double, scala.Unit],
    tag: reactDashTagsinputLib.Tag
  ): RenderTagProps = {
    val __obj = js.Dynamic.literal(disabled = disabled, getTagDisplayValue = getTagDisplayValue, onRemove = onRemove, tag = tag)
  
    __obj.asInstanceOf[RenderTagProps]
  }
}

