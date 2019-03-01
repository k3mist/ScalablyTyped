package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewLocation extends js.Object {
  var OverlappedFolder: ITypedValue
  var Overlapping: scala.Boolean
  var ParentFolder: IFolderDefs
  def Clone(): IViewLocation
}

object IViewLocation {
  @scala.inline
  def apply(
    Clone: js.Function0[IViewLocation],
    OverlappedFolder: ITypedValue,
    Overlapping: scala.Boolean,
    ParentFolder: IFolderDefs
  ): IViewLocation = {
    val __obj = js.Dynamic.literal(Clone = Clone, OverlappedFolder = OverlappedFolder, Overlapping = Overlapping, ParentFolder = ParentFolder)
  
    __obj.asInstanceOf[IViewLocation]
  }
}

