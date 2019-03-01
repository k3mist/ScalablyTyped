package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes version clashes of a deployment unit.
  *
  * This exception is intended to be used with an {@link com.sun.star.task.XInteractionHandler} .
  * @since OOo 2.1
  */
trait VersionException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /**
    * represents the already installed version of the deployment unit.
    *
    * Must not be `NULL` .
    */
  var Deployed: XPackage
  /** the display name of the extension which is being installed. */
  var NewDisplayName: java.lang.String
  /** the version of the extension which is being installed. */
  var NewVersion: java.lang.String
}

object VersionException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Deployed: XPackage,
    Message: java.lang.String,
    NewDisplayName: java.lang.String,
    NewVersion: java.lang.String
  ): VersionException = {
    val __obj = js.Dynamic.literal(Context = Context, Deployed = Deployed, Message = Message, NewDisplayName = NewDisplayName, NewVersion = NewVersion)
  
    __obj.asInstanceOf[VersionException]
  }
}

