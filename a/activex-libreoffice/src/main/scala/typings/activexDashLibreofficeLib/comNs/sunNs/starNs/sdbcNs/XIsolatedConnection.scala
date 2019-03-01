package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for establishing isolated connections via a factory.
  *
  * The {@link XIsolatedConnection} allows to create connections which are not shared among others as it is the case when creating connections in normal
  * way.
  * @see com.sun.star.sdb.DataSource
  * @since OOo 1.1.2
  */
trait XIsolatedConnection
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * attempts to establish a database connection.
    * @param user The user name.
    * @param password The password.
    * @returns A connection which is not shared.
    * @throws com::sun::star::sdbc::SQLException when an error occurs.
    */
  def getIsolatedConnection(user: java.lang.String, password: java.lang.String): XConnection
  /**
    * attempts to establish a database connection.
    *
    * If information is missing, such as a user's password, they are completed by user interaction.
    * @param handler The handler which ask for the needed information when they are missing.
    * @returns A connection which is not shared.
    * @throws com::sun::star::sdbc::SQLException when an error occurs.
    */
  def getIsolatedConnectionWithCompletion(handler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler): XConnection
}

object XIsolatedConnection {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getIsolatedConnection: js.Function2[java.lang.String, java.lang.String, XConnection],
    getIsolatedConnectionWithCompletion: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler, 
      XConnection
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XIsolatedConnection = {
    val __obj = js.Dynamic.literal(acquire = acquire, getIsolatedConnection = getIsolatedConnection, getIsolatedConnectionWithCompletion = getIsolatedConnectionWithCompletion, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XIsolatedConnection]
  }
}

