package typings
package istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coverage extends js.Object {
  var coverage: scala.Double
  var covered: scala.Double
  var total: scala.Double
}

object Coverage {
  @scala.inline
  def apply(coverage: scala.Double, covered: scala.Double, total: scala.Double): Coverage = {
    val __obj = js.Dynamic.literal(coverage = coverage, covered = covered, total = total)
  
    __obj.asInstanceOf[Coverage]
  }
}

