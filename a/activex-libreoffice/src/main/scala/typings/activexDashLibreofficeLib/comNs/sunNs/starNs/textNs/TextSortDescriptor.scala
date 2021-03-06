package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes sort criteria for sorting text.
  * @deprecated Deprecated
  */
trait TextSortDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SortDescriptor {
  /** contains the character that marks the separation of columns. */
  var Delimiter: java.lang.String
  /** determines if the sorting in the first search key is done in ascending or descending order. */
  var IsSortAscending0: scala.Boolean
  /** determines if the sorting in the second search key is done in ascending or descending order. */
  var IsSortAscending1: scala.Boolean
  /** determines if the sorting in the third search key is done in ascending or descending order. */
  var IsSortAscending2: scala.Boolean
  /** determines if the content of a table is to be sorted. */
  var IsSortInTable: scala.Boolean
  /** determines if the sorting in the first search key is done numeric or alphanumeric order. */
  var IsSortNumeric0: scala.Boolean
  /** determines if the sorting in the second search key is done in numeric or alphanumeric order. */
  var IsSortNumeric1: scala.Boolean
  /** determines if the sorting in the third search key is done in numeric or alphanumeric order. */
  var IsSortNumeric2: scala.Boolean
  /** contains the row or column index used in the first search key. */
  var SortRowOrColumnNo0: scala.Double
  /** contains the row or column index used in the second search key. */
  var SortRowOrColumnNo1: scala.Double
  /** contains the row or column index used in the third search key. */
  var SortRowOrColumnNo2: scala.Double
}

object TextSortDescriptor {
  @scala.inline
  def apply(
    CollatorAlgorithm: java.lang.String,
    CollatorLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Delimiter: java.lang.String,
    IsCaseSensitive: scala.Boolean,
    IsSortAscending0: scala.Boolean,
    IsSortAscending1: scala.Boolean,
    IsSortAscending2: scala.Boolean,
    IsSortInTable: scala.Boolean,
    IsSortNumeric0: scala.Boolean,
    IsSortNumeric1: scala.Boolean,
    IsSortNumeric2: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SortAscending: scala.Boolean,
    SortColumns: scala.Boolean,
    SortRowOrColumnNo0: scala.Double,
    SortRowOrColumnNo1: scala.Double,
    SortRowOrColumnNo2: scala.Double,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): TextSortDescriptor = {
    val __obj = js.Dynamic.literal(CollatorAlgorithm = CollatorAlgorithm, CollatorLocale = CollatorLocale, Delimiter = Delimiter, IsCaseSensitive = IsCaseSensitive, IsSortAscending0 = IsSortAscending0, IsSortAscending1 = IsSortAscending1, IsSortAscending2 = IsSortAscending2, IsSortInTable = IsSortInTable, IsSortNumeric0 = IsSortNumeric0, IsSortNumeric1 = IsSortNumeric1, IsSortNumeric2 = IsSortNumeric2, PropertySetInfo = PropertySetInfo, SortAscending = SortAscending, SortColumns = SortColumns, SortRowOrColumnNo0 = SortRowOrColumnNo0, SortRowOrColumnNo1 = SortRowOrColumnNo1, SortRowOrColumnNo2 = SortRowOrColumnNo2, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[TextSortDescriptor]
  }
}

