package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows to save passwords with URL-pattern, to use them later. */
trait XPasswordContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Save passwords in to the container.
    * @param Url URL-pattern, that will be used later to retrieve passwords.
    * @param UserName The username.
    * @param Passwords The password-list.
    * @param Handler The handler to get super password to en/decrypt passwords
    */
  def add(
    Url: java.lang.String,
    UserName: java.lang.String,
    Passwords: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    Handler: XInteractionHandler
  ): scala.Unit
  /**
    * Save passwords in to the container, and store them in the file.
    * @param Url URL-pattern, that will be used later to retrieve passwords.
    * @param UserName The username.
    * @param Passwords The password-list.
    * @param Handler The handler to get super password to en/decrypt passwords
    */
  def addPersistent(
    Url: java.lang.String,
    UserName: java.lang.String,
    Passwords: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    Handler: XInteractionHandler
  ): scala.Unit
  /**
    * Find users with passwords for the url pattern.
    * @param Url URL-pattern to retrieve password for.
    * @param Handler The handler to get super password to en/decrypt passwords
    * @returns Best matched url-pattern with user-records list.
    */
  def find(Url: java.lang.String, Handler: XInteractionHandler): UrlRecord
  /**
    * Find passwords for the url pattern and username.
    * @param Url URL-pattern to retrieve passwords for.
    * @param UserName Username to retrieve passwords for.
    * @param Handler The handler to get super password to en/decrypt passwords
    * @returns Best matched url-pattern for the username.
    */
  def findForName(Url: java.lang.String, UserName: java.lang.String, Handler: XInteractionHandler): UrlRecord
  /**
    * Get all records from the file.
    * @returns List of url-records.
    */
  def getAllPersistent(Handler: XInteractionHandler): activexDashInteropLib.SafeArray[UrlRecord]
  /**
    * Remove passwords for the url pattern and username.
    * @param Url URL-pattern to remove passwords for.
    * @param UserName Username to remove passwords for.
    */
  def remove(Url: java.lang.String, UserName: java.lang.String): scala.Unit
  /** Clean the file. */
  def removeAllPersistent(): scala.Unit
  /**
    * Remove passwords for the url pattern and username from the file.
    * @param Url URL-pattern to remove passwords for.
    * @param UserName Username to remove passwords for.
    */
  def removePersistent(Url: java.lang.String, UserName: java.lang.String): scala.Unit
}

object XPasswordContainer {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    add: js.Function4[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      XInteractionHandler, 
      scala.Unit
    ],
    addPersistent: js.Function4[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      XInteractionHandler, 
      scala.Unit
    ],
    find: js.Function2[java.lang.String, XInteractionHandler, UrlRecord],
    findForName: js.Function3[java.lang.String, java.lang.String, XInteractionHandler, UrlRecord],
    getAllPersistent: js.Function1[XInteractionHandler, activexDashInteropLib.SafeArray[UrlRecord]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    removeAllPersistent: js.Function0[scala.Unit],
    removePersistent: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): XPasswordContainer = {
    val __obj = js.Dynamic.literal(acquire = acquire, add = add, addPersistent = addPersistent, find = find, findForName = findForName, getAllPersistent = getAllPersistent, queryInterface = queryInterface, release = release, remove = remove, removeAllPersistent = removeAllPersistent, removePersistent = removePersistent)
  
    __obj.asInstanceOf[XPasswordContainer]
  }
}

