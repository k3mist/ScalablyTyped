package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartLineStyle extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartLineStyle")
@js.native
object ChartLineStyle extends js.Object {
  @js.native
  sealed trait automatic
    extends officeDashJsLib.ExcelNs.ChartLineStyle
  
  @js.native
  sealed trait continuous
    extends officeDashJsLib.ExcelNs.ChartLineStyle
  
  @js.native
  sealed trait dash
    extends officeDashJsLib.ExcelNs.ChartLineStyle
  
  @js.native
  sealed trait dashDot
    extends officeDashJsLib.ExcelNs.ChartLineStyle
  
  @js.native
  sealed trait dashDotDot
    extends officeDashJsLib.ExcelNs.ChartLineStyle
  
  @js.native
  sealed trait dot
    extends officeDashJsLib.ExcelNs.ChartLineStyle
  
  @js.native
  sealed trait grey25
    extends officeDashJsLib.ExcelNs.ChartLineStyle
  
  @js.native
  sealed trait grey50
    extends officeDashJsLib.ExcelNs.ChartLineStyle
  
  @js.native
  sealed trait grey75
    extends officeDashJsLib.ExcelNs.ChartLineStyle
  
  @js.native
  sealed trait none
    extends officeDashJsLib.ExcelNs.ChartLineStyle
  
  @js.native
  sealed trait roundDot
    extends officeDashJsLib.ExcelNs.ChartLineStyle
  
  /* "Automatic" */ val automatic: automatic with java.lang.String = js.native
  /* "Continuous" */ val continuous: continuous with java.lang.String = js.native
  /* "Dash" */ val dash: dash with java.lang.String = js.native
  /* "DashDot" */ val dashDot: dashDot with java.lang.String = js.native
  /* "DashDotDot" */ val dashDotDot: dashDotDot with java.lang.String = js.native
  /* "Dot" */ val dot: dot with java.lang.String = js.native
  /* "Grey25" */ val grey25: grey25 with java.lang.String = js.native
  /* "Grey50" */ val grey50: grey50 with java.lang.String = js.native
  /* "Grey75" */ val grey75: grey75 with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "RoundDot" */ val roundDot: roundDot with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartLineStyle with java.lang.String] = js.native
}

