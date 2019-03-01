package typings
package gapiDotPagespeedonlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiPageSpeedOnlineRuleResource extends js.Object {
  /**
    * Localized name of the rule, intended for presentation to a user.
    */
  var localizedRuleName: java.lang.String
  /**
    * The impact (unbounded floating point value) that implementing the suggestions for this rule would have on making the page faster.
    */
  var ruleImpact: scala.Double
  /**
    * The score (0-100) for this rule. The rule score indicates how well a page implements the recommendations for the given rule.
    */
  var ruleScore: scala.Double
  /**
    * List of blocks of URLs. Each block may contain a heading and a list of URLs. Each URL may optionally include additional details.
    */
  var urlBlocks: js.Array[Anon_Header]
}

object GoogleApiPageSpeedOnlineRuleResource {
  @scala.inline
  def apply(
    localizedRuleName: java.lang.String,
    ruleImpact: scala.Double,
    ruleScore: scala.Double,
    urlBlocks: js.Array[Anon_Header]
  ): GoogleApiPageSpeedOnlineRuleResource = {
    val __obj = js.Dynamic.literal(localizedRuleName = localizedRuleName, ruleImpact = ruleImpact, ruleScore = ruleScore, urlBlocks = urlBlocks)
  
    __obj.asInstanceOf[GoogleApiPageSpeedOnlineRuleResource]
  }
}

