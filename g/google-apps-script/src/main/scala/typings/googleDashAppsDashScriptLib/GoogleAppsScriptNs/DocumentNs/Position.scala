package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  def getElement(): Element
  def getOffset(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getSurroundingText(): Text
  def getSurroundingTextOffset(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def insertBookmark(): Bookmark
  def insertInlineImage(image: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): InlineImage
  def insertText(text: java.lang.String): Text
}

object Position {
  @scala.inline
  def apply(
    getElement: js.Function0[Element],
    getOffset: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getSurroundingText: js.Function0[Text],
    getSurroundingTextOffset: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    insertBookmark: js.Function0[Bookmark],
    insertInlineImage: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource, InlineImage],
    insertText: js.Function1[java.lang.String, Text]
  ): Position = {
    val __obj = js.Dynamic.literal(getElement = getElement, getOffset = getOffset, getSurroundingText = getSurroundingText, getSurroundingTextOffset = getSurroundingTextOffset, insertBookmark = insertBookmark, insertInlineImage = insertInlineImage, insertText = insertText)
  
    __obj.asInstanceOf[Position]
  }
}

