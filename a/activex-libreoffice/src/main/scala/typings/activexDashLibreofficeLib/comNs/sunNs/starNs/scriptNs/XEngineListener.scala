package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive events from a scripting engine.
  * @deprecated Deprecated
  */
trait XEngineListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** gets fired when the script execution has finished. */
  def finished(Evt: FinishEngineEvent): scala.Unit
  /**
    * gets fired when an interrupt occurs during the script execution.
    *
    * If you call the method, the execution stops. So in this situation, the stack and variable values are still available by using the appropriate {@link
    * XDebugging} methods.
    */
  def interrupt(Evt: InterruptEngineEvent): scala.Unit
  /** gets fired when the script gets into execution state. */
  def running(Evt: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XEngineListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    finished: FinishEngineEvent => scala.Unit,
    interrupt: InterruptEngineEvent => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    running: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit
  ): XEngineListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), finished = js.Any.fromFunction1(finished), interrupt = js.Any.fromFunction1(interrupt), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), running = js.Any.fromFunction1(running))
  
    __obj.asInstanceOf[XEngineListener]
  }
}

