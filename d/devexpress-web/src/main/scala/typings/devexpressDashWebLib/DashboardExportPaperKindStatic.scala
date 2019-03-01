package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardExportPaperKindStatic extends js.Object {
  /**
    * A3 paper (297 mm by 420 mm).
    */
  var A3: java.lang.String
  /**
    * A4 paper (210 mm by 297 mm).
    */
  var A4: java.lang.String
  /**
    * A5 paper (148 mm by 210 mm).
    */
  var A5: java.lang.String
  /**
    * Executive paper (7.25 in. by 10.5 in.).
    */
  var Executive: java.lang.String
  /**
    * Legal paper (8.5 in. by 14 in.).
    */
  var Legal: java.lang.String
  /**
    * Letter paper (8.5 in. by 11 in.).
    */
  var Letter: java.lang.String
}

object DashboardExportPaperKindStatic {
  @scala.inline
  def apply(
    A3: java.lang.String,
    A4: java.lang.String,
    A5: java.lang.String,
    Executive: java.lang.String,
    Legal: java.lang.String,
    Letter: java.lang.String
  ): DashboardExportPaperKindStatic = {
    val __obj = js.Dynamic.literal(A3 = A3, A4 = A4, A5 = A5, Executive = Executive, Legal = Legal, Letter = Letter)
  
    __obj.asInstanceOf[DashboardExportPaperKindStatic]
  }
}

