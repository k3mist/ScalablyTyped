package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLSearch extends js.Object {
  /** This method is used to find and replace all data by workbook in the Spreadsheet.
    * @param {string} Pass the search data.
    * @param {string} Pass the replace data.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with case-sensitive.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with entire cell contents.
    * @returns {void}
    */
  def replaceAllByBook(
    findData: java.lang.String,
    replaceData: java.lang.String,
    isCSen: scala.Boolean,
    isEMatch: scala.Boolean
  ): scala.Unit
  /** This method is used to find and replace all data by sheet in Spreadsheet.
    * @param {string} Pass the search data.
    * @param {string} Pass the replace data.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with case-sensitive.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with entire cell contents.
    * @returns {void}
    */
  def replaceAllBySheet(
    findData: java.lang.String,
    replaceData: java.lang.String,
    isCSen: scala.Boolean,
    isEMatch: scala.Boolean
  ): scala.Unit
}

object XLSearch {
  @scala.inline
  def apply(
    replaceAllByBook: js.Function4[java.lang.String, java.lang.String, scala.Boolean, scala.Boolean, scala.Unit],
    replaceAllBySheet: js.Function4[java.lang.String, java.lang.String, scala.Boolean, scala.Boolean, scala.Unit]
  ): XLSearch = {
    val __obj = js.Dynamic.literal(replaceAllByBook = replaceAllByBook, replaceAllBySheet = replaceAllBySheet)
  
    __obj.asInstanceOf[XLSearch]
  }
}

