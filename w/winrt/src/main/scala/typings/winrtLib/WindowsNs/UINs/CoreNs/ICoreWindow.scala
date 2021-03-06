package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindow extends js.Object {
  var automationHostProvider: js.Any
  var bounds: winrtLib.WindowsNs.FoundationNs.Rect
  var customProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  var dispatcher: CoreDispatcher
  var flowDirection: CoreWindowFlowDirection
  var isInputEnabled: scala.Boolean
  var onactivated: js.Any
  var onautomationproviderrequested: js.Any
  var oncharacterreceived: js.Any
  var onclosed: js.Any
  var oninputenabled: js.Any
  var onkeydown: js.Any
  var onkeyup: js.Any
  var onpointercapturelost: js.Any
  var onpointerentered: js.Any
  var onpointerexited: js.Any
  var onpointermoved: js.Any
  var onpointerpressed: js.Any
  var onpointerreleased: js.Any
  var onpointerwheelchanged: js.Any
  var onsizechanged: js.Any
  var ontouchhittesting: js.Any
  var onvisibilitychanged: js.Any
  var pointerCursor: CoreCursor
  var pointerPosition: winrtLib.WindowsNs.FoundationNs.Point
  var visible: scala.Boolean
  def activate(): scala.Unit
  def close(): scala.Unit
  def getAsyncKeyState(virtualKey: winrtLib.WindowsNs.SystemNs.VirtualKey): CoreVirtualKeyStates
  def getKeyState(virtualKey: winrtLib.WindowsNs.SystemNs.VirtualKey): CoreVirtualKeyStates
  def releasePointerCapture(): scala.Unit
  def setPointerCapture(): scala.Unit
}

object ICoreWindow {
  @scala.inline
  def apply(
    activate: () => scala.Unit,
    automationHostProvider: js.Any,
    bounds: winrtLib.WindowsNs.FoundationNs.Rect,
    close: () => scala.Unit,
    customProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet,
    dispatcher: CoreDispatcher,
    flowDirection: CoreWindowFlowDirection,
    getAsyncKeyState: winrtLib.WindowsNs.SystemNs.VirtualKey => CoreVirtualKeyStates,
    getKeyState: winrtLib.WindowsNs.SystemNs.VirtualKey => CoreVirtualKeyStates,
    isInputEnabled: scala.Boolean,
    onactivated: js.Any,
    onautomationproviderrequested: js.Any,
    oncharacterreceived: js.Any,
    onclosed: js.Any,
    oninputenabled: js.Any,
    onkeydown: js.Any,
    onkeyup: js.Any,
    onpointercapturelost: js.Any,
    onpointerentered: js.Any,
    onpointerexited: js.Any,
    onpointermoved: js.Any,
    onpointerpressed: js.Any,
    onpointerreleased: js.Any,
    onpointerwheelchanged: js.Any,
    onsizechanged: js.Any,
    ontouchhittesting: js.Any,
    onvisibilitychanged: js.Any,
    pointerCursor: CoreCursor,
    pointerPosition: winrtLib.WindowsNs.FoundationNs.Point,
    releasePointerCapture: () => scala.Unit,
    setPointerCapture: () => scala.Unit,
    visible: scala.Boolean
  ): ICoreWindow = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), automationHostProvider = automationHostProvider, bounds = bounds, close = js.Any.fromFunction0(close), customProperties = customProperties, dispatcher = dispatcher, flowDirection = flowDirection, getAsyncKeyState = js.Any.fromFunction1(getAsyncKeyState), getKeyState = js.Any.fromFunction1(getKeyState), isInputEnabled = isInputEnabled, onactivated = onactivated, onautomationproviderrequested = onautomationproviderrequested, oncharacterreceived = oncharacterreceived, onclosed = onclosed, oninputenabled = oninputenabled, onkeydown = onkeydown, onkeyup = onkeyup, onpointercapturelost = onpointercapturelost, onpointerentered = onpointerentered, onpointerexited = onpointerexited, onpointermoved = onpointermoved, onpointerpressed = onpointerpressed, onpointerreleased = onpointerreleased, onpointerwheelchanged = onpointerwheelchanged, onsizechanged = onsizechanged, ontouchhittesting = ontouchhittesting, onvisibilitychanged = onvisibilitychanged, pointerCursor = pointerCursor, pointerPosition = pointerPosition, releasePointerCapture = js.Any.fromFunction0(releasePointerCapture), setPointerCapture = js.Any.fromFunction0(setPointerCapture), visible = visible)
  
    __obj.asInstanceOf[ICoreWindow]
  }
}

