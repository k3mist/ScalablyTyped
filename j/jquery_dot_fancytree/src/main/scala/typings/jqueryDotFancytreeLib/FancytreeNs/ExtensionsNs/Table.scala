package typings
package jqueryDotFancytreeLib.FancytreeNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define table-extension options
  */
trait Table
  extends /**
  * Support misc options
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Render the checkboxes into the this column index (default: nodeColumnIdx)
    */
  var checkboxColumnIdx: js.Any
  /**
    * Indent every node level by 16px; default: 16
    */
  var indentation: scala.Double
  /**
    * Render node expander, icon, and title to this column (default: 0)
    */
  var nodeColumnIdx: scala.Double
}

object Table {
  @scala.inline
  def apply(
    checkboxColumnIdx: js.Any,
    indentation: scala.Double,
    nodeColumnIdx: scala.Double,
    StringDictionary: /**
    * Support misc options
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Table = {
    val __obj = js.Dynamic.literal(checkboxColumnIdx = checkboxColumnIdx, indentation = indentation, nodeColumnIdx = nodeColumnIdx)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Table]
  }
}

