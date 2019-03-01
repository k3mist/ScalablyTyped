package typings
package officeDashJsDashPreviewLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the document that raised the DataRefreshComplete event.
  *
  * [Api set:  1.1]
  */
trait DataRefreshCompleteEventArgs extends js.Object {
  /**
    *
    * Gets the document object that raised the DataRefreshComplete event.
    *
    * [Api set:  1.1]
    */
  var document: Document
  /**
    *
    * Gets the success or failure of the DataRefreshComplete event.
    *
    * [Api set:  1.1]
    */
  var success: scala.Boolean
}

object DataRefreshCompleteEventArgs {
  @scala.inline
  def apply(document: Document, success: scala.Boolean): DataRefreshCompleteEventArgs = {
    val __obj = js.Dynamic.literal(document = document, success = success)
  
    __obj.asInstanceOf[DataRefreshCompleteEventArgs]
  }
}

