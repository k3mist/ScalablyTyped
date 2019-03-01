package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTargetingExpression extends js.Object {
  /** Expression describing which lists are being targeted by the ad. */
  var expression: js.UndefOr[java.lang.String] = js.undefined
}

object ListTargetingExpression {
  @scala.inline
  def apply(expression: java.lang.String = null): ListTargetingExpression = {
    val __obj = js.Dynamic.literal()
    if (expression != null) __obj.updateDynamic("expression")(expression)
    __obj.asInstanceOf[ListTargetingExpression]
  }
}

