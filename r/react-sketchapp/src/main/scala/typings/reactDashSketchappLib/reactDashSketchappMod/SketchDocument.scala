package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchDocument extends js.Object {
  def addBlankPage(): SketchPage
  def currentPage(): SketchPage
  def documentData(): SketchDocumentData
  def pages(): js.Array[SketchPage]
}

object SketchDocument {
  @scala.inline
  def apply(
    addBlankPage: js.Function0[SketchPage],
    currentPage: js.Function0[SketchPage],
    documentData: js.Function0[SketchDocumentData],
    pages: js.Function0[js.Array[SketchPage]]
  ): SketchDocument = {
    val __obj = js.Dynamic.literal(addBlankPage = addBlankPage, currentPage = currentPage, documentData = documentData, pages = pages)
  
    __obj.asInstanceOf[SketchDocument]
  }
}

