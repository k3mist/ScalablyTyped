package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an item that can be pressed, swiped, and dragged.
  **/
@JSGlobal("WinJS.UI.ItemContainer")
@js.native
//#region Constructors
/**
  * Creates a new ItemContainer.
  * @constructor
  * @param element The DOM element hosts the new ItemContainer. For the ItemContainer to be accessible, this element must have its role attribute set to "list" or "listbox". If tapBehavior is set to none and selectionDisabled is true, then use the "list" role; otherwise, use the "listbox" role.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class ItemContainer () extends js.Object {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets a value that specifies whether the item can be dragged.
    **/
  var draggable: scala.Boolean = js.native
  /**
    * Gets the element that hosts this ItemContainer.
    **/
  var element: stdLib.HTMLElement = js.native
  /**
    * Gets or sets a value that specifies whether the item is selected.
    **/
  var selected: scala.Boolean = js.native
  /**
    * Gets or sets a value that specifies whether selection of this item is disabled.
    **/
  var selectionDisabled: scala.Boolean = js.native
  /**
    * Gets or sets how the ItemContainer reacts to the swipe gesture. The swipe gesture can select the swiped items or can have no effect on the current selection.
    **/
  var swipeBehavior: SwipeBehavior = js.native
  /**
    * Gets or sets the orientation of swipe gestures.
    **/
  var swipeOrientation: Orientation = js.native
  /**
    * Gets or sets how the ItemContainer reacts when the user taps or clicks an item.
    **/
  var tapBehavior: TapBehavior = js.native
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle. Note that you drop the "on" when specifying the event name. For example, instead of specifying "onclick", you specify "click".
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function): scala.Unit = js.native
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
  /**
    * Releases resources held by this ItemContainer. Call this method when the ItemContainer is no longer needed. After calling this method, the ItemContainer becomes unusable.
    **/
  def dispose(): scala.Unit = js.native
  /**
    * Forces the ItemContainer to update its layout. Call this function when the reading direction of the app changes after the control has been initialized.
    **/
  def forceLayout(): scala.Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Raised when the item is invoked. (You can use the tapBehavior property to specify whether taps and clicks invoke the item.)
    * @param eventInfo An object that contains information about the event.
    **/
  def oninvoked(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Raised after the item is selected or deselected.
    * @param eventInfo An object that contains information about the event.
    **/
  def onselectionchanged(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Raised just before the current selection changes.
    * @param eventInfo An object that contains information about the event.
    **/
  def onselectionchanging(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function): scala.Unit = js.native
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("WinJS.UI.ItemContainer")
@js.native
object ItemContainer extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: scala.Boolean = js.native
}

