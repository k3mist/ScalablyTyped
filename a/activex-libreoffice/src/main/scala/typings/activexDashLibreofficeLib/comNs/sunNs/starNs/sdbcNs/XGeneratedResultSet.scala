package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a result set which gives access to automatically generated values after a new row was inserted.
  *
  * The relative order of columns in the result set returned by {@link getGeneratedValues()} must be the same as the relative order of the same columns as
  * returned when executing a "SELECT * FROM table". This ensures that clients of this interface can reliably fetch the column values.
  * @see com.sun.star.sdbc.Statement
  * @see com.sun.star.sdbc.PreparedStatement
  * @since OOo 1.1.2
  */
trait XGeneratedResultSet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * gives access to automatically generated values after a new row was inserted.
    * @returns a result set that contains the data produced by the query
    * @throws SQLException if a database access error occurs.
    */
  val GeneratedValues: XResultSet
  /**
    * gives access to automatically generated values after a new row was inserted.
    * @returns a result set that contains the data produced by the query
    * @throws SQLException if a database access error occurs.
    */
  def getGeneratedValues(): XResultSet
}

object XGeneratedResultSet {
  @scala.inline
  def apply(
    GeneratedValues: XResultSet,
    acquire: () => scala.Unit,
    getGeneratedValues: () => XResultSet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XGeneratedResultSet = {
    val __obj = js.Dynamic.literal(GeneratedValues = GeneratedValues, acquire = js.Any.fromFunction0(acquire), getGeneratedValues = js.Any.fromFunction0(getGeneratedValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XGeneratedResultSet]
  }
}

