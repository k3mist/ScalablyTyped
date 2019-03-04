package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.UtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dom extends js.Object {
  def addClass(el: reactLib.Element, className: java.lang.String): scala.Unit
  def forceRedraw(el: reactLib.HTMLElement): scala.Unit
  def getStyleAttributeAsNumber(el: reactLib.HTMLElement, attr: java.lang.String): scala.Double
  def hasClass(el: reactLib.Element, className: java.lang.String): scala.Boolean
  def isDescendant(parent: stdLib.Node, child: stdLib.Node): scala.Boolean
  def offset(el: reactLib.Element): materialDashUiLib.Anon_Left
  def removeClass(el: reactLib.Element, className: java.lang.String): scala.Unit
  def toggleClass(el: reactLib.Element, className: java.lang.String): scala.Unit
  def withoutTransition(el: reactLib.HTMLElement, callback: js.Function0[scala.Unit]): scala.Unit
}

object Dom {
  @scala.inline
  def apply(
    addClass: (reactLib.Element, java.lang.String) => scala.Unit,
    forceRedraw: reactLib.HTMLElement => scala.Unit,
    getStyleAttributeAsNumber: (reactLib.HTMLElement, java.lang.String) => scala.Double,
    hasClass: (reactLib.Element, java.lang.String) => scala.Boolean,
    isDescendant: (stdLib.Node, stdLib.Node) => scala.Boolean,
    offset: reactLib.Element => materialDashUiLib.Anon_Left,
    removeClass: (reactLib.Element, java.lang.String) => scala.Unit,
    toggleClass: (reactLib.Element, java.lang.String) => scala.Unit,
    withoutTransition: (reactLib.HTMLElement, js.Function0[scala.Unit]) => scala.Unit
  ): Dom = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction2(addClass), forceRedraw = js.Any.fromFunction1(forceRedraw), getStyleAttributeAsNumber = js.Any.fromFunction2(getStyleAttributeAsNumber), hasClass = js.Any.fromFunction2(hasClass), isDescendant = js.Any.fromFunction2(isDescendant), offset = js.Any.fromFunction1(offset), removeClass = js.Any.fromFunction2(removeClass), toggleClass = js.Any.fromFunction2(toggleClass), withoutTransition = js.Any.fromFunction2(withoutTransition))
  
    __obj.asInstanceOf[Dom]
  }
}

