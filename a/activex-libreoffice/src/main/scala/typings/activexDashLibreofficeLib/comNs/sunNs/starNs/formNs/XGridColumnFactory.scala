package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to create columns to be added into a grid control model.
  *
  * Grid columns (more precise: models of grid columns) are direct children of the grid control model they belong to. Grid columns can't be created on a
  * global service factory, instead, you need to create them on the grid, where you want to insert them later on.
  * @see com.sun.star.form.component.GridControl
  */
trait XGridColumnFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns a list of available column types.
    * @returns a list of column types.
    */
  val ColumnTypes: stdLib.SafeArray[java.lang.String]
  /**
    * creates a new column object
    * @param aColumnType the type of column to be created
    * @returns the new column object
    * @throws com::sun::star::lang::IllegalArgumentException if aColumnType is not available.
    */
  def createColumn(aColumnType: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * returns a list of available column types.
    * @returns a list of column types.
    */
  def getColumnTypes(): stdLib.SafeArray[java.lang.String]
}

object XGridColumnFactory {
  @scala.inline
  def apply(
    ColumnTypes: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    createColumn: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getColumnTypes: () => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XGridColumnFactory = {
    val __obj = js.Dynamic.literal(ColumnTypes = ColumnTypes, acquire = js.Any.fromFunction0(acquire), createColumn = js.Any.fromFunction1(createColumn), getColumnTypes = js.Any.fromFunction0(getColumnTypes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XGridColumnFactory]
  }
}

