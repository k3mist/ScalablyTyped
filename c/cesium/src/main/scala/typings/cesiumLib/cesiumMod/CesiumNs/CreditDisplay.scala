package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditDisplay extends js.Object {
  var container: stdLib.HTMLElement
  def addCredit(credit: Credit): scala.Unit
  def addDefaultCredit(credit: Credit): scala.Unit
  def beginFrame(credit: Credit): scala.Unit
  def destroy(): scala.Unit
  def endFrame(credit: Credit): scala.Unit
  def isDestroyed(): scala.Boolean
  def removeDefaultCredit(credit: Credit): scala.Unit
  def update(): scala.Unit
}

object CreditDisplay {
  @scala.inline
  def apply(
    addCredit: js.Function1[Credit, scala.Unit],
    addDefaultCredit: js.Function1[Credit, scala.Unit],
    beginFrame: js.Function1[Credit, scala.Unit],
    container: stdLib.HTMLElement,
    destroy: js.Function0[scala.Unit],
    endFrame: js.Function1[Credit, scala.Unit],
    isDestroyed: js.Function0[scala.Boolean],
    removeDefaultCredit: js.Function1[Credit, scala.Unit],
    update: js.Function0[scala.Unit]
  ): CreditDisplay = {
    val __obj = js.Dynamic.literal(addCredit = addCredit, addDefaultCredit = addDefaultCredit, beginFrame = beginFrame, container = container, destroy = destroy, endFrame = endFrame, isDestroyed = isDestroyed, removeDefaultCredit = removeDefaultCredit, update = update)
  
    __obj.asInstanceOf[CreditDisplay]
  }
}

