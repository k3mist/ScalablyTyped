package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CSSGroupingRule extends CSSRule {
  val cssRules: CSSRuleList
  def deleteRule(index: scala.Double): scala.Unit
  def insertRule(rule: java.lang.String, index: scala.Double): scala.Double
}

@JSGlobal("CSSGroupingRule")
@js.native
object CSSGroupingRule
  extends ScalablyTyped.runtime.Instantiable0[CSSGroupingRule]
