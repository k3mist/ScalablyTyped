package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A container for the ink in a word in a paragraph.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait InkWordLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the ID of the InkWord object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The id of the recognized language in this ink word. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The parent paragraph containing the ink word.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[ParagraphLoadOptions] = js.undefined
  /**
    *
    * The words that were recognized in this ink word, in order of likelihood. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var wordAlternates: js.UndefOr[scala.Boolean] = js.undefined
}

object InkWordLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    languageId: js.UndefOr[scala.Boolean] = js.undefined,
    paragraph: ParagraphLoadOptions = null,
    wordAlternates: js.UndefOr[scala.Boolean] = js.undefined
  ): InkWordLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(languageId)) __obj.updateDynamic("languageId")(languageId)
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph)
    if (!js.isUndefined(wordAlternates)) __obj.updateDynamic("wordAlternates")(wordAlternates)
    __obj.asInstanceOf[InkWordLoadOptions]
  }
}

