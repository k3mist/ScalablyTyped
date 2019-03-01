package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stack entry for runtime errors and assertions.
  */
trait CallFrame extends js.Object {
  /**
    * JavaScript script column number (0-based).
    */
  var columnNumber: scala.Double
  /**
    * JavaScript function name.
    */
  var functionName: java.lang.String
  /**
    * JavaScript script line number (0-based).
    */
  var lineNumber: scala.Double
  /**
    * JavaScript script id.
    */
  var scriptId: ScriptId
  /**
    * JavaScript script name or url.
    */
  var url: java.lang.String
}

object CallFrame {
  @scala.inline
  def apply(
    columnNumber: scala.Double,
    functionName: java.lang.String,
    lineNumber: scala.Double,
    scriptId: ScriptId,
    url: java.lang.String
  ): CallFrame = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber, functionName = functionName, lineNumber = lineNumber, scriptId = scriptId, url = url)
  
    __obj.asInstanceOf[CallFrame]
  }
}

