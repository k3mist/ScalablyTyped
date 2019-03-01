package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * The Document object is the top level object. A Document object contains one or more sections, content controls, and the body that contains the contents of the document.
  *
  * [Api set: WordApi 1.1]
  */
trait DocumentLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates that, when opening a new document, whether it is allowed to close this document even if this document is untitled. True to close, false otherwise.
    *
    * [Api set: WordApi]
    */
  var allowCloseOnUntitled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc..
    *
    * [Api set: WordApi 1.1]
    */
  var body: js.UndefOr[BodyLoadOptions] = js.undefined
  /**
    *
    * Gets the properties of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var properties: js.UndefOr[DocumentPropertiesLoadOptions] = js.undefined
  /**
    *
    * Indicates whether the changes in the document have been saved. A value of true indicates that the document hasn't changed since it was saved. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var saved: js.UndefOr[scala.Boolean] = js.undefined
}

object DocumentLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    allowCloseOnUntitled: js.UndefOr[scala.Boolean] = js.undefined,
    body: BodyLoadOptions = null,
    properties: DocumentPropertiesLoadOptions = null,
    saved: js.UndefOr[scala.Boolean] = js.undefined
  ): DocumentLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(allowCloseOnUntitled)) __obj.updateDynamic("allowCloseOnUntitled")(allowCloseOnUntitled)
    if (body != null) __obj.updateDynamic("body")(body)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (!js.isUndefined(saved)) __obj.updateDynamic("saved")(saved)
    __obj.asInstanceOf[DocumentLoadOptions]
  }
}

