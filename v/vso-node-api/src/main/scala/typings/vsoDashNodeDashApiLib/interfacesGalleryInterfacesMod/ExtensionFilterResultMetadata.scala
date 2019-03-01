package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionFilterResultMetadata extends js.Object {
  /**
    * The metadata items for the category
    */
  var metadataItems: js.Array[MetadataItem]
  /**
    * Defines the category of metadata items
    */
  var metadataType: java.lang.String
}

object ExtensionFilterResultMetadata {
  @scala.inline
  def apply(metadataItems: js.Array[MetadataItem], metadataType: java.lang.String): ExtensionFilterResultMetadata = {
    val __obj = js.Dynamic.literal(metadataItems = metadataItems, metadataType = metadataType)
  
    __obj.asInstanceOf[ExtensionFilterResultMetadata]
  }
}

