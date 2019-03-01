package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a component implementing a log handler whose output channel is the processes console.
  * @since OOo 2.3
  */
trait ConsoleHandler extends XConsoleHandler {
  def create(): scala.Unit
  /**
    * creates an instance of the log handler, using generic settings
    * @param Settings contains the initial settings for the log handler  The following settings are recognized and supported: `Encoding` - denotes the initial
    * @throws com::sun::star::lang::IllegalArgumentException if `Settings` contains arguments with names other than in the list above, or settings whose value
    */
  def createWithSettings(
    Settings: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  ): scala.Unit
}

object ConsoleHandler {
  @scala.inline
  def apply(
    Encoding: java.lang.String,
    Formatter: XLogFormatter,
    Level: scala.Double,
    Threshold: scala.Double,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    create: js.Function0[scala.Unit],
    createWithSettings: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      scala.Unit
    ],
    dispose: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    publish: js.Function1[LogRecord, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): ConsoleHandler = {
    val __obj = js.Dynamic.literal(Encoding = Encoding, Formatter = Formatter, Level = Level, Threshold = Threshold, acquire = acquire, addEventListener = addEventListener, create = create, createWithSettings = createWithSettings, dispose = dispose, flush = flush, publish = publish, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[ConsoleHandler]
  }
}

