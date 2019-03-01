package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is supported by objects which supply different modes. */
trait XModeSelector
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the current mode. */
  var Mode: java.lang.String
  /** @returns a sequence of all supported modes. */
  val SupportedModes: activexDashInteropLib.SafeArray[java.lang.String]
  /** @returns the current mode. */
  def getMode(): java.lang.String
  /** @returns a sequence of all supported modes. */
  def getSupportedModes(): activexDashInteropLib.SafeArray[java.lang.String]
  /** sets a new mode for the implementing object. */
  def setMode(aMode: java.lang.String): scala.Unit
  /** asks whether a mode is supported or not. */
  def supportsMode(aMode: java.lang.String): scala.Boolean
}

object XModeSelector {
  @scala.inline
  def apply(
    Mode: java.lang.String,
    SupportedModes: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    getMode: js.Function0[java.lang.String],
    getSupportedModes: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setMode: js.Function1[java.lang.String, scala.Unit],
    supportsMode: js.Function1[java.lang.String, scala.Boolean]
  ): XModeSelector = {
    val __obj = js.Dynamic.literal(Mode = Mode, SupportedModes = SupportedModes, acquire = acquire, getMode = getMode, getSupportedModes = getSupportedModes, queryInterface = queryInterface, release = release, setMode = setMode, supportsMode = supportsMode)
  
    __obj.asInstanceOf[XModeSelector]
  }
}

