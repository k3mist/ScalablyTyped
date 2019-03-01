package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContentLibraryList...
  */
trait IContentLibraryList extends js.Object {
  /**
    * Information about the content library.
    */
  var qItems: IContentLibraryListItem
}

object IContentLibraryList {
  @scala.inline
  def apply(qItems: IContentLibraryListItem): IContentLibraryList = {
    val __obj = js.Dynamic.literal(qItems = qItems)
  
    __obj.asInstanceOf[IContentLibraryList]
  }
}

