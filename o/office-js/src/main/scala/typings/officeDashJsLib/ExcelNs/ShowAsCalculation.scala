package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShowAsCalculation extends js.Object

/**
  *
  * The ShowAs Calculation function for the Data Pivot Field.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ShowAsCalculation")
@js.native
object ShowAsCalculation extends js.Object {
  /**
    *
    * Difference from the specified Base Field and Base Item.
    *
    */
  @js.native
  sealed trait differenceFrom
    extends officeDashJsLib.ExcelNs.ShowAsCalculation
  
  /**
    *
    * Calculates the values as follows:
    ((value in cell) x (Grand Total of Grand Totals)) / ((Grand Row Total) x (Grand Column Total))
    *
    */
  @js.native
  sealed trait index
    extends officeDashJsLib.ExcelNs.ShowAsCalculation
  
  /**
    *
    * No calculation is applied.
    *
    */
  @js.native
  sealed trait none
    extends officeDashJsLib.ExcelNs.ShowAsCalculation
  
  /**
    *
    * Difference from the specified Base Field and Base Item.
    *
    */
  @js.native
  sealed trait percentDifferenceFrom
    extends officeDashJsLib.ExcelNs.ShowAsCalculation
  
  /**
    *
    * Percent of the specified Base Field and Base Item.
    *
    */
  @js.native
  sealed trait percentOf
    extends officeDashJsLib.ExcelNs.ShowAsCalculation
  
  /**
    *
    * Percent of the column total.
    *
    */
  @js.native
  sealed trait percentOfColumnTotal
    extends officeDashJsLib.ExcelNs.ShowAsCalculation
  
  /**
    *
    * Percent of the grand total.
    *
    */
  @js.native
  sealed trait percentOfGrandTotal
    extends officeDashJsLib.ExcelNs.ShowAsCalculation
  
  /**
    *
    * Percent of the column total for the specified Base Field.
    *
    */
  @js.native
  sealed trait percentOfParentColumnTotal
    extends officeDashJsLib.ExcelNs.ShowAsCalculation
  
  /**
    *
    * Percent of the row total for the specified Base Field.
    *
    */
  @js.native
  sealed trait percentOfParentRowTotal
    extends officeDashJsLib.ExcelNs.ShowAsCalculation
  
  /**
    *
    * Percent of the grand total for the specified Base Field.
    *
    */
  @js.native
  sealed trait percentOfParentTotal
    extends officeDashJsLib.ExcelNs.ShowAsCalculation
  
  /**
    *
    * Percent of the row total.
    *
    */
  @js.native
  sealed trait percentOfRowTotal
    extends officeDashJsLib.ExcelNs.ShowAsCalculation
  
  /**
    *
    * Percent Running Total of the specified Base Field.
    *
    */
  @js.native
  sealed trait percentRunningTotal
    extends officeDashJsLib.ExcelNs.ShowAsCalculation
  
  /**
    *
    * Ascending Rank of the specified Base Field.
    *
    */
  @js.native
  sealed trait rankAscending
    extends officeDashJsLib.ExcelNs.ShowAsCalculation
  
  /**
    *
    * Descending Rank of the specified Base Field.
    *
    */
  @js.native
  sealed trait rankDecending
    extends officeDashJsLib.ExcelNs.ShowAsCalculation
  
  /**
    *
    * Running Total of the specified Base Field.
    *
    */
  @js.native
  sealed trait runningTotal
    extends officeDashJsLib.ExcelNs.ShowAsCalculation
  
  /**
    *
    * Calculation is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown
    extends officeDashJsLib.ExcelNs.ShowAsCalculation
  
  /* "DifferenceFrom" */ val differenceFrom: differenceFrom with java.lang.String = js.native
  /* "Index" */ val index: index with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "PercentDifferenceFrom" */ val percentDifferenceFrom: percentDifferenceFrom with java.lang.String = js.native
  /* "PercentOf" */ val percentOf: percentOf with java.lang.String = js.native
  /* "PercentOfColumnTotal" */ val percentOfColumnTotal: percentOfColumnTotal with java.lang.String = js.native
  /* "PercentOfGrandTotal" */ val percentOfGrandTotal: percentOfGrandTotal with java.lang.String = js.native
  /* "PercentOfParentColumnTotal" */ val percentOfParentColumnTotal: percentOfParentColumnTotal with java.lang.String = js.native
  /* "PercentOfParentRowTotal" */ val percentOfParentRowTotal: percentOfParentRowTotal with java.lang.String = js.native
  /* "PercentOfParentTotal" */ val percentOfParentTotal: percentOfParentTotal with java.lang.String = js.native
  /* "PercentOfRowTotal" */ val percentOfRowTotal: percentOfRowTotal with java.lang.String = js.native
  /* "PercentRunningTotal" */ val percentRunningTotal: percentRunningTotal with java.lang.String = js.native
  /* "RankAscending" */ val rankAscending: rankAscending with java.lang.String = js.native
  /* "RankDecending" */ val rankDecending: rankDecending with java.lang.String = js.native
  /* "RunningTotal" */ val runningTotal: runningTotal with java.lang.String = js.native
  /* "Unknown" */ val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ShowAsCalculation with java.lang.String] = js.native
}

