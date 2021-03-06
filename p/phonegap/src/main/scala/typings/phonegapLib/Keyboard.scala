package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyboard extends js.Object {
  var automaticScrollToTopOnHiding: scala.Boolean
  var isVisible: scala.Boolean
  var onhide: js.Function
  var onhiding: js.Function
  var onshow: js.Function
  var onshowing: js.Function
  def disableScrollingInShrinkView(disable: scala.Boolean): scala.Unit
  def hideFormAccessoryBar(hide: scala.Boolean): scala.Unit
  def shrinkView(shrink: scala.Boolean): scala.Unit
}

object Keyboard {
  @scala.inline
  def apply(
    automaticScrollToTopOnHiding: scala.Boolean,
    disableScrollingInShrinkView: scala.Boolean => scala.Unit,
    hideFormAccessoryBar: scala.Boolean => scala.Unit,
    isVisible: scala.Boolean,
    onhide: js.Function,
    onhiding: js.Function,
    onshow: js.Function,
    onshowing: js.Function,
    shrinkView: scala.Boolean => scala.Unit
  ): Keyboard = {
    val __obj = js.Dynamic.literal(automaticScrollToTopOnHiding = automaticScrollToTopOnHiding, disableScrollingInShrinkView = js.Any.fromFunction1(disableScrollingInShrinkView), hideFormAccessoryBar = js.Any.fromFunction1(hideFormAccessoryBar), isVisible = isVisible, onhide = onhide, onhiding = onhiding, onshow = onshow, onshowing = onshowing, shrinkView = js.Any.fromFunction1(shrinkView))
  
    __obj.asInstanceOf[Keyboard]
  }
}

