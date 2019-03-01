package typings
package atBlueprintjsCoreLib.libEsmComponentsTextTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Indicates that this component should be truncated with an ellipsis if it overflows its container.
    * The `title` attribute will also be added when content overflows to show the full text of the children on hover.
    * @default false
    */
  var ellipsize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * HTML tag name to use for rendered element.
    * @default "div"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any
  ] = js.undefined
}

object ITextProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    ellipsize: js.UndefOr[scala.Boolean] = js.undefined,
    tagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any = null
  ): ITextProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(ellipsize)) __obj.updateDynamic("ellipsize")(ellipsize)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[ITextProps]
  }
}

