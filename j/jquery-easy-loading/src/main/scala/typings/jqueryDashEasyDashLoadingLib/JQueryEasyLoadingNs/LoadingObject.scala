package typings
package jqueryDashEasyDashLoadingLib.JQueryEasyLoadingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingObject extends js.Object {
  /**
    * Check whether the loading state is active or not
    *
    * @return {Boolean}
    */
  def active(): scala.Boolean
  /**
    * Attach some internal methods to external events
    * e.g. overlay click, window resize etc
    */
  def attachMethodsToExternalEvents(): scala.Unit
  /**
    * Attach the handlers defined on `options` for the respective events
    */
  def attachOptionsHandlers(): scala.Unit
  /**
    * Calculate the z-index for the default overlay element
    * Return the z-index passed as setting to the plugin or calculate it
    * based on the target's z-index
    */
  def calcZIndex(): scala.Double
  /**
    * Return a new default overlay
    *
    * @return {jQuery} A new overlay already appended to the page's body
    */
  def createOerlay(): jqueryDashEasyDashLoadingLib.JQuery
  /**
    * Initializes the overlay and attach handlers to the appropriate events
    */
  def init(): scala.Unit
  /**
    * Reposition the overlay on the top of the target element
    * This method needs to be called if the target element changes position
    *  or dimension
    */
  def resize(): scala.Unit
  /**
    * Trigger the `loading.start` event and turn on the loading state
    */
  def start(): scala.Unit
  /**
    * Trigger the `loading.stop` event and turn off the loading state
    */
  def stop(): scala.Unit
  /**
    * Toggle the state of the loading overlay
    */
  def toggle(): scala.Unit
}

object LoadingObject {
  @scala.inline
  def apply(
    active: js.Function0[scala.Boolean],
    attachMethodsToExternalEvents: js.Function0[scala.Unit],
    attachOptionsHandlers: js.Function0[scala.Unit],
    calcZIndex: js.Function0[scala.Double],
    createOerlay: js.Function0[jqueryDashEasyDashLoadingLib.JQuery],
    init: js.Function0[scala.Unit],
    resize: js.Function0[scala.Unit],
    start: js.Function0[scala.Unit],
    stop: js.Function0[scala.Unit],
    toggle: js.Function0[scala.Unit]
  ): LoadingObject = {
    val __obj = js.Dynamic.literal(active = active, attachMethodsToExternalEvents = attachMethodsToExternalEvents, attachOptionsHandlers = attachOptionsHandlers, calcZIndex = calcZIndex, createOerlay = createOerlay, init = init, resize = resize, start = start, stop = stop, toggle = toggle)
  
    __obj.asInstanceOf[LoadingObject]
  }
}

