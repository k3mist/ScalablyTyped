package typings
package wordDashExtractorLib.wordDashExtractorMod.WordExtractorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  def getAnnotations(): java.lang.String
  def getBody(): java.lang.String
  def getEndNotes(): java.lang.String
  def getFootnotes(): java.lang.String
  def getHeaders(): java.lang.String
}

object Document {
  @scala.inline
  def apply(
    getAnnotations: js.Function0[java.lang.String],
    getBody: js.Function0[java.lang.String],
    getEndNotes: js.Function0[java.lang.String],
    getFootnotes: js.Function0[java.lang.String],
    getHeaders: js.Function0[java.lang.String]
  ): Document = {
    val __obj = js.Dynamic.literal(getAnnotations = getAnnotations, getBody = getBody, getEndNotes = getEndNotes, getFootnotes = getFootnotes, getHeaders = getHeaders)
  
    __obj.asInstanceOf[Document]
  }
}

