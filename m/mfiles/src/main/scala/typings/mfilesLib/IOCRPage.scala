package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRPage extends js.Object {
  var OCRZones: IOCRZones
  var PageNum: scala.Double
  def Clone(): IOCRPage
}

object IOCRPage {
  @scala.inline
  def apply(Clone: () => IOCRPage, OCRZones: IOCRZones, PageNum: scala.Double): IOCRPage = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), OCRZones = OCRZones, PageNum = PageNum)
  
    __obj.asInstanceOf[IOCRPage]
  }
}

