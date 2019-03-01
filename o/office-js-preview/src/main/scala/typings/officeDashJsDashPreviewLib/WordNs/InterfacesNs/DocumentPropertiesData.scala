package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "documentProperties.toJSON()". */
trait DocumentPropertiesData extends js.Object {
  /**
    *
    * Gets the application name of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var applicationName: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the author of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var author: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the category of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the comments of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var comments: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the company of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var company: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the creation date of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var creationDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    *
    * Gets the collection of custom properties of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var customProperties: js.UndefOr[js.Array[CustomPropertyData]] = js.undefined
  /**
    *
    * Gets or sets the format of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the keywords of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var keywords: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the last author of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var lastAuthor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the last print date of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var lastPrintDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    *
    * Gets the last save time of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var lastSaveTime: js.UndefOr[stdLib.Date] = js.undefined
  /**
    *
    * Gets or sets the manager of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var manager: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the revision number of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var revisionNumber: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the security of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var security: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the subject of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var subject: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the template of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the title of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object DocumentPropertiesData {
  @scala.inline
  def apply(
    applicationName: java.lang.String = null,
    author: java.lang.String = null,
    category: java.lang.String = null,
    comments: java.lang.String = null,
    company: java.lang.String = null,
    creationDate: stdLib.Date = null,
    customProperties: js.Array[CustomPropertyData] = null,
    format: java.lang.String = null,
    keywords: java.lang.String = null,
    lastAuthor: java.lang.String = null,
    lastPrintDate: stdLib.Date = null,
    lastSaveTime: stdLib.Date = null,
    manager: java.lang.String = null,
    revisionNumber: java.lang.String = null,
    security: scala.Int | scala.Double = null,
    subject: java.lang.String = null,
    template: java.lang.String = null,
    title: java.lang.String = null
  ): DocumentPropertiesData = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName)
    if (author != null) __obj.updateDynamic("author")(author)
    if (category != null) __obj.updateDynamic("category")(category)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (company != null) __obj.updateDynamic("company")(company)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (customProperties != null) __obj.updateDynamic("customProperties")(customProperties)
    if (format != null) __obj.updateDynamic("format")(format)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (lastAuthor != null) __obj.updateDynamic("lastAuthor")(lastAuthor)
    if (lastPrintDate != null) __obj.updateDynamic("lastPrintDate")(lastPrintDate)
    if (lastSaveTime != null) __obj.updateDynamic("lastSaveTime")(lastSaveTime)
    if (manager != null) __obj.updateDynamic("manager")(manager)
    if (revisionNumber != null) __obj.updateDynamic("revisionNumber")(revisionNumber)
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (template != null) __obj.updateDynamic("template")(template)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DocumentPropertiesData]
  }
}

