package typings
package simpleDashUrlDashCacheLib.simpleDashUrlDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxAgeRegexRule extends RegexRule {
  var maxAge: scala.Double
}

object MaxAgeRegexRule {
  @scala.inline
  def apply(maxAge: scala.Double, regex: stdLib.RegExp): MaxAgeRegexRule = {
    val __obj = js.Dynamic.literal(maxAge = maxAge, regex = regex)
  
    __obj.asInstanceOf[MaxAgeRegexRule]
  }
}

