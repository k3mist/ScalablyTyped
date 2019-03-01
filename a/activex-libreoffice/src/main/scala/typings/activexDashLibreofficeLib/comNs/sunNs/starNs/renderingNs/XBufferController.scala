package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface providing access to double/multi-buffer facilities of screen devices.
  *
  * This interface provides methods to enable and control double/multi-buffering facilities on screen devices.
  * @since OOo 2.0
  */
trait XBufferController
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Create the given number of background buffers.
    *
    * There's one buffer implicitly available, which is the canvas surface itself. Thus, calling `createBuffers(1)` creates a double-buffered object.
    * @param nBuffers The number of background<buffers requested. Must be greater than 0.
    * @returns the number of actually generated buffers, which might be between 0 (no double-buffering available) and nBuffers.
    * @throws com::sun::star::lang::IllegalArgumentException if nBuffers is smaller than one.
    */
  def createBuffers(nBuffers: scala.Double): scala.Double
  /** Destroy all buffers generated via this object. */
  def destroyBuffers(): scala.Unit
  /**
    * Switch the display to show the specified buffer.
    *
    * The method returns, when the switch is performed and the selected buffer is shown on screen, or immediately when an error occurs. If the switch was
    * successful, subsequent render operations will be directed to the new backbuffer.
    *
    * Use this method if you need your screen display to be in sync with other things, e.g. sound playback.
    * @param bUpdateAll When `TRUE` , update the whole screen. When `FALSE` , implementation is permitted to restrict update to areas the canvas itself change
    * @returns whether the switch was performed successfully.
    * @throws com::sun::star::lang::IllegalArgumentException if nBuffer is outside the permissible range.
    */
  def showBuffer(bUpdateAll: scala.Boolean): scala.Boolean
  /**
    * Schedule the display of the specified buffer.
    *
    * The method returns, when the switching of the buffer is successfully scheduled, or immediately when an error occurs. If the switch was successful,
    * subsequent render operations will be directed to the new backbuffer. Note that, if the buffer switching is exceedingly slow, or the frequency of
    * {@link switchBuffer()} is exceedingly high, the buffer scheduled for display here might become the current render target **before** it is fully
    * displayed on screen. In this case, any rendering operation to this buffer will block, until it is safe to perform the operation without visible
    * cluttering.
    *
    * Use this method if you favor maximal render speed, but don't necessarily require your screen display to be in sync with other things, e.g. sound
    * playback.
    * @param bUpdateAll When `TRUE` , update the whole screen. When `FALSE` , implementation is permitted to restrict update to areas the canvas itself change
    * @returns whether the switch was performed successfully.
    */
  def switchBuffer(bUpdateAll: scala.Boolean): scala.Boolean
}

object XBufferController {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createBuffers: js.Function1[scala.Double, scala.Double],
    destroyBuffers: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    showBuffer: js.Function1[scala.Boolean, scala.Boolean],
    switchBuffer: js.Function1[scala.Boolean, scala.Boolean]
  ): XBufferController = {
    val __obj = js.Dynamic.literal(acquire = acquire, createBuffers = createBuffers, destroyBuffers = destroyBuffers, queryInterface = queryInterface, release = release, showBuffer = showBuffer, switchBuffer = switchBuffer)
  
    __obj.asInstanceOf[XBufferController]
  }
}

