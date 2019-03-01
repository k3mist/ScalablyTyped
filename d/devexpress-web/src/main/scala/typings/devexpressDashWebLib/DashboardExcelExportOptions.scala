package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains options related to exporting a dashboard/dashboard item to the Excel format.
  */
trait DashboardExcelExportOptions extends js.Object {
  /**
    * Gets or sets a character used to separate values in a CSV document.
    * Value: A string value that specifies the character used to separate values in a CSV document.
    */
  var CsvValueSeparator: java.lang.String
  /**
    * Gets or sets the position of the dashboard state (such as master filter or current parameter values) in the exported document.
    * Value: A DashboardStateExcelExportPosition object that specifies the position of the dashboard state in the exported document.
    */
  var DashboardStatePosition: java.lang.String
  /**
    * Gets or sets whether to add the state of master filter items to the exported document.
    * Value: true, to add the state of master filter items to the exported document; otherwise, false.
    */
  var ExportFilters: scala.Boolean
  /**
    * Gets or sets whether to add current parameter values to the exported document.
    * Value: true, to add current parameter values to the exported document; otherwise, false.
    */
  var ExportParameters: scala.Boolean
  /**
    * Gets or sets the Excel format in which the dashboard item is exported.
    * Value: A DashboardExportExcelFormat value that specifies the Excel format in which the dashboard item is exported.
    */
  var Format: java.lang.String
  /**
    * Gets or sets whether to add current values of a hidden parameter to the exported document.
    * Value: true, to add current values of a hidden parameter to the exported document; otherwise, false.
    */
  var IncludeHiddenParameters: scala.Boolean
}

object DashboardExcelExportOptions {
  @scala.inline
  def apply(
    CsvValueSeparator: java.lang.String,
    DashboardStatePosition: java.lang.String,
    ExportFilters: scala.Boolean,
    ExportParameters: scala.Boolean,
    Format: java.lang.String,
    IncludeHiddenParameters: scala.Boolean
  ): DashboardExcelExportOptions = {
    val __obj = js.Dynamic.literal(CsvValueSeparator = CsvValueSeparator, DashboardStatePosition = DashboardStatePosition, ExportFilters = ExportFilters, ExportParameters = ExportParameters, Format = Format, IncludeHiddenParameters = IncludeHiddenParameters)
  
    __obj.asInstanceOf[DashboardExcelExportOptions]
  }
}

