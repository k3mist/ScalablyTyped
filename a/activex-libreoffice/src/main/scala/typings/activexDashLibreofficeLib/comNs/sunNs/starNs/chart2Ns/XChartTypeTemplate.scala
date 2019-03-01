package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XChartTypeTemplate
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val DataInterpreter: XDataInterpreter
  /**
    * Applies a chart-type specific style (e.g. symbols) to all series in the sequence aSeries.
    * @param xSeries a single data series to which a style will be applied
    * @param nChartTypeGroupIndex Denotes in which chart-type group the series lies, such this method can apply different styles for different chart-type groups
    * @param nSeriesIndex The index of the series inside the current chart-type group. nSeriesIndex does not uniquely identify a data series alone, but only t
    * @param nSeriesCount The number of series in the current chart-type group.
    */
  def applyStyle(
    xSeries: XDataSeries,
    nChartTypeGroupIndex: scala.Double,
    nSeriesIndex: scala.Double,
    nSeriesCount: scala.Double
  ): scala.Unit
  /**
    * Analyses the given diagram and reinterprets its {@link DataSeries} and Categories and creates a new diagram based on these series.
    *
    * Note, that if {@link matchesTemplate()} returns `TRUE` for the given {@link XDiagram} , the latter should not be changed.
    * @param xDiagram The diagram given will be modified such that it represents this {@link ChartTypeTemplate} .
    */
  def changeDiagram(xDiagram: XDiagram): scala.Unit
  /**
    * Changes the given diagram `xDiagram` by using the new data given in `xDataSource` .
    *
    * Note that the data is interpreted in a way that fits this template, but not necessarily the chart-types of the diagram. This method should only be
    * called if the data-format of the diagram is compatible with the data-format of this template.
    *
    * Ideally a {@link matchesTemplate()} call for the given diagram should return `TRUE` before this method is called.
    * @param xDiagram The diagram to be changed.
    * @param xDataSource This data source will be interpreted in a chart-type specific way and the {@link DataSeries} found in `xDiagram` will be adapted to t
    * @param aArguments Arguments that tell the template how to slice the given range. The properties should be defined in a separate service.  For standard p
    */
  def changeDiagramData(
    xDiagram: XDiagram,
    xDataSource: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource,
    aArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * Creates a new diagram based upon the given data .
    * @param xDataSource This data source will be interpreted in a chart-type specific way and appropriate {@link DataSeries} will be created which serve as i
    * @param aArguments Arguments that tell the template how to slice the given range. The properties should be defined in a separate service.  For standard p
    * @returns The new diagram which represents this {@link ChartTypeTemplate} .
    */
  def createDiagramByDataSource(
    xDataSource: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource,
    aArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): XDiagram
  /**
    * Provides a chart type object that can be used to create new series.
    * @param aFormerlyUsedChartTypes The list can be used to copy some aspects from old chart types during the creation of a new chart type. The list might be
    */
  def getChartTypeForNewSeries(aFormerlyUsedChartTypes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XChartType]): XChartType
  def getDataInterpreter(): XDataInterpreter
  /**
    * States whether the given diagram could have been created by the template.
    *
    * The template will parse the DataSeriesTree of the diagram to determine if the structure matches the one which would have been created by {@link
    * createDiagramByDataSource()} .
    *
    * For analysis all parts of the diagram may be used, e.g. also properties set at the data series (like symbols)./p>
    * @param xDiagram The diagram to be analyzed.
    * @param bAdaptProperties If `TRUE` the properties of the template are set, such that the template matches more accurately. E.g. for a line-chart with sym
    * @returns `TRUE` if the diagram given is structurally identical to a diagram that was created using {@link createDiagramByDataSource()} or {@link changeDia
    */
  def matchesTemplate(xDiagram: XDiagram, bAdaptProperties: scala.Boolean): scala.Boolean
  /**
    * Resets all styles that were changed from the default at any object in the chart and have not been later modified.
    *
    * In {@link createDiagramByDataSource()} or {@link changeDiagram()} a template might e.g. change the page background color or the line style of all data
    * series. This method should reset all objects that still have the changed settings to the default.
    *
    * If for example the template changed the {@link com.sun.star.drawing.LineStyle} of all series to NONE, this method should reset all series with
    * LineStyle NONE back to SOLID. If a series has a style DASH, it must not be changed.
    */
  def resetStyles(xDiagram: XDiagram): scala.Unit
  /** @returns `TRUE` if the template does support categories */
  def supportsCategories(): scala.Boolean
}

object XChartTypeTemplate {
  @scala.inline
  def apply(
    DataInterpreter: XDataInterpreter,
    acquire: js.Function0[scala.Unit],
    applyStyle: js.Function4[XDataSeries, scala.Double, scala.Double, scala.Double, scala.Unit],
    changeDiagram: js.Function1[XDiagram, scala.Unit],
    changeDiagramData: js.Function3[
      XDiagram, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    createDiagramByDataSource: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      XDiagram
    ],
    getChartTypeForNewSeries: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XChartType], XChartType],
    getDataInterpreter: js.Function0[XDataInterpreter],
    matchesTemplate: js.Function2[XDiagram, scala.Boolean, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    resetStyles: js.Function1[XDiagram, scala.Unit],
    supportsCategories: js.Function0[scala.Boolean]
  ): XChartTypeTemplate = {
    val __obj = js.Dynamic.literal(DataInterpreter = DataInterpreter, acquire = acquire, applyStyle = applyStyle, changeDiagram = changeDiagram, changeDiagramData = changeDiagramData, createDiagramByDataSource = createDiagramByDataSource, getChartTypeForNewSeries = getChartTypeForNewSeries, getDataInterpreter = getDataInterpreter, matchesTemplate = matchesTemplate, queryInterface = queryInterface, release = release, resetStyles = resetStyles, supportsCategories = supportsCategories)
  
    __obj.asInstanceOf[XChartTypeTemplate]
  }
}

