package typings
package winjsLib.winjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides functions for accessing resources and localizing content.
**/
@JSImport("winjs", "Resources")
@js.native
object ResourcesNs extends js.Object {
  //#region Functions
  /**
    * Registers an event handler for the specified event. Use this method to register for events that are related to resources, such as when the app's language, scale, or contrast changes.
    * @param type The name of the event to handle.
    * @param listener The listener (event handler function) to associate with the event.
    * @param useCapture Set to true to register the listener for the capturing phase; otherwise, set to false to register the listener for the bubbling phase.
    **/
  def addEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
    * Raises an event of the specified type and with the specified additional properties.
    * @param type The name of the event to raise.
    * @param details The set of additional properties to attach to the event object.
    **/
  def dispatchEvent(`type`: java.lang.String, details: js.Any): scala.Unit = js.native
  /**
    * Retrieves the resource string that has the specified resource identifier.
    * @param resourceId The resource ID of the string to retrieve.
    * @returns An object that can contain these properties: value, empty, lang.
    **/
  def getString(resourceId: java.lang.String): winjsLib.Anon_Empty = js.native
  //#endregion Functions
  //#region Events
  /**
    * Occurs when the user changes the system's language or contrast, or the scale of the display, or when the user changes any of the items in the current context's qualifier values list. For more info about the current context's qualifier values list, see the Remarks section.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.qualifier, detail.changed.
    **/
  def oncontextchanged(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Processes data-win-res attributes on elements and replaces attributes and properties with resource strings.
    * @param rootElement The element to process. The element and its child elements will be processed. If an element isn't specified, the entire document is processed.
    **/
  def processAll(): winjsLib.WinJSNs.Promise[scala.Unit] = js.native
  def processAll(rootElement: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[scala.Unit] = js.native
  /**
    * Removes an event listener that the addEventListener method registered.
    * @param type The name of the event that the event listener is registered for.
    * @param listener The listener (event handler function) to remove.
    * @param useCapture Set to true to remove the capturing phase listener; set to false to remove the bubbling phase listener.
    **/
  def removeEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
}

