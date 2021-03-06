package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for accessing and setting the permissions of a user for a database object.
  * @see com.sun.star.sdbcx.PrivilegeObject
  * @see com.sun.star.sdbcx.Privilege
  */
trait XAuthorizable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieves the permissions for a specific object, which could be granted to other users and groups.
    * @param objName the name of the object
    * @param objType a value of {@link com.sun.star.sdbcx.PrivilegeObject}
    * @returns the grant privileges
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getGrantablePrivileges(objName: java.lang.String, objType: scala.Double): scala.Double
  /**
    * retrieves the permissions for a specific object.
    * @param objName the name of the object
    * @param objType a value of {@link com.sun.star.sdbcx.PrivilegeObject}
    * @returns the privileges
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getPrivileges(objName: java.lang.String, objType: scala.Double): scala.Double
  /**
    * adds additional permissions for a specific object.
    * @param objName the name of the object
    * @param objType a value from the {@link com.sun.star.sdbcx.PrivilegeObject} constants group
    * @param objPrivileges a value from the {@link com.sun.star.sdbcx.Privilege} constants group
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def grantPrivileges(objName: java.lang.String, objType: scala.Double, objPrivileges: scala.Double): scala.Unit
  /**
    * removes permissions for a specific object from a group or user.
    * @param objName the name of the object
    * @param objType a value from the {@link com.sun.star.sdbcx.PrivilegeObject} constants group
    * @param objPrivileges a value from the {@link com.sun.star.sdbcx.Privilege} constants group
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def revokePrivileges(objName: java.lang.String, objType: scala.Double, objPrivileges: scala.Double): scala.Unit
}

object XAuthorizable {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getGrantablePrivileges: (java.lang.String, scala.Double) => scala.Double,
    getPrivileges: (java.lang.String, scala.Double) => scala.Double,
    grantPrivileges: (java.lang.String, scala.Double, scala.Double) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    revokePrivileges: (java.lang.String, scala.Double, scala.Double) => scala.Unit
  ): XAuthorizable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getGrantablePrivileges = js.Any.fromFunction2(getGrantablePrivileges), getPrivileges = js.Any.fromFunction2(getPrivileges), grantPrivileges = js.Any.fromFunction3(grantPrivileges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), revokePrivileges = js.Any.fromFunction3(revokePrivileges))
  
    __obj.asInstanceOf[XAuthorizable]
  }
}

