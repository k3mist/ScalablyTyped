package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** main interface for an interprocess bridge. */
trait XBridge
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** a unique descriptive string: protocol + ":" + XConnection.getDescription() */
  val Description: java.lang.String
  /** name that the bridge got when it was created. */
  val Name: java.lang.String
  /** a unique descriptive string: protocol + ":" + XConnection.getDescription() */
  def getDescription(): java.lang.String
  /**
    * tries to get an interface from the remote that is known by this name.
    *
    * In general, this method is called once to get the initial object from the remote, but it is allowed to call the method multiple times.
    * @param sInstanceName The name of the object, that shall be retrieved from the remote process. The call is delegated to {@link com.sun.star.bridge.XInsta
    * @see com.sun.star.bridge.XInstanceProvider
    */
  def getInstance(sInstanceName: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /** name that the bridge got when it was created. */
  def getName(): java.lang.String
}

object XBridge {
  @scala.inline
  def apply(
    Description: java.lang.String,
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getDescription: js.Function0[java.lang.String],
    getInstance: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XBridge = {
    val __obj = js.Dynamic.literal(Description = Description, Name = Name, acquire = acquire, getDescription = getDescription, getInstance = getInstance, getName = getName, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XBridge]
  }
}

