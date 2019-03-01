package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a range of indexes or keys in an ISelection.
  **/
trait ISelectionRange extends js.Object {
  //#region Properties
  /**
    * Gets or sets the index of the first item in the range.
    **/
  var firstIndex: scala.Double
  /**
    * Gets or sets the key of the first item in the range.
    **/
  var firstKey: js.Any
  /**
    * Gets or sets the index of the last item in the range.
    **/
  var lastIndex: scala.Double
  /**
    * Gets or sets of the key of the last item in the range.
    **/
  var lastKey: js.Any
}

object ISelectionRange {
  @scala.inline
  def apply(firstIndex: scala.Double, firstKey: js.Any, lastIndex: scala.Double, lastKey: js.Any): ISelectionRange = {
    val __obj = js.Dynamic.literal(firstIndex = firstIndex, firstKey = firstKey, lastIndex = lastIndex, lastKey = lastKey)
  
    __obj.asInstanceOf[ISelectionRange]
  }
}

