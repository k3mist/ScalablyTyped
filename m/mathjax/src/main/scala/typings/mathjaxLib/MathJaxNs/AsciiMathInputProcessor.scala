package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsciiMathInputProcessor extends js.Object {
  /*This is the character to be used for decimal points in numbers. if you change this to ",", then you need to be
    * careful about entering points or intervals. E.g., use (1, 2) rather than (1,2) in that case.
    */
  var decimal: js.UndefOr[java.lang.String] = js.undefined
  /*Determines whether operators like summation symbols will have their limits above and below the operators
    * (true) or to their right (false). The former is how they would appear in displayed equations that appear on
    * their own lines, while the latter is better suited to in-line equations so that they don’t interfere with the
    * line spacing so much.
    */
  var displaystyle: js.UndefOr[scala.Boolean] = js.undefined
}

object AsciiMathInputProcessor {
  @scala.inline
  def apply(decimal: java.lang.String = null, displaystyle: js.UndefOr[scala.Boolean] = js.undefined): AsciiMathInputProcessor = {
    val __obj = js.Dynamic.literal()
    if (decimal != null) __obj.updateDynamic("decimal")(decimal)
    if (!js.isUndefined(displaystyle)) __obj.updateDynamic("displaystyle")(displaystyle)
    __obj.asInstanceOf[AsciiMathInputProcessor]
  }
}

