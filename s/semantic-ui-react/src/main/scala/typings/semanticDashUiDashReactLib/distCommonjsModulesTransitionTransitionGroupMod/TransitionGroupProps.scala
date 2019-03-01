package typings
package semanticDashUiDashReactLib.distCommonjsModulesTransitionTransitionGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionGroupProps
  extends StrictTransitionGroupProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object TransitionGroupProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    animation: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticTRANSITIONS = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    duration: scala.Double | java.lang.String | semanticDashUiDashReactLib.distCommonjsModulesTransitionTransitionMod.TransitionPropDuration = null
  ): TransitionGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionGroupProps]
  }
}

