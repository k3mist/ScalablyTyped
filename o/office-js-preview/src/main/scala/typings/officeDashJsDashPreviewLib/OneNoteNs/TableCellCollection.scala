package typings
package officeDashJsDashPreviewLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains a collection of TableCell objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.TableCellCollection")
@js.native
class TableCellCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableCellCollection: RequestContext = js.native
  /**
    *
    * Returns the number of tablecells in this collection. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val count: scala.Double = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[TableCell] = js.native
  def getItem(index: java.lang.String): TableCell = js.native
  /**
    *
    * Gets a table cell object by ID or by its index in the collection. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param index A number that identifies the index location of a table cell object.
    */
  def getItem(index: scala.Double): TableCell = js.native
  /**
    *
    * Gets a tablecell at its position in the collection.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: scala.Double): TableCell = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.TableCellCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.TableCellCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.TableCellCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableCellCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs.TableCellCollectionLoadOptions with officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs.CollectionLoadOptions
  ): TableCellCollection = js.native
  def load(option: java.lang.String): TableCellCollection = js.native
  def load(option: js.Array[java.lang.String]): TableCellCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): TableCellCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `OneNote.TableCellCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.TableCellCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs.TableCellCollectionData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): TableCellCollection = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): TableCellCollection = js.native
}

