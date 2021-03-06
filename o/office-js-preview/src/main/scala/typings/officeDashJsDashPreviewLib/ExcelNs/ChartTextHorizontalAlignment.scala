package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartTextHorizontalAlignment extends js.Object

/**
  *
  * Represents the horizontal alignment for the specified object.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTextHorizontalAlignment")
@js.native
object ChartTextHorizontalAlignment extends js.Object {
  @js.native
  sealed trait center
    extends officeDashJsDashPreviewLib.ExcelNs.ChartTextHorizontalAlignment
  
  @js.native
  sealed trait distributed
    extends officeDashJsDashPreviewLib.ExcelNs.ChartTextHorizontalAlignment
  
  @js.native
  sealed trait justify
    extends officeDashJsDashPreviewLib.ExcelNs.ChartTextHorizontalAlignment
  
  @js.native
  sealed trait left
    extends officeDashJsDashPreviewLib.ExcelNs.ChartTextHorizontalAlignment
  
  @js.native
  sealed trait right
    extends officeDashJsDashPreviewLib.ExcelNs.ChartTextHorizontalAlignment
  
  /* "Center" */ val center: center with java.lang.String = js.native
  /* "Distributed" */ val distributed: distributed with java.lang.String = js.native
  /* "Justify" */ val justify: justify with java.lang.String = js.native
  /* "Left" */ val left: left with java.lang.String = js.native
  /* "Right" */ val right: right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartTextHorizontalAlignment with java.lang.String
  ] = js.native
}

