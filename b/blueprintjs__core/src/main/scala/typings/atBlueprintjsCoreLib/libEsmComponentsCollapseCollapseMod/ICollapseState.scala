package typings
package atBlueprintjsCoreLib.libEsmComponentsCollapseCollapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollapseState extends js.Object {
  /** The state the element is currently in. */
  var animationState: AnimationStates
  /** The height that should be used for the content animations. This is a CSS value, not just a number. */
  var height: java.lang.String
}

object ICollapseState {
  @scala.inline
  def apply(animationState: AnimationStates, height: java.lang.String): ICollapseState = {
    val __obj = js.Dynamic.literal(animationState = animationState, height = height)
  
    __obj.asInstanceOf[ICollapseState]
  }
}

