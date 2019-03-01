package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JavaScript call frame. Array of call frames form the call stack.
  */
trait CallFrame extends js.Object {
  /**
    * Call frame identifier. This identifier is only valid while the virtual machine is paused.
    */
  var callFrameId: CallFrameId
  /**
    * Location in the source code.
    */
  var functionLocation: js.UndefOr[Location] = js.undefined
  /**
    * Name of the JavaScript function called on this call frame.
    */
  var functionName: java.lang.String
  /**
    * Location in the source code.
    */
  var location: Location
  /**
    * The value being returned, if the function is at return point.
    */
  var returnValue: js.UndefOr[nodeLib.inspectorMod.RuntimeNs.RemoteObject] = js.undefined
  /**
    * Scope chain for this call frame.
    */
  var scopeChain: js.Array[Scope]
  /**
    * `this` object for this call frame.
    */
  var `this`: nodeLib.inspectorMod.RuntimeNs.RemoteObject
  /**
    * JavaScript script name or url.
    */
  var url: java.lang.String
}

object CallFrame {
  @scala.inline
  def apply(
    callFrameId: CallFrameId,
    functionName: java.lang.String,
    location: Location,
    scopeChain: js.Array[Scope],
    `this`: nodeLib.inspectorMod.RuntimeNs.RemoteObject,
    url: java.lang.String,
    functionLocation: Location = null,
    returnValue: nodeLib.inspectorMod.RuntimeNs.RemoteObject = null
  ): CallFrame = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId, functionName = functionName, location = location, scopeChain = scopeChain, `this` = `this`, url = url)
    if (functionLocation != null) __obj.updateDynamic("functionLocation")(functionLocation)
    if (returnValue != null) __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[CallFrame]
  }
}

