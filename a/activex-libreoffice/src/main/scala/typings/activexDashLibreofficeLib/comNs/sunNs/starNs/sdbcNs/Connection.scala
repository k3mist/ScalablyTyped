package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a connection (session) with a specific database. Within the context of a {@link Connection} , SQL statements are executed and results are
  * returned.
  *
  * A {@link Connection} 's database is able to provide information describing its tables, its supported SQL grammar, its stored procedures, and the
  * capabilities of this connection. This information is obtained with the {@link com.sun.star.sdbc.XConnection.getMetaData()} method.
  *
  * ** Note: ** By default the {@link Connection} automatically commits changes after executing each statement. If auto commit has been disabled, an
  * explicit commit must be done or database changes will not be saved.
  * @see com.sun.star.sdbc.XStatement
  * @see com.sun.star.sdbc.XResultSet
  * @see com.sun.star.sdbc.XDatabaseMetaData
  */
trait Connection
  extends XConnection
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XWarningsSupplier

object Connection {
  @scala.inline
  def apply(
    AutoCommit: scala.Boolean,
    Catalog: java.lang.String,
    MetaData: XDatabaseMetaData,
    TransactionIsolation: scala.Double,
    TypeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Warnings: js.Any,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    clearWarnings: js.Function0[scala.Unit],
    close: js.Function0[scala.Unit],
    commit: js.Function0[scala.Unit],
    createStatement: js.Function0[XStatement],
    dispose: js.Function0[scala.Unit],
    getAutoCommit: js.Function0[scala.Boolean],
    getCatalog: js.Function0[java.lang.String],
    getMetaData: js.Function0[XDatabaseMetaData],
    getTransactionIsolation: js.Function0[scala.Double],
    getTypeMap: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getWarnings: js.Function0[js.Any],
    isClosed: js.Function0[scala.Boolean],
    isReadOnly: js.Function0[scala.Boolean],
    nativeSQL: js.Function1[java.lang.String, java.lang.String],
    prepareCall: js.Function1[java.lang.String, XPreparedStatement],
    prepareStatement: js.Function1[java.lang.String, XPreparedStatement],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    rollback: js.Function0[scala.Unit],
    setAutoCommit: js.Function1[scala.Boolean, scala.Unit],
    setCatalog: js.Function1[java.lang.String, scala.Unit],
    setReadOnly: js.Function1[scala.Boolean, scala.Unit],
    setTransactionIsolation: js.Function1[scala.Double, scala.Unit],
    setTypeMap: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess, scala.Unit]
  ): Connection = {
    val __obj = js.Dynamic.literal(AutoCommit = AutoCommit, Catalog = Catalog, MetaData = MetaData, TransactionIsolation = TransactionIsolation, TypeMap = TypeMap, Warnings = Warnings, acquire = acquire, addEventListener = addEventListener, clearWarnings = clearWarnings, close = close, commit = commit, createStatement = createStatement, dispose = dispose, getAutoCommit = getAutoCommit, getCatalog = getCatalog, getMetaData = getMetaData, getTransactionIsolation = getTransactionIsolation, getTypeMap = getTypeMap, getWarnings = getWarnings, isClosed = isClosed, isReadOnly = isReadOnly, nativeSQL = nativeSQL, prepareCall = prepareCall, prepareStatement = prepareStatement, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, rollback = rollback, setAutoCommit = setAutoCommit, setCatalog = setCatalog, setReadOnly = setReadOnly, setTransactionIsolation = setTransactionIsolation, setTypeMap = setTypeMap)
  
    __obj.asInstanceOf[Connection]
  }
}

