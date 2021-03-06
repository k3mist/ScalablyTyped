package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalFormatRule extends js.Object {
  def copy(): ConditionalFormatRuleBuilder
  def getBooleanCondition(): BooleanCondition
  def getGradientCondition(): GradientCondition
  def getRanges(): js.Array[Range]
}

object ConditionalFormatRule {
  @scala.inline
  def apply(
    copy: () => ConditionalFormatRuleBuilder,
    getBooleanCondition: () => BooleanCondition,
    getGradientCondition: () => GradientCondition,
    getRanges: () => js.Array[Range]
  ): ConditionalFormatRule = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getBooleanCondition = js.Any.fromFunction0(getBooleanCondition), getGradientCondition = js.Any.fromFunction0(getGradientCondition), getRanges = js.Any.fromFunction0(getRanges))
  
    __obj.asInstanceOf[ConditionalFormatRule]
  }
}

