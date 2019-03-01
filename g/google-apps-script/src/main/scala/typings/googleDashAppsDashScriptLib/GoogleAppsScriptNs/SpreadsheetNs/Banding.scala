package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Banding extends js.Object {
  def copyTo(range: Range): Banding
  def getFirstColumnColor(): java.lang.String
  def getFirstRowColor(): java.lang.String
  def getFooterColumnColor(): java.lang.String
  def getFooterRowColor(): java.lang.String
  def getHeaderColumnColor(): java.lang.String
  def getHeaderRowColor(): java.lang.String
  def getRange(): Range
  def getSecondColumnColor(): java.lang.String
  def getSecondRowColor(): java.lang.String
  def remove(): scala.Unit
  def setFirstColumnColor(color: java.lang.String): Banding
  def setFirstRowColor(color: java.lang.String): Banding
  def setFooterColumnColor(color: java.lang.String): Banding
  def setFooterRowColor(color: java.lang.String): Banding
  def setHeaderColumnColor(color: java.lang.String): Banding
  def setHeaderRowColor(color: java.lang.String): Banding
  def setRange(range: Range): Banding
  def setSecondColumnColor(color: java.lang.String): Banding
  def setSecondRowColor(color: java.lang.String): Banding
}

object Banding {
  @scala.inline
  def apply(
    copyTo: js.Function1[Range, Banding],
    getFirstColumnColor: js.Function0[java.lang.String],
    getFirstRowColor: js.Function0[java.lang.String],
    getFooterColumnColor: js.Function0[java.lang.String],
    getFooterRowColor: js.Function0[java.lang.String],
    getHeaderColumnColor: js.Function0[java.lang.String],
    getHeaderRowColor: js.Function0[java.lang.String],
    getRange: js.Function0[Range],
    getSecondColumnColor: js.Function0[java.lang.String],
    getSecondRowColor: js.Function0[java.lang.String],
    remove: js.Function0[scala.Unit],
    setFirstColumnColor: js.Function1[java.lang.String, Banding],
    setFirstRowColor: js.Function1[java.lang.String, Banding],
    setFooterColumnColor: js.Function1[java.lang.String, Banding],
    setFooterRowColor: js.Function1[java.lang.String, Banding],
    setHeaderColumnColor: js.Function1[java.lang.String, Banding],
    setHeaderRowColor: js.Function1[java.lang.String, Banding],
    setRange: js.Function1[Range, Banding],
    setSecondColumnColor: js.Function1[java.lang.String, Banding],
    setSecondRowColor: js.Function1[java.lang.String, Banding]
  ): Banding = {
    val __obj = js.Dynamic.literal(copyTo = copyTo, getFirstColumnColor = getFirstColumnColor, getFirstRowColor = getFirstRowColor, getFooterColumnColor = getFooterColumnColor, getFooterRowColor = getFooterRowColor, getHeaderColumnColor = getHeaderColumnColor, getHeaderRowColor = getHeaderRowColor, getRange = getRange, getSecondColumnColor = getSecondColumnColor, getSecondRowColor = getSecondRowColor, remove = remove, setFirstColumnColor = setFirstColumnColor, setFirstRowColor = setFirstRowColor, setFooterColumnColor = setFooterColumnColor, setFooterRowColor = setFooterRowColor, setHeaderColumnColor = setHeaderColumnColor, setHeaderRowColor = setHeaderRowColor, setRange = setRange, setSecondColumnColor = setSecondColumnColor, setSecondRowColor = setSecondRowColor)
  
    __obj.asInstanceOf[Banding]
  }
}

