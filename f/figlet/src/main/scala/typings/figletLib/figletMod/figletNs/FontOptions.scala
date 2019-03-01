package typings
package figletLib.figletMod.figletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontOptions extends js.Object {
  var baseline: scala.Double
  var codeTagCount: scala.Double | scala.Null
  var fittingRules: FittingRules
  var fullLayout: scala.Double | scala.Null
  var hardBlank: java.lang.String
  var height: scala.Double
  var maxLength: scala.Double
  var numCommentLines: scala.Double
  var oldLayout: scala.Double
  var printDirection: PrintDirection
}

object FontOptions {
  @scala.inline
  def apply(
    baseline: scala.Double,
    fittingRules: FittingRules,
    hardBlank: java.lang.String,
    height: scala.Double,
    maxLength: scala.Double,
    numCommentLines: scala.Double,
    oldLayout: scala.Double,
    printDirection: PrintDirection,
    codeTagCount: scala.Int | scala.Double = null,
    fullLayout: scala.Int | scala.Double = null
  ): FontOptions = {
    val __obj = js.Dynamic.literal(baseline = baseline, fittingRules = fittingRules, hardBlank = hardBlank, height = height, maxLength = maxLength, numCommentLines = numCommentLines, oldLayout = oldLayout, printDirection = printDirection)
    if (codeTagCount != null) __obj.updateDynamic("codeTagCount")(codeTagCount.asInstanceOf[js.Any])
    if (fullLayout != null) __obj.updateDynamic("fullLayout")(fullLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontOptions]
  }
}

