package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisGroup extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisGroup")
@js.native
object ChartAxisGroup extends js.Object {
  @js.native
  sealed trait primary
    extends officeDashJsLib.ExcelNs.ChartAxisGroup
  
  @js.native
  sealed trait secondary
    extends officeDashJsLib.ExcelNs.ChartAxisGroup
  
  /* "Primary" */ val primary: primary with java.lang.String = js.native
  /* "Secondary" */ val secondary: secondary with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartAxisGroup with java.lang.String] = js.native
}

