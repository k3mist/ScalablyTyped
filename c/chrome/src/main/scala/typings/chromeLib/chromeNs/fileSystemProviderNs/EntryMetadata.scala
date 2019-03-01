package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryMetadata extends js.Object {
  /** True if it is a directory. */
  var isDirectory: scala.Boolean
  /** Optional. Mime type for the entry.  */
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  /** The last modified time of this entry. */
  var modificationTime: stdLib.Date
  /** Name of this entry (not full path name). Must not contain '/'. For root it must be empty. */
  var name: java.lang.String
  /** File size in bytes. */
  var size: scala.Double
  /** Optional. Thumbnail image as a data URI in either PNG, JPEG or WEBP format, at most 32 KB in size. Optional, but can be provided only when explicitly requested by the onGetMetadataRequested event.  */
  var thumbnail: js.UndefOr[java.lang.String] = js.undefined
}

object EntryMetadata {
  @scala.inline
  def apply(
    isDirectory: scala.Boolean,
    modificationTime: stdLib.Date,
    name: java.lang.String,
    size: scala.Double,
    mimeType: java.lang.String = null,
    thumbnail: java.lang.String = null
  ): EntryMetadata = {
    val __obj = js.Dynamic.literal(isDirectory = isDirectory, modificationTime = modificationTime, name = name, size = size)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.asInstanceOf[EntryMetadata]
  }
}

