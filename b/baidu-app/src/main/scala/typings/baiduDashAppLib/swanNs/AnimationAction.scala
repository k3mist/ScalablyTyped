package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationAction extends js.Object {
  var animates: js.Array[Animate]
  var option: AnimationActionOption
}

object AnimationAction {
  @scala.inline
  def apply(animates: js.Array[Animate], option: AnimationActionOption): AnimationAction = {
    val __obj = js.Dynamic.literal(animates = animates, option = option)
  
    __obj.asInstanceOf[AnimationAction]
  }
}

