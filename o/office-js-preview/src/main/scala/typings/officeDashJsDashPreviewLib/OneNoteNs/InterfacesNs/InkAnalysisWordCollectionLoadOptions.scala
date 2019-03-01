package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of InkAnalysisWord objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait InkAnalysisWordCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the InkAnalysisWord object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The id of the recognized language in this inkAnalysisWord. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Reference to the parent InkAnalysisLine.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var line: js.UndefOr[InkAnalysisLineLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Weak references to the ink strokes that were recognized as part of this ink analysis word. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var strokePointers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The words that were recognized in this ink word, in order of likelihood. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var wordAlternates: js.UndefOr[scala.Boolean] = js.undefined
}

object InkAnalysisWordCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    languageId: js.UndefOr[scala.Boolean] = js.undefined,
    line: InkAnalysisLineLoadOptions = null,
    strokePointers: js.UndefOr[scala.Boolean] = js.undefined,
    wordAlternates: js.UndefOr[scala.Boolean] = js.undefined
  ): InkAnalysisWordCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(languageId)) __obj.updateDynamic("languageId")(languageId)
    if (line != null) __obj.updateDynamic("line")(line)
    if (!js.isUndefined(strokePointers)) __obj.updateDynamic("strokePointers")(strokePointers)
    if (!js.isUndefined(wordAlternates)) __obj.updateDynamic("wordAlternates")(wordAlternates)
    __obj.asInstanceOf[InkAnalysisWordCollectionLoadOptions]
  }
}

