package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Objects implementing this interface provide an URL to the root of an installed package.
  * @since OOo 2.3
  */
trait XPackageInformationProvider extends js.Object {
  /** returns a list of all installed extension with their version. */
  val ExtensionList: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]]
  /** returns a list of all installed extension with their version. */
  def getExtensionList(): activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]]
  /**
    * get Package information for a specific extension.
    * @param extensionId the unique identifier of an extension. The service looks for an installed package with the given id and returns the URL to the root o
    */
  def getPackageLocation(extensionId: java.lang.String): java.lang.String
  /**
    * check if there are updates available for an extension.
    * @param extensionId the unique identifier of an extension. When the extensionId is empty, the service looks checks all installed extensions for a newer v
    */
  def isUpdateAvailable(extensionId: java.lang.String): activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]]
}

object XPackageInformationProvider {
  @scala.inline
  def apply(
    ExtensionList: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]],
    getExtensionList: js.Function0[
      activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]]
    ],
    getPackageLocation: js.Function1[java.lang.String, java.lang.String],
    isUpdateAvailable: js.Function1[
      java.lang.String, 
      activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]]
    ]
  ): XPackageInformationProvider = {
    val __obj = js.Dynamic.literal(ExtensionList = ExtensionList, getExtensionList = getExtensionList, getPackageLocation = getPackageLocation, isUpdateAvailable = isUpdateAvailable)
  
    __obj.asInstanceOf[XPackageInformationProvider]
  }
}

