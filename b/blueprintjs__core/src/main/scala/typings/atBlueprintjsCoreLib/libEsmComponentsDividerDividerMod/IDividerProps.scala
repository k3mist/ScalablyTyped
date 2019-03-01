package typings
package atBlueprintjsCoreLib.libEsmComponentsDividerDividerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait IDividerProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] {
  /**
    * HTML tag to use for element.
    * @default "div"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any
  ] = js.undefined
}

object IDividerProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] = null,
    IProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps = null,
    tagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any = null
  ): IDividerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IProps)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[IDividerProps]
  }
}

