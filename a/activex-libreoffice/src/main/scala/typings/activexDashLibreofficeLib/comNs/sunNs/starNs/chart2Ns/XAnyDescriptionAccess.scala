package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Offers any access to column and row descriptions. This allows to set date values as categories.
  *
  * Can be obtained from interface {@link XChartDocument} via method {@link getData()} .
  * @since OOo 3.4
  */
trait XAnyDescriptionAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XComplexDescriptionAccess {
  /**
    * retrieves the descriptions for all columns.
    * @returns a sequence of sequences of anys representing the descriptions of all columns. The outer index represents different columns. The inner index repre
    */
  val AnyColumnDescriptions: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]]
  /**
    * retrieves the descriptions for all rows.
    * @returns a sequence of sequences of anys representing the descriptions of all rows. The outer index represents different rows. The inner index represents
    */
  val AnyRowDescriptions: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]]
  /**
    * retrieves the descriptions for all columns.
    * @returns a sequence of sequences of anys representing the descriptions of all columns. The outer index represents different columns. The inner index repre
    */
  def getAnyColumnDescriptions(): activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]]
  /**
    * retrieves the descriptions for all rows.
    * @returns a sequence of sequences of anys representing the descriptions of all rows. The outer index represents different rows. The inner index represents
    */
  def getAnyRowDescriptions(): activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]]
  /**
    * sets the descriptions for all columns.
    * @param rColumnDescriptions a sequence of sequences of anys which represent the descriptions of all columns. The outer index represents different columns
    */
  def setAnyColumnDescriptions(
    rColumnDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]
  ): scala.Unit
  /**
    * sets the descriptions for all rows.
    * @param rRowDescriptions a sequence of sequences of anys representing the descriptions of all rows. The outer index represents different rows. The inner
    */
  def setAnyRowDescriptions(
    rRowDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]
  ): scala.Unit
}

object XAnyDescriptionAccess {
  @scala.inline
  def apply(
    AnyColumnDescriptions: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]],
    AnyRowDescriptions: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]],
    ColumnDescriptions: activexDashInteropLib.SafeArray[java.lang.String],
    ComplexColumnDescriptions: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]],
    ComplexRowDescriptions: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]],
    Data: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[scala.Double]],
    NotANumber: scala.Double,
    RowDescriptions: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    addChartDataChangeEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XChartDataChangeEventListener, 
      scala.Unit
    ],
    getAnyColumnDescriptions: js.Function0[activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]]],
    getAnyRowDescriptions: js.Function0[activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]]],
    getColumnDescriptions: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getComplexColumnDescriptions: js.Function0[
      activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]]
    ],
    getComplexRowDescriptions: js.Function0[
      activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]]
    ],
    getData: js.Function0[activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[scala.Double]]],
    getNotANumber: js.Function0[scala.Double],
    getRowDescriptions: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    isNotANumber: js.Function1[scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChartDataChangeEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XChartDataChangeEventListener, 
      scala.Unit
    ],
    setAnyColumnDescriptions: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]], 
      scala.Unit
    ],
    setAnyRowDescriptions: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]], 
      scala.Unit
    ],
    setColumnDescriptions: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setComplexColumnDescriptions: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]], 
      scala.Unit
    ],
    setComplexRowDescriptions: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]], 
      scala.Unit
    ],
    setData: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Unit
    ],
    setRowDescriptions: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit]
  ): XAnyDescriptionAccess = {
    val __obj = js.Dynamic.literal(AnyColumnDescriptions = AnyColumnDescriptions, AnyRowDescriptions = AnyRowDescriptions, ColumnDescriptions = ColumnDescriptions, ComplexColumnDescriptions = ComplexColumnDescriptions, ComplexRowDescriptions = ComplexRowDescriptions, Data = Data, NotANumber = NotANumber, RowDescriptions = RowDescriptions, acquire = acquire, addChartDataChangeEventListener = addChartDataChangeEventListener, getAnyColumnDescriptions = getAnyColumnDescriptions, getAnyRowDescriptions = getAnyRowDescriptions, getColumnDescriptions = getColumnDescriptions, getComplexColumnDescriptions = getComplexColumnDescriptions, getComplexRowDescriptions = getComplexRowDescriptions, getData = getData, getNotANumber = getNotANumber, getRowDescriptions = getRowDescriptions, isNotANumber = isNotANumber, queryInterface = queryInterface, release = release, removeChartDataChangeEventListener = removeChartDataChangeEventListener, setAnyColumnDescriptions = setAnyColumnDescriptions, setAnyRowDescriptions = setAnyRowDescriptions, setColumnDescriptions = setColumnDescriptions, setComplexColumnDescriptions = setComplexColumnDescriptions, setComplexRowDescriptions = setComplexRowDescriptions, setData = setData, setRowDescriptions = setRowDescriptions)
  
    __obj.asInstanceOf[XAnyDescriptionAccess]
  }
}

