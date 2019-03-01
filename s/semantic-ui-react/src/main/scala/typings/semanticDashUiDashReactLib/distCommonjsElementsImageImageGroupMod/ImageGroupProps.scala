package typings
package semanticDashUiDashReactLib.distCommonjsElementsImageImageGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageGroupProps
  extends StrictImageGroupProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object ImageGroupProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    size: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticSIZES = null
  ): ImageGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ImageGroupProps]
  }
}

