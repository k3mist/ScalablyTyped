package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of Paragraph objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait ParagraphCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the Paragraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the Image object in the Paragraph. Throws an exception if ParagraphType is not Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var image: js.UndefOr[ImageLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the Ink collection in the Paragraph. Throws an exception if ParagraphType is not Ink.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkWords: js.UndefOr[InkWordCollectionLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the Outline object that contains the Paragraph.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var outline: js.UndefOr[OutlineLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The collection of paragraphs under this paragraph. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[ParagraphCollectionLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the parent paragraph object. Throws if a parent paragraph does not exist.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentParagraph: js.UndefOr[ParagraphLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the parent paragraph object. Returns null if a parent paragraph does not exist.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentParagraphOrNull: js.UndefOr[ParagraphLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the TableCell object that contains the Paragraph if one exists. If parent is not a TableCell, throws ItemNotFound.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the TableCell object that contains the Paragraph if one exists. If parent is not a TableCell, returns null.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentTableCellOrNull: js.UndefOr[TableCellLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the RichText object in the Paragraph. Throws an exception if ParagraphType is not RichText.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var richText: js.UndefOr[RichTextLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the Table object in the Paragraph. Throws an exception if ParagraphType is not Table.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var table: js.UndefOr[TableLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the type of the Paragraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[scala.Boolean] = js.undefined
}

object ParagraphCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    image: ImageLoadOptions = null,
    inkWords: InkWordCollectionLoadOptions = null,
    outline: OutlineLoadOptions = null,
    paragraphs: ParagraphCollectionLoadOptions = null,
    parentParagraph: ParagraphLoadOptions = null,
    parentParagraphOrNull: ParagraphLoadOptions = null,
    parentTableCell: TableCellLoadOptions = null,
    parentTableCellOrNull: TableCellLoadOptions = null,
    richText: RichTextLoadOptions = null,
    table: TableLoadOptions = null,
    `type`: js.UndefOr[scala.Boolean] = js.undefined
  ): ParagraphCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (image != null) __obj.updateDynamic("image")(image)
    if (inkWords != null) __obj.updateDynamic("inkWords")(inkWords)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (paragraphs != null) __obj.updateDynamic("paragraphs")(paragraphs)
    if (parentParagraph != null) __obj.updateDynamic("parentParagraph")(parentParagraph)
    if (parentParagraphOrNull != null) __obj.updateDynamic("parentParagraphOrNull")(parentParagraphOrNull)
    if (parentTableCell != null) __obj.updateDynamic("parentTableCell")(parentTableCell)
    if (parentTableCellOrNull != null) __obj.updateDynamic("parentTableCellOrNull")(parentTableCellOrNull)
    if (richText != null) __obj.updateDynamic("richText")(richText)
    if (table != null) __obj.updateDynamic("table")(table)
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ParagraphCollectionLoadOptions]
  }
}

